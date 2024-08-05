package com.cst8277.Elms.Victoria;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/Messages")
public class MessageController {
    private MessageRepository messageRepository;

    @PostMapping
    public Mono<Void> createMessage(@RequestBody Map<String, String> request){
        String message = request.get("message");
        UUID authorId = UUID.fromString(request.get("authorId"));
        messageRepository.save(new Messages(message, authorId));
        return Mono.empty();
    }

    @GetMapping
    public Mono<Map<UUID, Messages>> getAllMessages(){
        return Mono.just(messageRepository.findAll());
    }

}
