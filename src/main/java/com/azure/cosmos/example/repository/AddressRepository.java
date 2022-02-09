package com.azure.cosmos.example.repository;

import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.azure.cosmos.example.domain.Address;

/**
 * Spring Data repository for the Address cosmos document.
 */
@Repository
public interface AddressRepository extends CosmosRepository<Address, String> {
  
}
