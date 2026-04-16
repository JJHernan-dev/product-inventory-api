package com.juanjesus.productinventory.repository;

import com.juanjesus.productinventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
