package model;

public class Product {
    Double price;
    String name;
    CategoryModel category;
    String imagePath;


    public Product(String name, Double price, CategoryModel category , String imagePath) {
        this.price = price;
        this.name = name;
        this.category = category;
        this.imagePath = imagePath;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public String getImagePath() {
        return imagePath;
    }
}
