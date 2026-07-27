package controller;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import view.menu.Main;

public class LoginController {

    @FXML
    private TextField phoneTextField;

    @FXML
    private Label messageLable;

    @FXML
    public void loginBtn(){
        String phoneNumber = phoneTextField.getText();
        if(Validator.validNumFormat(phoneNumber)){
            messageLable.setText("ورود موفقیت آمیز بود");
            Main.showMainScreen();
        }
        else{
            messageLable.setText("فرمت شماره تلفن اشتباه است");
        }
        autoHideMessage();
    }

    @FXML
    public void newUserBtn(){
        String phoneNumber = phoneTextField.getText();
        System.out.println("ثبت نام با شماره: " + phoneNumber);
        Main.regesterScreen();

    }

    private void autoHideMessage() {
        PauseTransition delay = new PauseTransition(Duration.seconds(2));

        delay.setOnFinished(event -> {
            messageLable.setText("");
        });

        delay.play();
    }
}