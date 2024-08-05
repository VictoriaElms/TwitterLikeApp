package com.cst8277.Elms.Victoria;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Favourite {
    private UUID favouriteId;
    @Getter
    @Setter
    private UUID userId;
    @Getter
    @Setter
    private UUID messageId;

    public Favourite(UUID userId, UUID messageId){
        this.favouriteId = UUID.randomUUID();
        this.userId = userId;
        this.messageId = messageId;
    }
}
