package hu.feladat.service;

import hu.feladat.dao.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    Product getProduct(Long productId);
    List<Product> getAllProducts();
    Product updateProduct(Long productId, Product newProduct);
    void deleteProduct(Long productId);
}