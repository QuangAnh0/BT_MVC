package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product Product);

    Product findById(int id);

    void update(int id, Product Product);

    void remove(int id);

}
