package com.univesp.inventory.control.service;

import com.univesp.inventory.control.dto.ProductDTO;
import com.univesp.inventory.control.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    Boolean registerProduct(ProductDTO product);

    List<ProductEntity> listAllProducts();

}
