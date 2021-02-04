package HW18;

import java.sql.*;

public class SQLbase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager
                .getConnection("jdbc:mysql://localhost: 3306/Students?"+"user=root&password=rootroot");
        Statement statement = connect.createStatement();
        ResultSet resultset = statement.executeQuery("select*from Students.Groups");
        System.out.println(resultset.getMetaData());

        PreparedStatement preparedStatement = connect.prepareStatement("insert into student " );


    }
}
