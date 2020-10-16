package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

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
