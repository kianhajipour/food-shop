package controller;

import javafx.fxml.FXML;
import model.CategoryModel;
import view.menu.Main;

public class CategoryBar {

    @FXML
    public void irani(){
        Main.showCateScreen(CategoryModel.IRANI);
    }
    @FXML
    public void deser(){
        Main.showCateScreen(CategoryModel.DESSERT);
    }
}
