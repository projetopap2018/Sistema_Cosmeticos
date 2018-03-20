package Conexao;

import java.sql.*;

public class ConectaBanco {

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "1234");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
