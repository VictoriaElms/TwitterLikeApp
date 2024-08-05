package com.cst8277.Elms.Victoria;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FavouriteRepository {
    private final Map<UUID, Favourite> favouriteStore = new HashMap<>();

    public void save(Favourite favourite){
        favouriteStore.put(favourite.getFavouriteId(), favourite);

    }

    public Map<UUID, Favourite> findAll(){
        return favouriteStore;
    }

    public Favourite findById(UUID favouriteId){
        return favouriteStore.get(favouriteId);
    }

    public Map<UUID, Favourite> findByUserId(UUID userId) {
        Map<UUID, Favourite> userFavourites = new HashMap<>();
        for (Favourite favourite : favouriteStore.values()) {
            if (favourite.getUserId().equals(userId)) {
                userFavourites.put(favourite.getFavouriteId(), favourite);
            }
        }
        return userFavourites;
    }
    public void delete(UUID favouriteId){
        favouriteStore.remove(favouriteId);
    }

}
