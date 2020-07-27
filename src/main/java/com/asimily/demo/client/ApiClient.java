package com.asimily.demo.client;

import com.asimily.demo.model.Planet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ApiClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiClient.class);

    private RestTemplate restTemplate;

    @Value("${api.baseUrl}")
    private String apiBaseUrl;

    public ApiClient() {
        this.restTemplate = new RestTemplate();
    }

    public List<Planet> getList() {
        long startTime = System.currentTimeMillis();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);

        ResponseEntity<List<Planet>> responseEntity = restTemplate.exchange(apiBaseUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Planet>>() {});

        LOGGER.info("Get Master List Completed in: " + (System.currentTimeMillis() - startTime));
        return responseEntity.getBody();
    }
}
