CREATE DATABASE new_db_name
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;


CREATE TABLE users (
    id INT AUTO_INCREMENT,
    user_name VARCHAR(255),
    user_email VARCHAR(255) UNIQUE,
    PRIMARY KEY(id)
);

public class Main0 {
    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC",
                "root", "coderslab")) {
            String insert = "INSERT INTO cinemas_ex.movies (title, description, rating) VALUES ('Zombi bobry', 'qweqwe', 10.00)";
Statement statement = conn.createStatement();
statement.executeUpdate(insert);

} catch (SQLException e) {
            e.printStackTrace();
}
    }
}

public class Main00 {
    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC",
                "root", "coderslab")) {
            String select = "select * from movies;";

PreparedStatement preparedStatement = conn.prepareStatement(select);
ResultSet resultSet = preparedStatement.executeQuery();
while (resultSet.next()){
                System.out.println(resultSet.getString("title"));
}

        } catch (SQLException e) {
            e.printStackTrace();
}
    }
}