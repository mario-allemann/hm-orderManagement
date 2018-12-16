package fhnw.hackermans.shopstantlySPRING.domain.orderManagement;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepo extends CrudRepository<Product, Integer> {
	List<Product> findByProductName(@Param("productName")String productName);
}