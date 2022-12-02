package com.example.spring.websocket.handlers;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ExampleHandler {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Object send(Message<?> message) {
        return "Hello-world";
    }

}
