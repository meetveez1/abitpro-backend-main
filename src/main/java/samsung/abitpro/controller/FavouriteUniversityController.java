package samsung.abitpro.controller;

import org.springframework.web.bind.annotation.*;
import samsung.abitpro.model.FavouriteUniversity;
import samsung.abitpro.service.FavouriteUniversityService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/favourites")
public class FavouriteUniversityController {

    private final FavouriteUniversityService favouriteService;

    public FavouriteUniversityController(FavouriteUniversityService favouriteService) {
        this.favouriteService = favouriteService;
    }

    @GetMapping("/user/{userId}")
    public List<FavouriteUniversity> getUserFavourites(@PathVariable Long userId) {
        return favouriteService.getUserFavourites(userId);
    }

    @PostMapping("/user/{userId}/university/{universityId}")
    public Map<String, Object> addToFavourites(@PathVariable Long userId, @PathVariable Long universityId) {
        FavouriteUniversity favourite = favouriteService.addToFavourites(userId, universityId);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "University added to favourites");
        response.put("favourite", favourite);
        return response;
    }

    @DeleteMapping("/user/{userId}/university/{universityId}")
    public Map<String, String> removeFromFavourites(@PathVariable Long userId, @PathVariable Long universityId) {
        favouriteService.removeFromFavourites(userId, universityId);

        Map<String, String> response = new HashMap<>();
        response.put("message", "University removed from favourites");
        return response;
    }

    @GetMapping("/user/{userId}/check/{universityId}")
    public Map<String, Boolean> isFavourite(@PathVariable Long userId, @PathVariable Long universityId) {
        boolean isFav = favouriteService.isFavourite(userId, universityId);

        Map<String, Boolean> response = new HashMap<>();
        response.put("isFavourite", isFav);
        return response;
    }

    @GetMapping("/user/{userId}/count")
    public Map<String, Long> getFavouritesCount(@PathVariable Long userId) {
        long count = favouriteService.getFavouritesCount(userId);

        Map<String, Long> response = new HashMap<>();
        response.put("count", count);
        return response;
    }
}
