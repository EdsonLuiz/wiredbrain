package com.wiredbrain.services;

import org.springframework.data.repository.CrudRepository;

import com.wiredbrain.models.Address;

public interface AddressService extends CrudRepository<Address, Integer> {

}
