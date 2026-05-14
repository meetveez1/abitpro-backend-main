package samsung.abitpro.service;

import samsung.abitpro.model.FavouriteUniversity;
import java.util.List;

public interface FavouriteUniversityService {

    List<FavouriteUniversity> getUserFavourites(Long userId);

    FavouriteUniversity addToFavourites(Long userId, Long universityId);

    void removeFromFavourites(Long userId, Long universityId);

    boolean isFavourite(Long userId, Long universityId);

    long getFavouritesCount(Long userId);
}
