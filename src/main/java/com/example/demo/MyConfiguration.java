package com.example.demo;

import com.example.demo.dto.Reaction;
import com.example.demo.dto.ReactionDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public ObjectMapper customObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Reaction.class, new ReactionDeserializer());
        mapper.registerModule(module);
        return mapper;
    }


}
