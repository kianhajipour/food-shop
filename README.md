# 🍕 Food Order System | سیستم سفارش‌گیری خودکار رستوران

[ **English** ] | [ **فارسی** ]

---

## 🇬🇧 English Version

An automated, fast, and light-weight JavaFX application designed for self-service food ordering kiosks in restaurants and fast-food venues. Built as a 2–3 day hands-on learning project to explore **JavaFX UI development** and the **MVC Architecture**.

This app is optimized for touchscreen Windows devices, allowing customers to place orders independently while instantly pushing incoming orders to the admin/waiter display.

### ✨ Key Features
* 🖥️ **Main Menu Showcase:** Displays products with custom images, names, and prices.
* 📂 **Categories:** Filters menu items based on food categories.
* 🏷️ **Sorting Options:** Sorts menu items by price (ascending/descending).
* 🛒 **Cart Management:** Stores selected items in real-time before checkout.
* 🔐 **Admin Panel:**
  * Quick authentication via top user icon (Default Password: `1234`).
  * Views live customer orders along with total costs and itemized lists.
  * Allows admins/waiters to complete (dismiss) or delete active orders.

### 🛠️ Tech Stack & Requirements
* **Language:** Java 21
* **UI Framework:** JavaFX (FXMLLoader & Scene Builder)
* **Architecture:** Model-View-Controller (MVC)
* **Styling:** FXML with custom CSS stylesheets

### 📁 Project Structure
src/
├── controller/
├── model/
├── view/menu/
└── Main.java

### 🚀 How to Run
1. Clone the repository:
   git clone https://github.com/your-username/food-shop-project.git
2. Open the project in **IntelliJ IDEA** or your preferred Java IDE.
3. Ensure JavaFX 21 SDK is configured in your project structure.
4. Run `view.menu.Main`.

🔑 **Admin Access Password:** `1234`

---

## 🇮🇷 نسخه فارسی

یک پروژه ساده، سریع و کاربردی که برای مانیتورهای لمسی کیوسک‌های سفارش‌گیری در رستوران‌ها و فست‌فودها طراحی شده است. این اپلیکیشن طی یک تمرین ۲ الی ۳ روزه جهت تسلط بر **JavaFX** و معماری **MVC** پیاده‌سازی شده است.

مشتریان می‌توانند بدون نیاز به گارسون، سفارش خود را از روی مانیتور لمسی ثبت کنند و تمام سفارشات به صورت خودکار و لحظه‌ای در پنل مدیریت/گارسون جمع‌آوری می‌شوند.

### ✨ ویژگی‌های اصلی
* 🖥️ **منو و ویترین اصلی:** نمایش جذاب غذاها همراه با تصویر، عنوان و قیمت.
* 📂 **دسته‌بندی موضوعی:** تفکیک غذاها بر اساس گروه‌بندی (پیتزا، نوشیدنی و...).
* 🏷️ **مرتب‌سازی قیمت:** قابلیت مرتب‌سازی اقلام بر اساس قیمت (صعودی/نزولی).
* 🛒 **سبد خرید موقت:** نگهداری اقلام انتخابی کاربر و محاسبه خودکار قیمت کل.
* 🔐 **پنل اختصاصی ادمین:**
  * ورود سریع از طریق آیکون پروفایل در بالای صفحه (رمز عبور پیش‌فرض: `1234`).
  * نمایش کامل اقلام هر سفارش، شماره سفارش و مبلغ کل.
  * امکان مدیریت، اتمام سفارش (تحویل غذا) یا حذف آن.

### 🛠️ تکنولوژی‌های استفاده‌شده
* **زبان برنامه‌نویسی:** Java 21
* **رابط کاربری:** JavaFX (به همراه FXMLLoader و Scene Builder)
* **معماری پروژه:** MVC (Model - View - Controller)
* **استایل‌دهی:** FXML + CSS سفارشی

### 📁 ساختار پروژه
src/
├── controller/
├── model/
├── view/menu/
└── Main.java

### 🚀 نحوه اجرا
1. پروژه را کلون کنید:
   git clone https://github.com/your-username/food-shop-project.git
2. پروژه را در محیط **IntelliJ IDEA** باز کنید.
3. از تنظیم بودن SDK جاوا و کتابخانه‌های JavaFX اطمینان حاصل کنید.
4. فایل `view.menu.Main` را اجرا کنید.

🔑 **رمز عبور ادمین:** `1234`
