package com.cst8277.Elms.Victoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription,Integer> {
   /* private final Map<UUID, Subscription> follows = new HashMap<>();

    public void save(Subscription follow){
        follows.put(follow.getFollowerId(), follow);
    }
    public Map<UUID, Subscription> findAll(){
        return follows;
    }
    public Map<Integer, Subscription> findByFollowerId(UUID followerId){
        Map<Integer, Subscription> result = new HashMap<>();
        return result;
    }
    public void delete(Integer followerId){
        follows.remove(followerId);
    }*/
}