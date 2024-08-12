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

