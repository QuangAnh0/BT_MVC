package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static {
        products=new HashMap<>();
        products.put(1,new Product(1,"Thuốc lá",9000,"Phê","Lào Cai"));
        products.put(2,new Product(2,"Xì gà",10000,"Đồ dùng giới thượng lưu","HCM"));
        products.put(3,new Product(3,"Bimbim",5000,"Đồ ăn cho trẻ nhỏ","63 tỉnh thành"));
        products.put(4,new Product(4,"Bia",9000,"Thức uống lúa mạch giải nhiệt mùa hè","Hà Nội"));
    }
    @Override
    public List<Product> findAll() {
     return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
    products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
