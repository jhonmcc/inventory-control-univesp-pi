package com.univesp.inventory.control.service.impl;

import com.univesp.inventory.control.dto.ProductDTO;
import com.univesp.inventory.control.entity.ProductEntity;
import com.univesp.inventory.control.repository.ProductRepository;
import com.univesp.inventory.control.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private ProductRepository productRepository;

    public Boolean registerProduct(ProductDTO product){
        try{
            productRepository.save(new ProductEntity(null, product.getName(), product.getDescription()));
            return true;
        }
        catch (Exception e){
            logger.error(e.getMessage());
            return false;
        }
    }

    public List<ProductEntity> listAllProducts(){
        try{
            return productRepository.findAll();
        }
        catch (Exception e){
            logger.error(e.getMessage());
            return new ArrayList<>();
        }
    }
}
