package controller;

public class Validator {
    public static boolean validNumFormat(String num) {
        if (num == null) {
            return false;
        }
        return num.matches("^09\\d{9}$");
    }

    public static boolean validNameFormat(String name) {
        if (name == null) {
            return false;
        }
        // حروف فارسی، انگلیسی، اعداد و فاصله، با طول بین ۳ تا ۲۰ کاراکتر
        return name.matches("^[a-zA-Zآ-یةكچپژگ0-9\\s]{3,20}$");
    }
}
