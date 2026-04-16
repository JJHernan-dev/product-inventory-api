package com.juanjesus.productinventory.service;

import com.juanjesus.productinventory.entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product createProduct(Product product);

}
