package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Order;
import model.Product;
import view.menu.Main;

public class OrderCardController {
    @FXML
    private Label name;
    @FXML
    private Label price;
    @FXML
    private ImageView image;
    private Product product;

    public void setData(Product product) {
        this.product = product;

        name.setText(product.getName());
        price.setText(product.getPrice().toString() + " تومان");
        try {
            Image img = new Image(getClass().getResourceAsStream(product.getImagePath()));
            image.setImage(img);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        Order.removeProduct(product);
        Main.showOrderScreen();
    }
}
