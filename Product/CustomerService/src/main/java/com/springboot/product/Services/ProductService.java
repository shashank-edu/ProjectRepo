package com.springboot.product.Services;

import com.springboot.product.Entities.Product;
import com.springboot.product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    // post method
//    public Product saveProduct(Product prod){
//        return productRepository.save(prod);
//    }
//
//    public List<Product> saveProducts(List<Product> prod){
//        return productRepository.saveAll(prod);
//    }
//
//    public List<Product> getProducts(){
//        return productRepository.findAll();
//    }
//
//    public Product getProductsById(int id){
//        Product product= productRepository.findById(id).orElse(null);
//        if(product != null){
//            return product;
//        }
//        throw new ProductNotFoundException("Could not find any Product with ID "+id);
//    }
//
//
//    public String deleteProduct(Integer id){
//        productRepository.deleteById(id);
//        return "Product removed !! "+id;
//    }
//
//    public Product updateProduct(Product product){
//        Product existingProduct =productRepository.findById(product.getId()).orElse(null);
//        if (existingProduct != null){
//            existingProduct.setName(product.getName());
//            existingProduct.setPrice(product.getPrice());
//            existingProduct.setPicture(product.getPicture());
//            existingProduct.setQuantity(product.getQuantity());
//            return productRepository.save(existingProduct);
//        }else{
//            return null;
//        }
//    }
//
//    public Product updateProductbyId(Product product,int id) {
//        Product existingProduct = productRepository.findById(id).orElse(null);
//        if (existingProduct != null){
//            // Product existingProduct =productRepository.findById(id).orElse(null);
//            existingProduct.setName(product.getName());
//            existingProduct.setPrice(product.getPrice());
//            existingProduct.setPicture(product.getPicture());
//            existingProduct.setQuantity(product.getQuantity());
//            return productRepository.save(existingProduct);
//        }else{
//            return null;
//        }
//    }
//
//    public String getItemDetails(Product item) {
//        System.out.println(
//                "Item Name: " + item.getName() +
//                        ", \nQuantity: " + item.getQuantity() +
//                        ", \nItem Category: " + item.getCategory()
//        );
//        return "";
//    }
//
//    public void showAllGroceryItems() {
//        productRepository.findAll().forEach(item -> System.out.println(getItemDetails(item)));
//    }
//
//    public void getItemsByCategory(String category) {
//        System.out.println("Getting items for the category " + category);
//        List<Product> list = productRepository.findAll(category);
//
//        list.forEach(item -> System.out.println("Name: " + item.getName() + ", Quantity: " + item.getQuantity()));
//    }
//
//    public void getItemByName(String name) {
//        System.out.println("Getting item by name: " + name);
//        Product item = productRepository.findItemByName(name);
//        System.out.println(getItemDetails(item));
//    }
//
//    public void deleteProductItem(String id) {
//        productRepository.deleteById(Integer.valueOf(id));
//        System.out.println("Item with id " + id + " deleted...");
//    }
//
//    public void updateItemQuantity(String name, float newQuantity) {
//        System.out.println("Updating quantity for " + name);
//        customRepo.updateItemQuantity(name, newQuantity);
//    }
    public  Product getProductByName(String name){
        return  productRepository.findItemByName(name);
    }

//    public List<Product> searchProductByPriceRange(@RequestParam(name = "min") float min,
//                                                   @RequestParam(name = "max") float max) {
//        return productRepository.getProductsByRange(min, max);
//    }
//
//
//    public List<Product> searchProductByPriceRange(@RequestParam(name = "min") float min,
//                                                   @RequestParam(name = "max") float max, @RequestParam(name = "seller_id") int sellerId) {
//        return productRepository.getProductsByRange(min, max, sellerId);
//
//    }

    public List<Product> getProductsList(String type) {
        return productRepository.findAll(type);
    }

    public List<Product> getProductsByRange(float min, float max, int sellerId) {
        return productRepository.findByProductsBetween(min,max,sellerId);
    }

}