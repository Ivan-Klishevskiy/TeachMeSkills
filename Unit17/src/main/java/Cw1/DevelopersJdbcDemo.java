package Cw1;

import java.sql.*;

public class DevelopersJdbcDemo {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/tutorial?" +
            "allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws SQLException {
        String sql ="SELECT * FROM developers";
        try (Connection connection = DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);){
                while (resultSet.next()) {
                    System.out.println("=============");
                    System.out.println("id:" +resultSet.getInt("id"));
                    System.out.println("Name: "+resultSet.getString("name"));
                    System.out.println("Specialty: "+resultSet.getString("specialty"));
                    System.out.println("Salary: $"+resultSet.getString("salary"));
                }
            }
        }
    }
}
