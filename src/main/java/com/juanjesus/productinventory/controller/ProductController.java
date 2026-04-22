package com.juanjesus.productinventory.controller;

import com.juanjesus.productinventory.dto.ProductRequestDto;
import com.juanjesus.productinventory.dto.ProductResponseDto;
import com.juanjesus.productinventory.entity.Product;
import com.juanjesus.productinventory.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<ProductResponseDto> getAllProduct(){
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@Valid @RequestBody ProductRequestDto dto){
        return productService.createProduct(dto);
    }

}
