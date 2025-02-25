# **Student Management System** 🎓  
The **Student Management System (SMS)** is a **Java-based desktop application** designed to help manage student records efficiently. This project is built using **Java Swing** for the graphical user interface and **JDBC (Java Database Connectivity)** for database interactions with **MySQL**.  

The system provides a **user-friendly interface** where users can **add, update, delete, and view student details**. This project is particularly useful for students, beginners in Java, and those looking to learn **GUI programming, database handling, and CRUD operations** in Java.  

---

## **Project Description** 📖  
The **Student Management System** is a **simple yet effective** tool for managing student data within an educational institution. The application allows users to perform fundamental operations on student records, such as:  

🔹 **Adding new students** with details like Name, Age, and Grade.  
🔹 **Modifying existing student information** dynamically without affecting other data.  
🔹 **Deleting student records** from the database.  
🔹 **Displaying all students** in a tabular format for easy access and readability.  
🔹 **Ensuring data persistence** using MySQL as the backend database.  

The project follows a **modular architecture**, separating concerns into different files to maintain **code clarity, efficiency, and scalability**.  

---

## **Project Features** ✨  
The **Student Management System** comes with the following features:  

✅ **Graphical User Interface (GUI):** Built using **Swing** to provide a user-friendly experience.  
✅ **Student Data Management:** Users can **Add, Update, Delete, and View** student details.  
✅ **Database Integration:** Uses **MySQL** for persistent data storage.  
✅ **Real-time Updates:** Any changes made to student records are immediately reflected in the database.  
✅ **Error Handling & Validations:** Ensures correct user inputs to prevent incorrect database entries.  
✅ **Modular Code Structure:** Organized files to separate **business logic, UI, and database operations**.  

---

## **Project Structure** 📂  
The **Student Management System** is divided into different components for better organization and maintainability:  

📁 **Student Management System**  
├── 📄 `Main.java` – The entry point of the application.  
├── 📄 `Student.java` – Model class representing student details (Encapsulates student attributes).  
├── 📄 `DatabaseHelper.java` – Handles **MySQL connectivity** and **CRUD operations** using JDBC.  
├── 📄 `StudentForm.java` – The GUI form for **adding/updating/deleting** student details.  
├── 📄 `StudentTable.java` – Displays student records in a **JTable** format.  

Each file has a **specific responsibility**, ensuring a **clean and maintainable codebase**.  

---

## **Technology Stack Used** 🛠  
The project is developed using:  

🔹 **Java SE (Standard Edition)** – Core programming language.  
🔹 **Swing** – Java’s built-in GUI framework for designing the graphical interface.  
🔹 **JDBC (Java Database Connectivity)** – To interact with **MySQL** database.  
🔹 **MySQL** – For storing student data persistently.  

---

## **How It Works?** ⚡  
The **Student Management System** works as follows:  

### **1️⃣ Adding a Student**  
- Users enter **Name, Age, and Grade** in the GUI form.  
- Clicking the **"Add Student"** button stores the details in the **MySQL database**.  
- The **JTable** updates to show the newly added student.  

### **2️⃣ Updating a Student Record**  
- Users select a student from the **table**.  
- They modify the required details and click the **"Update Student"** button.  
- The changes are saved in the **MySQL database** and updated in the table.  

### **3️⃣ Deleting a Student Record**  
- Users select a student from the table.  
- Clicking **"Delete Student"** removes the record from the **MySQL database** permanently.  
- The **JTable refreshes** to reflect the changes.  

### **4️⃣ Viewing Student Records**  
- All student records are **retrieved from MySQL** and displayed in a **JTable** on the UI.  
- Users can scroll and view the details dynamically.  

---

### **Screenshots** 📸  
![image](https://github.com/user-attachments/assets/b4c59064-83e8-44cb-be17-873d75e6acb8)
![image](https://github.com/user-attachments/assets/e8e22801-6de0-4f5b-a943-d439de9313b1)


