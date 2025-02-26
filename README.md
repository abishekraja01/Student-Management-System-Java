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
Here’s the **Installation & Setup Guide** without the command line process.  

---

# **📌 Installation & Setup Guide: Student Management System**

## **🛠️ Prerequisites**
Before running the project, ensure you have the following installed on your system:  
- **Java Development Kit (JDK) 8+** → [Download Here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  
- **MySQL Database** → [Download Here](https://dev.mysql.com/downloads/mysql/)  
- **MySQL Connector/J (JAR file)** → [Download Here](https://dev.mysql.com/downloads/connector/j/)  
- **Apache NetBeans / IntelliJ IDEA (Recommended IDEs)** → [Download Here](https://www.jetbrains.com/idea/download/?section=windows)  

---

## **📥 Installation Steps**

### **1️⃣ Download the Project Files**
- Extract the downloaded project folder to a suitable location on your system.  

### **2️⃣ Install & Configure MySQL Database**
1. **Install MySQL** from [MySQL Official Website](https://dev.mysql.com/downloads/mysql/).  
2. Open **MySQL Workbench** or **Command Line** and create a new database:
   ```sql
   CREATE DATABASE student_management;
   ```
3. **Select the database**:
   ```sql
   USE student_management;
   ```
4. **Create the students table**:
   ```sql
   CREATE TABLE students (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100) NOT NULL,
       age INT NOT NULL,
       grade VARCHAR(10) NOT NULL
   );
   ```
5. (Optional) Insert sample data:  
   ```sql
   INSERT INTO students (name, age, grade) VALUES ('John Doe', 20, 'A');
   INSERT INTO students (name, age, grade) VALUES ('Jane Smith', 22, 'B');
   ```

---

## **📂 Adding MySQL Connector/J (JAR File) to Project**
### **3️⃣ Download MySQL Connector/J**
1. Go to [MySQL Connector/J Official Page](https://dev.mysql.com/downloads/connector/j/).  
2. Download the latest version **(Platform Independent - ZIP Archive)**.  
3. Extract the ZIP file and locate **`mysql-connector-java-<version>.jar`**.  

### **4️⃣ Add MySQL Connector to Project**
#### **🔹 In NetBeans**  
1. **Right-click the project** → `Properties`.  
2. Go to `Libraries` → Click `Add JAR/Folder`.  
3. Select **`mysql-connector-java-<version>.jar`** and click `Open`.  
4. Click `OK` to save changes.  

#### **🔹 In IntelliJ IDEA**  
1. **Right-click the project** → `Open Module Settings`.  
2. Go to `Libraries` → Click `+ (Add Library)`.  
3. Select **`mysql-connector-java-<version>.jar`** and click `Apply`.  

---

## **⚙️ Configure & Run the Project**

### **5️⃣ Open the Project in an IDE**
- **NetBeans**: Click `File > Open Project`, then select the extracted project folder.  
- **IntelliJ IDEA**: Click `Open` and select the project directory.  

### **6️⃣ Configure Database Credentials**
Edit **`DatabaseHelper.java`** file and update MySQL credentials:
```java
private static final String URL = "jdbc:mysql://localhost:3306/student_management";
private static final String USER = "your_mysql_username";
private static final String PASSWORD = "your_mysql_password";
```

### **7️⃣ Run the Project**
- Click the **"Run" button** in NetBeans/IntelliJ.  

---

## **🚀 Features of the Student Management System**
✔️ **Add New Students**  
✔️ **Update Student Details**  
✔️ **Delete Students**  
✔️ **View Student List**  
✔️ **Interactive GUI using Java Swing**  
✔️ **MySQL Database Integration**  

---

## **🛠️ Troubleshooting**
### **1️⃣ Database Connection Issues?**
- Ensure MySQL is **running** (`mysql -u root -p` to check).  
- Verify MySQL **username and password** in `DatabaseHelper.java`.  

### **2️⃣ MySQL Driver Not Found?**
- Download the **MySQL Connector JAR** from [here](https://dev.mysql.com/downloads/connector/j/).  
- Add it to the classpath in your IDE settings.  

### **3️⃣ GUI Not Opening?**
- Make sure **Java Swing is supported** (JDK 8+ recommended).  

---

### **Screenshots** 📸  
![image](https://github.com/user-attachments/assets/b4c59064-83e8-44cb-be17-873d75e6acb8)
![image](https://github.com/user-attachments/assets/e8e22801-6de0-4f5b-a943-d439de9313b1)


