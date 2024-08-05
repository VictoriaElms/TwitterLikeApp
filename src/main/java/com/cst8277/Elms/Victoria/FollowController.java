package com.cst8277.Elms.Victoria;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/Follow")
public class FollowController {

    private FollowRepository followRepository;

    @PostMapping
    public Mono<Void> followUser(@RequestBody Map<String, String> request){
        UUID followerId = UUID.fromString(request.get("followerId"));
        UUID followeeId = UUID.fromString(request.get("followeeId"));
        followRepository.save(new Follow(followerId, followeeId));
        return Mono.empty();

    }
    @GetMapping
    public Mono<List<Follow>> getAllFollows(){
        return Mono.just(new ArrayList<>(followRepository.findAll().values()));
    }
    @GetMapping("/follower/{followerId}")
    public Mono<List<Follow>> getFollowsByFollowerId(@PathVariable UUID followerId){
        return Mono.just(new ArrayList<>(followRepository.findByFollowerId(followerId).values()));
    }

    @DeleteMapping("/{followerId")
    public Mono<Void> deleteFollow(@PathVariable UUID followerId){
        followRepository.delete(followerId);
        return Mono.empty();
    }

}
