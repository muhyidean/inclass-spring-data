package miu.edu.demo.repo;


import miu.edu.demo.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Integer> {

    List<Product> findAll();

    List<Product> findByPriceGreaterThan(float price);

    Product findById(int id);

    @Query("select p from Product p where p.review.size >= :n")
    List<Product> findHaveReviewMoreThan(int n);




}
