package samsung.abitpro.service;

import org.springframework.stereotype.Service;
import samsung.abitpro.model.FavouriteUniversity;
import samsung.abitpro.model.User;
import samsung.abitpro.model.University;
import samsung.abitpro.repository.FavouriteUniversityRepository;
import samsung.abitpro.repository.UserRepository;
import samsung.abitpro.repository.UniversityRepository;
import java.time.LocalDate;
import java.util.List;

@Service
public class DatabaseFavouriteUniversityService implements FavouriteUniversityService {

    private final FavouriteUniversityRepository favouriteRepository;
    private final UserRepository userRepository;
    private final UniversityRepository universityRepository;

    public DatabaseFavouriteUniversityService(FavouriteUniversityRepository favouriteRepository,
                                              UserRepository userRepository,
                                              UniversityRepository universityRepository) {
        this.favouriteRepository = favouriteRepository;
        this.userRepository = userRepository;
        this.universityRepository = universityRepository;
    }

    @Override
    public List<FavouriteUniversity> getUserFavourites(Long userId) {
        return favouriteRepository.findByUserId(userId);
    }

    @Override
    public FavouriteUniversity addToFavourites(Long userId, Long universityId) {
        if (favouriteRepository.existsByUserIdAndUniversityId(userId, universityId)) {
            throw new RuntimeException("University already in favourites");
        }

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

        University university = universityRepository.findById(universityId)
                .orElseThrow(() -> new RuntimeException("University not found with id: " + universityId));

        FavouriteUniversity favourite = new FavouriteUniversity();
        favourite.setUser(user);
        favourite.setUniversity(university);
        favourite.setAddAt(LocalDate.now());

        return favouriteRepository.save(favourite);
    }

    @Override
    public void removeFromFavourites(Long userId, Long universityId) {
        if (!favouriteRepository.existsByUserIdAndUniversityId(userId, universityId)) {
            throw new RuntimeException("Favourite not found");
        }
        favouriteRepository.deleteByUserIdAndUniversityId(userId, universityId);
    }

    @Override
    public boolean isFavourite(Long userId, Long universityId) {
        return favouriteRepository.existsByUserIdAndUniversityId(userId, universityId);
    }

    @Override
    public long getFavouritesCount(Long userId) {
        return favouriteRepository.countByUserId(userId);
    }
}
