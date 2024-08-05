package com.cst8277.Elms.Victoria;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepository {
    private final Map<UUID, User> userStore = new HashMap<>();

    public User findById(UUID userId){
        return userStore.get(userId);
    }

    public User findByUsername(String username){
        return userStore.values().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst().orElse(null);
    }

    public Map<UUID, User> findAll() {
        return userStore;
    }

    public void save(User user) {
        userStore.put(user.getuserId(), user);
    }
}
