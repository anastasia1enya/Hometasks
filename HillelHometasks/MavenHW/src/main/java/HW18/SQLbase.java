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

        PreparedStatement preparedStatement = connect.prepareStatement("INSERT into Students.Student(name_surname, `group`,yearOfEntering ) values (?,?,?)" );
//        PreparedStatement preparedStatement = connect.prepareStatement("INSERT into Students.Groups(idGroups,group) values (?,?)" );

        try{
//            preparedStatement.setInt(1,100);
            preparedStatement.setString(1,"Johanson Steam");
            preparedStatement.setInt(2,1);
            preparedStatement.setInt(3,2020);
//            preparedStatement.setString(1,"Petrov Ivan");
//            preparedStatement.setString(1,"3");
//            preparedStatement.setString(1,"2015");
           preparedStatement.executeUpdate();

            ResultSet result2 = preparedStatement.executeQuery("select*from Students.Student");

//            System.out.println(result2.getMetaData());

            System.out.println("Выводим PreparedStatement");
            while (result2.next()) {
                System.out.println("Номер в выборке #" + result2.getRow()
                        + "\t Номер в базе #" + result2.getInt("studId")
                        + "\t" + result2.getString("name_surname")
                        + "\t" + result2.getString("group")
                        + "\t" + result2.getInt("yearOfEntering"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}
