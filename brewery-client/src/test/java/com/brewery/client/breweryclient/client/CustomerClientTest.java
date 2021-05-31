package com.brewery.client.breweryclient.client;

import com.brewery.client.breweryclient.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerClientTest {
    @Autowired
    CustomerClient client;

    @Test
    void getCustomer(){
        CustomerDto dto = client.getCustomerById(1L);
        assertNotNull(dto);
    }
}