package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	//@Query("SELECT * FROM Todo t where t.id = :id") 
	Customer findByCustomerId(@Param("customerId") int customerId);
}
