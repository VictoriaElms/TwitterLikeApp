package com.cst8277.Elms.Victoria;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class FollowRepository {
    private final Map<UUID, Follow> follows = new HashMap<>();

    public void save(Follow follow){
        follows.put(follow.getFollowerId(), follow);
    }
    public Map<UUID, Follow> findAll(){
        return follows;
    }
    public Map<UUID, Follow> findByFollowerId(UUID followerId){
        Map<UUID, Follow> result = new HashMap<>();
        for(Follow follow : follows.values()){
            if(follow.getFollowerId().equals(followerId)){
                result.put(follow.getFollowerId(), follow);
            }
        }
        return result;
    }
    public void delete(UUID followerId){
        follows.remove(followerId);
    }
}