package com.cst8277.Elms.Victoria;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Favourite")
public class FavouriteController {

    private FavouriteRepository favouriteRepository;

    @PostMapping
    public Mono<Void> favouriteMessage(@RequestBody Map<String, String> request){
        UUID userId = UUID.fromString(request.get("userId"));
        UUID messageId = UUID.fromString(request.get("messageId"));
        favouriteRepository.save(new Favourite(userId, messageId));
        return Mono.empty();
    }
    @GetMapping
    public Mono<List<Favourite>> getAllFavourites(){
        return Mono.just(favouriteRepository.findAll().values().stream().collect(Collectors.toList()));
    }
    @GetMapping("/{userId}")
    public Mono<List<Favourite>> getFavouritesByUserId(@PathVariable UUID userId){
        return Mono.just(favouriteRepository.findByUserId(userId).values().stream().collect((Collectors.toList())));
    }
    @DeleteMapping("/{favouriteId}")
    public Mono<Void> deleteFavourite(@PathVariable UUID favouriteId){
        favouriteRepository.delete(favouriteId);
        return Mono.empty();
    }
}
