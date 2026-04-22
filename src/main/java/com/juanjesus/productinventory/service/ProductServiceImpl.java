package com.juanjesus.productinventory.service;

import com.juanjesus.productinventory.dto.ProductRequestDto;
import com.juanjesus.productinventory.dto.ProductResponseDto;
import com.juanjesus.productinventory.entity.Product;
import com.juanjesus.productinventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponseDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> new ProductResponseDto(
                        product.getName(),
                        product.getPrice()
                ))
                .toList();
    }

    @Override
    public Product createProduct(ProductRequestDto dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        return productRepository.save(product);
    }



}
