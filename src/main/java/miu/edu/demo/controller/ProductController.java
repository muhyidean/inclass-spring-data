package miu.edu.demo.controller;


import miu.edu.demo.domain.Product;
import miu.edu.demo.domain.Review;
import miu.edu.demo.domain.dto.ProductDto;
import miu.edu.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<ProductDto> getProduct(){
        return productService.findAll();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") int id){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Custom-Header","someValue");
//       return ResponseEntity.ok().headers(headers).body(productService.findById(id));
//    }

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable("id") int id){
        return productService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveProduct( @RequestBody Product p ){
        productService.save(p);
    }


    @GetMapping("/filter/review/{val}")
    public List<Product> findProductsReviewMoreThan(@PathVariable("val") int val){
        return productService.findHaveReviewMoreThan(val);
    }

    @GetMapping("/filter/price/{val}")
    public List<Product> findByPrice(@PathVariable("val") float val){
        return productService.findByPriceGreaterThan(val);
    }




}
