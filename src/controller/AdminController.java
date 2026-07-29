package controller;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Order;
import model.Product;
import view.menu.Main;

public class AdminController {
    @FXML
    private Label count;
    @FXML
    private VBox vBox;

    @FXML
    public void initialize() {
        loadOrders();
    }
public void back(){
    Main.showMainScreen();
}
    public void loadOrders() {
        vBox.getChildren().clear();
        int totalOrders = Order.allOrders.size();
        count.setText("تعداد سفارشات: " + totalOrders);

        for (Order order : Order.allOrders) {
            VBox orderCard = new VBox(8);
            orderCard.setPadding(new Insets(12));
            orderCard.setStyle("-fx-background-color: #f9f9f9; -fx-border-color: #ccc; -fx-border-radius: 8; -fx-background-radius: 8;");

            Label titleLabel = new Label("سفارش شماره #" + order.getNumber());
            titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");

            VBox itemsBox = new VBox(4);
            itemsBox.setPadding(new Insets(0, 0, 0, 15));
            for (Product p : order.getFinalProducts()) {
                Label itemLabel = new Label("- " + p.getName() + " (" + p.getPrice() + " تومان)");
                itemsBox.getChildren().add(itemLabel);
            }

            Label totalLabel = new Label("مجموع کل: " + order.getCost() + " تومان");
            totalLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #2a72d7;");

            Button completeBtn = new Button("اتمام سفارش");
            completeBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-cursor: hand;");
            completeBtn.setOnAction(e -> {
                Order.removeOrder(order);
                loadOrders();
            });

            Button deleteBtn = new Button("حذف سفارش");
            deleteBtn.setStyle("-fx-background-color: #f44336; -fx-text-fill: white; -fx-cursor: hand;");
            deleteBtn.setOnAction(e -> {
                Order.removeOrder(order);
                loadOrders();
            });

            HBox actions = new HBox(10, completeBtn, deleteBtn);
            actions.setAlignment(Pos.CENTER_LEFT);

            orderCard.getChildren().addAll(titleLabel, itemsBox, totalLabel, actions);
            vBox.getChildren().add(orderCard);
        }
    }
}