package project.Utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.CallableStatement;
import java.sql.Connection;

public class databaseConnector {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/salesystem");
        config.setUsername("root");
        config.setPassword("123456");

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);

        dataSource = new HikariDataSource(config);
    }

   public static Connection getConnection() throws Exception {
        return dataSource.getConnection();
    }

    public static CallableStatement prepareCall(String s) {
        try {
            Connection conn = getConnection();
            return conn.prepareCall(s);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
