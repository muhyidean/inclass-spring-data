package miu.edu.demo.service;


import miu.edu.demo.domain.Product;
import miu.edu.demo.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto findById(int id);

    void save(Product p);

    List<Product> findHaveReviewMoreThan(int n);

    List<Product> findByPriceGreaterThan(float price);
}
