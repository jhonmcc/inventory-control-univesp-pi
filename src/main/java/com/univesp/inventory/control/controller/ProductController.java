package com.univesp.inventory.control.controller;

import com.univesp.inventory.control.dto.ProductDTO;
import com.univesp.inventory.control.entity.ProductEntity;
import com.univesp.inventory.control.service.ProductService;
import com.univesp.inventory.control.service.impl.ProductServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping(value = "/search")
    public String findProduct(HttpServletRequest request){
        return "object";
    }

    @PostMapping(value = "/register")
    public Boolean recordProduct(@Argument ProductDTO product){
        return productService.registerProduct(product);
    }

    @GetMapping(value = "/list-all")
    public List<ProductEntity> listAllProducts(){
        return productService.listAllProducts();
    }

}
