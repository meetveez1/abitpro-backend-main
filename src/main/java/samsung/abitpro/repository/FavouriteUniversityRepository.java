package samsung.abitpro.repository;

import samsung.abitpro.model.FavouriteUniversity;
import samsung.abitpro.model.User;
import samsung.abitpro.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface FavouriteUniversityRepository extends JpaRepository<FavouriteUniversity, Long> {

    List<FavouriteUniversity> findByUser(User user);

    List<FavouriteUniversity> findByUserId(Long userId);

    List<FavouriteUniversity> findByUniversityId(Long universityId);

    Optional<FavouriteUniversity> findByUserIdAndUniversityId(Long userId, Long universityId);

    boolean existsByUserIdAndUniversityId(Long userId, Long universityId);

    void deleteByUserIdAndUniversityId(Long userId, Long universityId);

    long countByUserId(Long userId);
}
