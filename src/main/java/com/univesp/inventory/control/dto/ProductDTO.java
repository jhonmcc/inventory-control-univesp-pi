package com.univesp.inventory.control.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductDTO {
    private String name;
    private String description;

//    private String sku;
//    private Double costPrice;
//    private Double salePrice;
//    private Integer minStock;
//    private String category;
}
