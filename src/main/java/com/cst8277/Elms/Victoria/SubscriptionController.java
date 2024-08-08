package com.cst8277.Elms.Victoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController {
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @PostMapping(path ="/subscribe")
    public @ResponseBody String subscribe(@RequestParam Integer subscriptionid, @RequestParam Integer subscriberid, @RequestParam Integer producerid) {
        Subscription p = new Subscription();
        p.setSubscriptionid(subscriptionid);
        p.setSubscriberid(subscriberid);
        p.setProducerid(producerid);
        subscriptionRepository.save(p);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Subscription> getSubscription(){
        return subscriptionRepository.findAll();
    }

}
