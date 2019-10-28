package com.derivative.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derivative.dto.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

}
