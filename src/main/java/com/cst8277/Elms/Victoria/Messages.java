package com.cst8277.Elms.Victoria;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Messages {
    private UUID messageId;
    @Setter
    @Getter
    private String message;
    @Setter
    @Getter
    private UUID authorId;
    @Setter
    @Getter
    private LocalDateTime createdAt;

    public Messages(String message, UUID authorId){
        this.messageId = UUID.randomUUID();
        this.message = message;
        this.authorId = authorId;
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() {
        return messageId;
    }
}
