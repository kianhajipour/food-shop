package view.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        primaryStage.setTitle("سیستم سفارش غذا - ورود");

        Parent root = FXMLLoader.load(Main.class.getResource("/view/menu/login.fxml"));
        scene = new Scene(root);
        scene.getStylesheets().add(Main.class.getResource("/view/menu/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showLoginScreen() {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("/view/menu/login.fxml"));
            scene.setRoot(root);
            primaryStage.setTitle("سیستم سفارش غذا - ورود");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void regesterScreen() {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("/view/menu/register.fxml"));
            scene.setRoot(root);
            primaryStage.setTitle("سیستم سفارش غذا - ثبت نام");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void showMainScreen() {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("/view/menu/mainMenu.fxml"));
            scene.setRoot(root);
            primaryStage.setTitle("سیستم سفارش غذا - ورود");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}