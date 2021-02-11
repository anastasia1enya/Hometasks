package HW18;

import java.sql.*;

public class SQLbase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager
                .getConnection("jdbc:mysql://localhost: 3306/Students?"+"user=root&password=rootroot");
        Statement statement = connect.createStatement();
        ResultSet resultset = statement.executeQuery("select*from Students.Student");
        System.out.println(resultset.getMetaData());

        PreparedStatement preparedStatement = connect.prepareStatement("INSERT into Students.Student(studId,name_surname, group) values (?,?,?)" );
        PreparedStatement preparedStatement1 = connect.prepareStatement("INSERT into Students.Student(name_surname) values (?)" );

        try{
            preparedStatement.setInt(1,15);
            preparedStatement.setString(2,"Johanson Steam");
            preparedStatement.setInt(3,1);
//            preparedStatement.setInt(4,2020);
//            preparedStatement.setString(1,"Petrov Ivan");
//            preparedStatement.setString(1,"3");
//            preparedStatement.setString(1,"2015");
            preparedStatement.executeUpdate();

//            ResultSet result2 = preparedStatement.executeQuery();

            System.out.println("Выводим PreparedStatement");
//            while (result2.next()) {
//                System.out.println("Номер в выборке #" + result2.getRow()
//                        + "\t Номер в базе #" + result2.getInt("id")
//                        + "\t" + result2.getString("username"));
//            }

        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}
