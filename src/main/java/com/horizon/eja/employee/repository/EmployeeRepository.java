package com.horizon.eja.employee.repository;

import com.horizon.eja.employee.model.EmployeeE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeE,Integer> {
}
