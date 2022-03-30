package miu.edu.demo.service;


import miu.edu.demo.domain.Product;
import miu.edu.demo.domain.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto getById(int id);

    void save(Product p);
}
