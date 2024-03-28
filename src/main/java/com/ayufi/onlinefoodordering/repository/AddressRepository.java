package com.ayufi.onlinefoodordering.repository;

import com.ayufi.onlinefoodordering.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
