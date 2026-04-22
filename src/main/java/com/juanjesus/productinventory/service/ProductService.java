package com.juanjesus.productinventory.service;

import com.juanjesus.productinventory.dto.ProductRequestDto;
import com.juanjesus.productinventory.dto.ProductResponseDto;
import com.juanjesus.productinventory.entity.Product;
import java.util.List;

public interface ProductService {

    List<ProductResponseDto> getAllProducts();
    Product createProduct(ProductRequestDto dto);

}
