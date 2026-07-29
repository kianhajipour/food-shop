# 🍕 Food Order System | سیستم سفارش‌گیری خودکار رستوران

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21">
  <img src="https://img.shields.io/badge/JavaFX-GUI-blue?style=for-the-badge&logo=java" alt="JavaFX">
  <img src="https://img.shields.io/badge/Architecture-MVC-green?style=for-the-badge" alt="MVC Architecture">
  <img src="https://img.shields.io/badge/Design-FXML_%26_CSS-purple?style=for-the-badge" alt="FXML & CSS">
</p>

---

[ **English** ] | [ **فارسی** ]

---

## 🇬🇧 English Version

An automated, fast, and light-weight **JavaFX** application designed for self-service food ordering kiosks in restaurants and fast-food venues. Built as a 2–3 day hands-on learning project to explore JavaFX UI development and the **Model-View-Controller (MVC)** Architecture.

This app is optimized for touchscreen Windows devices, allowing customers to place orders independently while instantly pushing incoming orders to the admin/waiter display.

### 📐 Architecture Overview (MVC Pattern)
This project strictly follows the **Model-View-Controller (MVC)** architectural pattern to separate concerns:
* **Model:** Handles data management (`Order`, `Product`, `CategoryModel`).
* **View:** Manages presentation layout using FXML templates and CSS stylesheets.
* **Controller:** Connects UI components with business logic and user interactions.

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
| Component | Technology |
| :--- | :--- |
| **Language** | Java 21 |
| **GUI Framework** | JavaFX (FXMLLoader & Scene Builder) |
| **Design Pattern** | Model-View-Controller (MVC) |
| **Styling** | FXML + Custom CSS |

### 📁 Project Structure
src/
├── controller/       # MVC Controllers (Logic & Event Handlers)
├── model/            # MVC Models (Data Entities)
├── view/menu/        # MVC Views (FXML layouts & CSS styles)
└── Main.java         # Application Entry Point

### 🚀 How to Run
1. Clone the repository:
   git clone https://github.com/your-username/food-shop-project.git
2. Open the project in **IntelliJ IDEA** or your preferred Java IDE.
3. Ensure JavaFX 21 SDK is configured in your project structure.
4. Run `view.menu.Main`.

🔑 **Admin Access Password:** `1234`

---

## 🇮🇷 نسخه فارسی

یک پروژه ساده، سریع و کاربردی که برای مانیتورهای لمسی کیوسک‌های سفارش‌گیری در رستوران‌ها و فست‌فودها طراحی شده است. این اپلیکیشن طی یک تمرین ۲ الی ۳ روزه جهت تسلط بر **JavaFX** و پیاده‌سازی معماری **MVC (Model-View-Controller)** توسعه یافته است.

مشتریان می‌توانند بدون نیاز به گارسون، سفارش خود را از روی مانیتور لمسی ثبت کنند و تمام سفارشات به صورت خودکار و لحظه‌ای در پنل مدیریت/گارسون جمع‌آوری می‌شوند.

### 📐 معماری پروژه (الگوی MVC)
این نرم‌افزار بر اساس الگوی **MVC** جداسازی منطق و لایه‌ها را انجام داده است:
* **مدل (Model):** مدیریت داده‌ها و کلاس‌های اصلی برنامه (`Order`, `Product`, `CategoryModel`).
* **ویو (View):** طراحی رابط کاربری و صفحات لمسی با FXML و استایل‌دهی CSS.
* **کنترلر (Controller):** ارتباط‌دهنده رویدادهای کاربر به داده‌ها و منطق برنامه.

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
| بخش | تکنولوژی / الگوی استفاده‌شده |
| :--- | :--- |
| **زبان برنامه‌نویسی** | Java 21 |
| **رابط کاربری** | JavaFX (به همراه FXMLLoader و Scene Builder) |
| **معماری نرم‌افزار** | Model-View-Controller (MVC) |
| **استایل و دیزاین** | FXML + CSS سفارشی |

### 📁 ساختار پروژه
src/
├── controller/       # لایه کنترلرها (ارتباط منطق و فرم‌ها)
├── model/            # لایه مدل‌ها (ساختار داده‌ها و سفارشات)
├── view/menu/        # لایه ویو (فایل‌های FXML و استایل‌های CSS)
└── Main.java         # نقطه شروع و اجرای اصلی برنامه

### 🚀 نحوه اجرا
1. پروژه را کلون کنید:
   git clone https://github.com/your-username/food-shop-project.git
2. پروژه را در محیط **IntelliJ IDEA** باز کنید.
3. از تنظیم بودن SDK جاوا و کتابخانه‌های JavaFX اطمینان حاصل کنید.
4. فایل `view.menu.Main` را اجرا کنید.

🔑 **رمز عبور ادمین:** `1234`
