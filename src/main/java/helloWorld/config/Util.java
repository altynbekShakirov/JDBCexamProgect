package helloWorld.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

/**
 * The golden boy
 */
public class Util {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","altynbek695");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
