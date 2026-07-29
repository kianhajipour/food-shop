package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import model.Order;
import model.Product;
import javafx.scene.control.Label;

public class ProductPageController {
    private Product courentProduct;
    @FXML
    private Label name;
    @FXML
    private Label detail;
    @FXML
    private Label price;
    @FXML
    private ImageView image;
    @FXML
    private Label count;

    public void loadPage(Product product){
        courentProduct = product;
        name.setText(product.getName());
        price.setText(product.getPrice().toString());
        javafx.scene.image.Image img = new javafx.scene.image.Image(getClass().getResourceAsStream(product.getImagePath()));
        image.setImage(img);
        updateCountLabel();
    }

    public void add(){
        Order.addProduct(courentProduct);
        updateCountLabel();
    }

    private void updateCountLabel() {
        int currentCount = 0;
        for (Product product : Order.getOrderedProducts()) {
            if (product.equals(courentProduct)) {
                currentCount++;
            }
        }
        if (count != null) {
            count.setText(String.valueOf(currentCount));
        }
    }
}