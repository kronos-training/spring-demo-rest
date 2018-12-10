package com.example.demorest.services;

import com.example.demorest.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressService extends CrudRepository<Address, Integer> {

}
