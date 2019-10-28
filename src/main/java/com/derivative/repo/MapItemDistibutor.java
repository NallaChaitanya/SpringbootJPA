package com.derivative.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derivative.dto.ItemDistributor;

@Repository
public interface MapItemDistibutor extends JpaRepository<ItemDistributor, Long> {

}
