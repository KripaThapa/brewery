package com.kripa.gurucourse.brewery.service;

import com.kripa.gurucourse.brewery.model.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(Long customerId) {
        CustomerDto dto = new CustomerDto();
        dto.setCustomerId(1L);
        dto.setCustomerName("Kripa");
        return dto;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto dto) {
        CustomerDto custDto = new CustomerDto();
        custDto.setCustomerId(dto.getCustomerId());
        custDto.setCustomerName(dto.getCustomerName());
        return custDto;
    }

	@Override
	public void updateCustomer(Long id, CustomerDto dto) {
		System.out.println( "Updated"+ id + dto);
	}

	@Override
	public void deleteCustomer(Long id) {
		
	}
}
