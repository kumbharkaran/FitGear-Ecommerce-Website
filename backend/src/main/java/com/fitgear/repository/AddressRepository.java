package com.fitgear.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fitgear.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
