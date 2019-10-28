package com.derivative.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derivative.dto.Distributor;
@Repository
public interface DistributorRepo extends JpaRepository<Distributor, Long> {
}
