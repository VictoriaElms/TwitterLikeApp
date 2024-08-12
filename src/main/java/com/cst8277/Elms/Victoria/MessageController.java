package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;


@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping(path ="/write")
    public @ResponseBody String createMessage(@RequestParam Integer messageid, @RequestParam String content, @RequestParam Date createdate, @RequestParam Integer userid) {
       Messages m = new Messages();
       m.setMessageid(messageid);
       m.setContent(content);
       m.setCreatedate(createdate);
       m.setUserid(userid);
       messageRepository.save(m);
       return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Messages> getMessages(){
        return messageRepository.findAll();
    }



}
