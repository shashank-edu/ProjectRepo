package com.springboot.product.Repository;

import com.springboot.product.Entities.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Configurable
public interface ProductRepository extends JpaRepository<Product,Integer>{
    @Query()
    Product findItemByName(String name);
}