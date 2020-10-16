package com.example.demo;

import com.example.demo.dto.Reaction;
import com.example.demo.payload.BasePayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {
    @GetMapping("/")

    public String index() {
        return "a";
    }

    @PostMapping("/p")
    public <T> String printReactionPayload(@RequestBody Reaction<? extends BasePayload<T>> reaction) {
        log.info("payload({}): {}", reaction.payload.getClass().getCanonicalName(), reaction.payload.get());

        return reaction.payload.get().toString();
    }

}
