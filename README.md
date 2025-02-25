## **Student Management System** 🎓  
A **Java-based desktop application** for managing student records using **Swing for GUI** and **JDBC for database operations**.

### **Features** 🚀  
✅ Add new students with name, age, and grade.  
✅ Update student details dynamically.  
✅ Delete student records.  
✅ View all student records in a table format.  
✅ Uses **MySQL** for data storage.  

### **Tech Stack** 🛠  
- **Programming Language:** Java (Swing, JDBC)  
- **Database:** MySQL  
- **IDE Used:** IntelliJ IDEA / Eclipse / NetBeans  
- **Version Control:** Git  

### **Installation & Setup** ⚙️  
1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/Student-Management-System.git
   cd Student-Management-System
   ```
2. Setup MySQL database:
   - Create a database named `student_db`.  
   - Import the provided SQL file (`database.sql`).  
   - Update `DatabaseHelper.java` with your **MySQL credentials**.  

3. Run the application:  
   - Compile and execute `Main.java`.  
   - The GUI window will open for student management.  

### **Database Schema** 🗄  
```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    grade VARCHAR(10) NOT NULL
);
```

### **Screenshots** 📸  
![image](https://github.com/user-attachments/assets/b4c59064-83e8-44cb-be17-873d75e6acb8)


### **Contributing** 🤝  
Feel free to fork and improve the project. Pull requests are welcome!  

### **License** 📝  
This project is open-source and available under the **MIT License**.  

---

Let me know if you need any modifications! 🚀
