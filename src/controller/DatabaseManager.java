package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Product;
import model.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String userfilePath = "database/users.json";
    private static final String productfilePath = "database/products.json";
    private static final Gson gson = new Gson();

    public static List<User> loadUsers(){
        List<User> users = new ArrayList<>();
        try (FileReader reader = new FileReader(userfilePath)) {
            Type userListType = new TypeToken<ArrayList<User>>() {}.getType();
            users = gson.fromJson(reader, userListType);
            if (users == null) {
                users = new ArrayList<>();
            }
        } catch (IOException e) {

        }
        return users;
    }
    public static void saveUser(String username, String phone) {
        List<User> users = loadUsers();
        users.add(new User(username , phone));

        try(FileWriter fileWriter = new FileWriter(userfilePath)) {
            gson.toJson(users , fileWriter);
        } catch (Exception e) {
            System.out.println("خطا در ذخیره فایل: " + e.getMessage());
        }
    }
    public static boolean nemberExist(String nember){
        List<User> users = loadUsers();
        for (User user : users){
            if (user.getNum().equals(nember))
                return true;
        }
        return false;
    }

    public static List<Product> loadProduct(){
        List<Product> products = new ArrayList<>();
        try (FileReader fileReader = new FileReader(productfilePath)){
            Type productListType = new TypeToken<ArrayList<Product>>() {}.getType();
            products = gson.fromJson( fileReader,productListType );
            if(products == null){
                products = new ArrayList<>();
            }
        } catch (Exception e) {

        }
        return products;
    }

}