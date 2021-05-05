package com.kripa.gurucourse.brewery.service;

import com.kripa.gurucourse.brewery.model.CustomerDto;

public interface CustomerService {

    CustomerDto getCustomerById(Long customerId);

    CustomerDto createCustomer(CustomerDto dto);

	void updateCustomer(Long id, CustomerDto dto);

	void deleteCustomer(Long id);
}
