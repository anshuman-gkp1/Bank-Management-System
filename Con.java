import java.sql.*;

public class Con{
    Connection connection;
    Statement statement;

    public Con(){
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","pekka@14");
            statement=connection.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}