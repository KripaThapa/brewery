package com.brewery.client.breweryclient.client;

import com.brewery.client.breweryclient.model.CustomerDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
//@ConfigurationProperties(prefix="sfg.brewery", ignoreUnknownFields = false)
public class CustomerClient {

    private final RestTemplate restTemplate;
    @Value("${sfg.brewery.apiHost}")
    private String apiHost;
    public final String CUSTOMER_PATH = "/api/v1/customer/";

    public void setApiHost(String apiHost){
        this.apiHost = apiHost;
    }
    public CustomerClient(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
    }

    public CustomerDto getCustomerById(Long id)
    {
        return restTemplate.getForObject(apiHost+CUSTOMER_PATH+id, CustomerDto.class);
    }
}
