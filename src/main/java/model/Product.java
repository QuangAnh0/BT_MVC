package model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String description;
    private String address;

    public Product() {
    }

    public Product(int id, String name, int price, String description, String address) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
