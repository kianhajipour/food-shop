package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FoodCardController2 {

    @FXML
    private ImageView image;

    @FXML
    private Label name;

    @FXML
    private Label price;

    public void setData(String foodName, Double foodPrice, String imagePath) {
        name.setText(foodName);
        price.setText(foodPrice.toString() + " تومان");
        try {
            Image img = new Image(getClass().getResourceAsStream(imagePath));
            image.setImage(img);
        } catch (Exception e) {

        }
    }
}