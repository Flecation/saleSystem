package project.Utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import project.models.users;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class database {

    public database(){}

    public static ObservableList<users> usersList(){
        ObservableList<users> usersList = FXCollections.observableArrayList();

        try {
            String statement = "SELECT * FROM users";
            CallableStatement cs = databaseConnector.prepareCall(statement);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                users user = new users(
                        rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("userPassword"),
                        rs.getString("userEmail"),
                        rs.getString("userAddress"),
                        rs.getString("userRole"),
                        rs.getString("userImagePath"),
                        rs.getDate("userDob")
                );
                usersList.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usersList;
    }

    public static users userLogin(String name, String password){
            users users = null;
        try {
            String statement = "SELECT * FROM users WHERE userName = ? AND userPassword = ?";
            CallableStatement cs = databaseConnector.prepareCall(statement);
            cs.setString(1,name);
            cs.setString(2,password);
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                users = new users(rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("userPassword"),
                        rs.getString("userEmail"),
                        rs.getString("userAddress"),
                        rs.getString("userRole"),
                        rs.getString("userImagePath"),
                        rs.getDate("userDob"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public static users getUserById(int id){
        users user = null;
        try {
            String statement = "SELECT * FROM users WHERE userId = ?";
            CallableStatement cs = databaseConnector.prepareCall(statement);
            cs.setInt(1,id);
            ResultSet rs = cs.executeQuery();
            if(rs.next()){
                user = new users(
                        rs.getInt("userId"),
                        rs.getString("userName"),
                        rs.getString("userPassword"),
                        rs.getString("userEmail"),
                        rs.getString("userAddress"),
                        rs.getString("userRole"),
                        rs.getString("userImagePath"),
                        rs.getDate("userDob")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }


}
