package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.Product;

import java.io.IOException;
import java.util.List;

public class MainController {
    @FXML
    private HBox offerbox;
    @FXML
    private HBox box2;
    @FXML
    private HBox newbox1;
    @FXML
    private HBox newbox2;
    @FXML
    private ImageView baner1;
    @FXML
    private ImageView baner2;

    List<Product> products = DatabaseManager.loadProduct();

    @FXML
    public void initialize() {
        loadBox(offerbox, "/view/menu/food_card.fxml",
                "کباب کوبیده", "بستنی موزی", "جوجه با کوبیده", "سوپ جو", "کیک شکلاتی");

        loadBox(box2, "/view/menu/food_card2.fxml",
                "قرمه سبزی", "فالوده شیرازی", "دسر خوشمزه");

        loadBox(newbox1, "/view/menu/food_card.fxml",
                "عدس پلو با گوشت", "سوپ جو", "آش رشته");

        loadBox(newbox2, "/view/menu/food_card.fxml",
                "کوفته تبریزی", "چلو کباب برگ", "ماکارونی با ته‌دیگ سیب‌زمینی");

        loadBanners();
    }

    private void loadBox(HBox box, String fxmlPath, String... targetNames) {
        if (box == null) return;

        List<Product> filteredProducts = products.stream()
                .filter(p -> {
                    for (String name : targetNames) {
                        if (p.getName().equals(name)) return true;
                    }
                    return false;
                })
                .toList();

        box.getChildren().clear();
        for (Product product : filteredProducts) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
                Node cardNode = loader.load();

                Object controller = loader.getController();
                if (controller instanceof FoodCardController) {
                    ((FoodCardController) controller).setData(product.getName(), product.getPrice(), product.getImagePath());
                } else if (controller instanceof FoodCardController2) {
                    ((FoodCardController2) controller).setData(product.getName(), product.getPrice(), product.getImagePath());
                }

                box.getChildren().add(cardNode);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadBanners() {
        if (baner1 != null) {
            Image img1 = new Image(getClass().getResourceAsStream("/view/menu/images/Desserts/bastaniVip.jpg"));
            baner1.setImage(img1);
        }

        if (baner2 != null) {
            Image img2 = new Image(getClass().getResourceAsStream("/view/menu/images/irani/images (5).jpg"));
            baner2.setImage(img2);
        }
    }
}