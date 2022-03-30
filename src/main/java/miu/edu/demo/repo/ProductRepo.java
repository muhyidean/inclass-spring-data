package miu.edu.demo.repo;


import miu.edu.demo.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Integer> {

    List<Product> findAll();

    List<Product> findProductByPriceGreaterThan(float price);

    @Query(value = "SELECT * FROM PRODUCT WHERE name= :name", nativeQuery = true)
    List<Product> findProductHaveReviewMoreThan(int n);




}
