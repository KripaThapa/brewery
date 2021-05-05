package com.kripa.gurucourse.brewery.controller;

import com.kripa.gurucourse.brewery.model.BeerDto;
import com.kripa.gurucourse.brewery.model.CustomerDto;
import com.kripa.gurucourse.brewery.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer/")
public class CustomerController {

    private final CustomerService service;
    public CustomerController(CustomerService service){
        this.service = service;
    }
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable Long customerId){
        return new ResponseEntity<>(service.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping("/customerdto")
    public ResponseEntity<CustomerDto> postCustomer(@RequestBody CustomerDto dto){
        return new ResponseEntity<>(service.createCustomer(dto), HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity handleUpdate(@PathVariable Long id, @RequestBody CustomerDto dto) {
    	service.updateCustomer(id, dto);
    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @DeleteMapping("/{id}")
    public void handleDelete(@PathVariable Long id) {
    	service.deleteCustomer(id);
    }
}
