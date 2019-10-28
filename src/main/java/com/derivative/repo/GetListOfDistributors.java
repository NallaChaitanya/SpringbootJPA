package com.derivative.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.derivative.dto.Distributor;

@Repository
public interface GetListOfDistributors extends JpaRepository<Distributor, Long> {
	
	//select * from DISTRIBUTOR d where  DISTRIBUTORCODE not in (select DISTRIBUTORCODE from ITEM_DISTRIBUTOR_MAPPING where ITEM_CODE =101  );
	
		//@Query(value = "SELECT * FROM Owner o WHERE o.ownerId = :id", nativeQuery = true)
		//
		@Query(value = "select * from DISTRIBUTOR d where  d.DISTRIBUTORCODE not in (select DISTRIBUTORCODE from ITEM_DISTRIBUTOR_MAPPING where ITEM_CODE =  :id)", nativeQuery = true)
		List<Distributor> getDistributorData(@Param("id") Long id);


}
