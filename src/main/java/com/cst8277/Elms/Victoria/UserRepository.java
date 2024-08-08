package com.cst8277.Elms.Victoria;

import org.springframework.data.repository.CrudRepository;
import com.cst8277.Elms.Victoria.User;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User,Integer> {

}
   /* private final Map<Integer, User> userStore = new HashMap<>();

    public User findById(Integer userId){
        return userStore.get(userId);
    }

    public User findByUsername(String username){
        return userStore.values().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst().orElse(null);
    }

    public Map<Integer, User> findAll() {
        return userStore;
    }

    public User save(User user) {
        userStore.put(user.getuserId(), user);
        return user;
    }

    public void deleteById(Integer userId) {
    }
}*/
