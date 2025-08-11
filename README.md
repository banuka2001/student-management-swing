# Simple Java Swing & MySQL CRUD Application
Simple application to demonstrate my skills of Java swing

A basic Java application using **Swing** for the UI and **MySQL** for the database.
It demonstrates:
- Connecting to MySQL using JDBC
- Using `PreparedStatement` for secure queries
- Adding, viewing, and deleting records
- Event handling in Swing

---

## Features
- **Add Data** – Insert records into MySQL
- **View Data** – Display database records in a `JTable`
- **Delete Data** – Remove selected records
- **Swing GUI** – User-friendly interface
- **PreparedStatement** – Protects against SQL injection

---

## Requirements
- Java 8+  
- MySQL Database  
- JDBC Driver (`mysql-connector-j`)

---

## Setup

1. **Clone the repository**
2. **Create database in your pc**
   - Use below SQL Statements to create a database and table.
     CREATE DATABASE studentdb;
     USE studentdb;

     CREATE TABLE students (
         id INT PRIMARY KEY AUTO_INCREMENT,
         name VARCHAR(50),
         email VARCHAR(50) 
     );

3. **Configure database credentials in the Java file**
   
    String url = "jdbc:mysql://localhost:3306/studentdb";
    String user = "your_username";
    String password = "your_password";

4. **Add MySQL Connector dependency to project’s POM.xml.**

5. **Run the application**
