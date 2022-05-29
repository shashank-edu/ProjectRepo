package com.springboot.product.Repository;

import com.springboot.product.Entities.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


@Configurable
public interface ProductRepository extends JpaRepository<Product,Integer>{

    @Query(value="SELECT * FROM product WHERE product_name = ?1", nativeQuery = true)
    Product findItemByName(String name);


    @Query(value="SELECT * FROM product WHERE type =?1", nativeQuery = true)
    List<Product> findAllType(String type);

    @Query(value="SELECT * FROM product WHERE category =?1", nativeQuery = true)
    List<Product> findAllCategory(String category);
}