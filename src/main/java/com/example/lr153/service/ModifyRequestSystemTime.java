package com.example.lr153.service;

import java.util.Date;

import com.example.lr153.model.Request;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.time.LocalDateTime;

@Service
public class ModifyRequestSystemTime implements ModifyRequestService {
    @Override
    public void modifyRq(Request request) {
        request.setSystemTime(String.valueOf(LocalDateTime.now()));

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8082/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}