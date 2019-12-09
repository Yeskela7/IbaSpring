package app.controller;

import app.entity.Message;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msq")

public class MessageController {
    @GetMapping
    public Message handle_get(){
    return new Message(1,1,2,"Hello");
    }
    @PostMapping
    public Message handle_post(){
        return new Message(2,3,1,"Hi");
    }


}
