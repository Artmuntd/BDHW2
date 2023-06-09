import java.sql.*;

public class Application {
    public static void main(String[] args) {
        String user = "postgres";
        String password = "your_password";
        String url = "jdbc:postgresql://localhost:5432/skypro";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            int employeeId = 1;


            String query = "SELECT * FROM employees WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, employeeId);
                ResultSet resultSet = preparedStatement.executeQuery();


                if (resultSet.next()) {
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String gender = resultSet.getString("gender");
                    String city = resultSet.getString("city");

                    System.out.println("Employee ID: " + employeeId);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Last Name: " + lastName);
                    System.out.println("Gender: " + gender);
                    System.out.println("City: " + city);
                } else {
                    System.out.println("Employee not found for ID: " + employeeId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}