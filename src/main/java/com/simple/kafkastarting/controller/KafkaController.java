package com.simple.kafkastarting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestBody String req) {
//        kafkaTemplate.send("kafka101", req);
//        return "Success";
//    }

    @GetMapping("/get")
    public String getMessage() {

        return "Success";
    }
}
