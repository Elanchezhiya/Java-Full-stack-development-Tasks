package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDB {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL database
        String url = "jdbc:mysql://localhost:3306/sample1";
        String user = "root";
        String password = "Chezhiya@98";

        // SQL statements
        String createTableSQL = "CREATE TABLE Employees ("
                + "empcode INT PRIMARY KEY, "
                + "empname VARCHAR(50), "
                + "empage INT, "
                + "esalary DECIMAL(10, 2))";

        String insertDataSQL = "INSERT INTO Employees (empcode, empname, empage, esalary) VALUES "
                + "(101, 'Jenny', 25, 10000), "
                + "(102, 'Jacky', 30, 20000), "
                + "(103, 'Joe', 20, 40000), "
                + "(104, 'John', 40, 80000), "
                + "(105, 'Shameer', 25, 90000)";

        String selectSQL = "SELECT * FROM Employees";

        // JDBC connection, statement, and result set
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            // Step 1: Create the table
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'Employees' created successfully!");

            // Step 2: Insert data
            statement.executeUpdate(insertDataSQL);
            System.out.println("Data inserted successfully!");

            // Step 3: Query the table
            ResultSet resultSet = statement.executeQuery(selectSQL);
            System.out.println("Employee Details:");
            while (resultSet.next()) {
                int empcode = resultSet.getInt("empcode");
                String empname = resultSet.getString("empname");
                int empage = resultSet.getInt("empage");
                double esalary = resultSet.getDouble("esalary");

                System.out.println(empcode + " | " + empname + " | " + empage + " | " + esalary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
