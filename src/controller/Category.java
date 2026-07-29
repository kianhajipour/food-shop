package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import model.CategoryModel;
import model.Product;
import model.Sort;
import java.io.IOException;
import java.util.List;

public class Category {
    Sort sort = Sort.MANUAL;
    CategoryModel currentCategory;

    @FXML
    private FlowPane foodFlowPane;
    @FXML
    private Label cateLable;

    public void initialize(CategoryModel targetCategoryModel) {
        this.currentCategory = targetCategoryModel;

        switch (targetCategoryModel){
            case IRANI -> cateLable.setText("انواع مختلف از خوشمزه ترین غذا های ایرانی");
            default -> cateLable.setText("");
        }

        reloadProducts();
    }


    private void reloadProducts() {
        foodFlowPane.getChildren().clear();
        List<Product> products = sortProducts(DatabaseManager.loadProduct(), sort);

        for (Product product : products) {
            if(product.getCategory() == currentCategory){
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/menu/food_card.fxml"));
                    Node cardNode = loader.load();

                    FoodCardController cardController = loader.getController();
                    cardController.setData(product);

                    foodFlowPane.getChildren().add(cardNode);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void maxprice(){
        sort = Sort.PRICEMAXTOMIN;
        reloadProducts();
    }

    public void minprice(){
        sort = Sort.PRICEMINTOMAX;
        reloadProducts();
    }

    public void maxstar(){
        sort = Sort.STAR;
        reloadProducts();
    }

    public static List<Product> sortProducts(List<Product> products, Sort sortcase) {
        switch (sortcase){
            case PRICEMAXTOMIN -> products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
            case PRICEMINTOMAX -> products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        }
        return products;
    }
}