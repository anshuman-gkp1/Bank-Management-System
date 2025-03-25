import java.sql.*;

public class ConFile{
    Connection connection;
    Statement statement;

    public ConFile(){
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","pekka@14");
            statement=connection.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
