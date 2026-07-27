package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view.menu.Main;

public class RegesterController {

    @FXML
    private TextField userName;
    @FXML
    private TextField num;
    @FXML
    private Label log;

    @FXML
    public void enter(){
        String Name = userName.getText();
        String userNum = num.getText();

        StringBuilder sb = new StringBuilder();

        if(!Validator.validNumFormat(userNum)){
            sb.append("فرمت شماره تلفن اشتباه است\n");
        }
        if(DatabaseManager.nemberExist(userNum)){
            sb.append("این شماره تلفن قبلا ثبت شده!\n");
        }
        if(!Validator.validNameFormat(Name)){
            sb.append("نام باید بین ۳ تا ۲۰ کاراکتر باشد\n");
        }
        String message = sb.toString();
        log.setText(message);

        if(message.isEmpty()){
            log.setText("ثبت‌نام با موفقیت انجام شد!");
            DatabaseManager.saveUser(Name , userNum);
        }
    }
    public void back(){
        Main.showLoginScreen();
    }
}