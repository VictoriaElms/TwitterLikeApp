package com.cst8277.Elms.Victoria;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

public class Follow {
    @Getter
    @Setter
    private UUID followerId;
    @Getter
    @Setter
    private UUID followeeId;

    public Follow(UUID followerId, UUID followeeId){
        this.followerId = followerId;
        this.followeeId = followeeId;
    }


}
