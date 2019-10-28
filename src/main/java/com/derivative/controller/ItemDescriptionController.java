package com.derivative.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derivative.dto.Distributor;
import com.derivative.dto.Item;
import com.derivative.dto.ItemDistributor;
import com.derivative.repo.DistributorRepo;
import com.derivative.repo.GetListOfDistributors;
import com.derivative.repo.ItemRepo;
import com.derivative.repo.MapItemDistibutor;

@RestController
@RequestMapping("/derivative")
public class ItemDescriptionController {

	@Autowired
	ItemRepo itemrepo;
	
	@Autowired
	DistributorRepo distributorRepo;
	
	@Autowired
	MapItemDistibutor mapItemDistibutor;
	
	@Autowired
	GetListOfDistributors getListOfDistributors;
	  
	 /**
	 * @param itemDto
	 * @return
	 *  insert data into item
	 */
	@PostMapping(value="/createItem",headers="Accept=application/json",produces ="application/json" )
	    public String createItem(@RequestBody Item itemDto)
	                                                     {
		String itemStatus="";
		 if(!itemrepo.findById(itemDto.getItemCode()).isPresent()) {
			 itemrepo.save(itemDto); 
			 itemStatus="Item inserted successfully..!";
			 
		 }
			 
		 else {
			 itemStatus="Item with id"+itemDto.getItemCode()+" already exsists in records"; 
		 }
			
		 
		 
		 
		 
	        
	        return itemStatus;
	    }
	 
	 /**
	 * @param distributor
	 * @return
	 * insert data into distributor
	 */
	@PostMapping(value="/createDistributor",headers="Accept=application/json",produces ="application/json" )
	    public String createDistributor(@RequestBody Distributor distributor)
	                                                     {
		String dstatus="";
		 if(!distributorRepo.findById(distributor.getDistributorcode()).isPresent()) {
			 
			 distributorRepo.save(distributor);
			 dstatus="Distributor inserted successfully..!";
		 }
			 
		 else {
			 
			 dstatus="Distributor with id "+distributor.getDistributorcode()+" already exsists in records";

			 
		 }
			
		 
		 
		 
		 
	        
	        return dstatus;
	    }
	 
	 /**
	 * @param itemDistributor
	 * @return
	 * inset Mapping data in item-Distributor
	 */
	@PostMapping(value="/mapItemDistibutor",headers="Accept=application/json",produces ="application/json" )
	    public String mapItemDistibutor(@RequestBody ItemDistributor itemDistributor)
	                                                     {
		String mapStatus="Item "+itemDistributor.getItemCode()+" and  Distibutor"+itemDistributor.getDistributorcode()+" mapped successfully";
		 			
		 
		 
		mapItemDistibutor.save(itemDistributor);
		 
	        
	        return mapStatus;
	    }
	 
	 
	 /**
	 * @param id
	 * @return
	 * 
	 * pass item id and  return list of Distributors which are not part of item distributor mapping.

	 */
	@GetMapping(value="/getDistributordata/{id}",produces ="application/json")
	   public List<Distributor> getDistributordata(@PathVariable Long id) {
	       
		return  getListOfDistributors.getDistributorData(id);
	    }

}
