package miu.edu.demo.service;

import miu.edu.demo.domain.Product;
import miu.edu.demo.domain.dto.ProductDto;
import miu.edu.demo.helper.ListMapper;
import miu.edu.demo.repo.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ListMapper<Product,ProductDto> listMapperProductToDto;

    @Override
    public List<ProductDto> findAll() {
        return (List<ProductDto>)listMapperProductToDto.mapList(productRepo.findAll(),new ProductDto());

    }

    @Override
    public ProductDto findById(int id) {
        return modelMapper.map( productRepo.findById(id) , ProductDto.class );
    }

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public List<Product> findHaveReviewMoreThan(int n) {
        return productRepo.findHaveReviewMoreThan(n);
    }


    @Override
    public List<Product> findByPriceGreaterThan(float price) {

        return productRepo.findByPriceGreaterThan(price);


    }


}
