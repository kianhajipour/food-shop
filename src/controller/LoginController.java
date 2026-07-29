package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view.menu.Main;



public class LoginController {
    String adminPass;
    @FXML
    private TextField passField;
    @FXML
    private Label message;
    public void loginBtn(){
        adminPass = "1234";
        if (passField.getText().equals(adminPass)) {
            Main.showAdminPage();

        }
        else {message.setText("رمز عبور اشتباه است!");}
    }
    public void back(){
        Main.showMainScreen();
    }
}
