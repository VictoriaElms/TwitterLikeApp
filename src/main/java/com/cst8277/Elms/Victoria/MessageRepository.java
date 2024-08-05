package com.cst8277.Elms.Victoria;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MessageRepository {
    private Map<UUID, Messages> messageStore = new HashMap<>();

    public void save(Messages message){
        messageStore.put(message.getMessageId(), message);
    }
    public Map<UUID, Messages> findAll(){
        return messageStore;
    }
    public Messages findById(UUID messageId){
        return messageStore.get(messageId);
    }
}
