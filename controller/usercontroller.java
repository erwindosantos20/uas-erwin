package controller;

import model.user;

import java.sql.*;

public class usercontroller {
    private Connection connection;

    public UserController() {
        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db_uas", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User loginUser(String email, String password) {
        try {
            String query = "SELECT * FROM Users WHERE email = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                return new User(id, name, email, password);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
