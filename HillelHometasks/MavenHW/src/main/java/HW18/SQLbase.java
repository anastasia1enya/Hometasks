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

        try{

            preparedStatement.setString(1,"Johanson Steam");
            preparedStatement.setInt(2,1);
            preparedStatement.setInt(3,2020);
           preparedStatement.executeUpdate();

            ResultSet result2 = preparedStatement.executeQuery("select*from Students.Student");


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

        PreparedStatement preparedStatement1 = connect.prepareStatement("DELETE FROM Students.Student WHERE studId >4" );


        try{


            preparedStatement1.executeUpdate();
            ResultSet result3 = preparedStatement1.executeQuery("select*from Students.Student ");



            System.out.println("Выводим PreparedStatement");
            while (result3.next()) {
                System.out.println("Номер в выборке #" + result3.getRow()
                        + "\t Номер в базе #" + result3.getInt("studId")
                        + "\t" + result3.getString("name_surname")
                        + "\t" + result3.getString("group")
                        + "\t" + result3.getInt("yearOfEntering"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
