package com.codegym.repository;
import com.codegym.model.Address;
import com.codegym.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAddressRepository extends JpaRepository<Address, Integer> {
    @Query(value = "select * from dia_diem", nativeQuery = true)
    List<Address> findAllAddress();
}
