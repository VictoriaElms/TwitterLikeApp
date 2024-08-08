package com.cst8277.Elms.Victoria;

import org.springframework.data.repository.CrudRepository;
import com.cst8277.Elms.Victoria.Messages;
import com.cst8277.Elms.Victoria.MessageController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public interface MessageRepository extends CrudRepository<Messages,Integer> {

}
   /* private Map<Integer, Messages> messageStore = new HashMap<>();

    public void save(Messages message){
        messageStore.put(message.getMessageId(), message);
    }
    public Map<Integer, Messages> findAll(){
        return messageStore;
    }
    public Messages findById(UUID messageId){
        return messageStore.get(messageId);
    }
}*/
