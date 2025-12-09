package project.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databaseConnection {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url ="jdbc:mysql://localhost:3306/saleSystem";
       String pw = "123456";
       Connection con = DriverManager.getConnection(url,"root",pw);
       return  con;
    }

}
