package com.cst8277.Elms.Victoria;

import lombok.Getter;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Data
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Getter
    @Setter
    private UUID userId;
    @Setter
    @Getter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String token;

    public User(String username, String password){
        this.userId = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.token = UUID.randomUUID().toString();
    }


    public UUID getuserId() {
        return userId;
    }
}
