package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import model.Order;
import model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class OrderController {
    @FXML
    private Label totalcost;
    @FXML
    private FlowPane orderedflowpane;

    public static double total;

    @FXML
    public void initialize() {
        reloadProducts();
        calculateTotal();
    }

    private void calculateTotal() {
        double sum = 0;
        for (Product p : Order.getOrderedProducts()) {
            sum += p.getPrice();
        }
        totalcost.setText(sum + " تومان");
        total = sum;
    }

    private void reloadProducts() {
        orderedflowpane.getChildren().clear();
        List<Product> orderedProducts = Order.getOrderedProducts();

        for (Product product : orderedProducts) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/menu/orderCard.fxml"));
                Node cardNode = loader.load();

                OrderCardController cardController = loader.getController();
                cardController.setData(product);

                orderedflowpane.getChildren().add(cardNode);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void finish() {
        List<Product> copyList = new ArrayList<>(Order.getOrderedProducts());
        Order order = new Order(Order.globalOrderNumber++, total, copyList);

        Order.allOrders.add(order);
        Order.clearCart();

        reloadProducts();
        calculateTotal();
    }

}