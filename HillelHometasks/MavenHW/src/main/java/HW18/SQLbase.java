package HW18;

import java.sql.*;

public class SQLbase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection = null;
        //URL к базе состоит из протокола:подпротокола://[хоста]:[порта_СУБД]/[БД] и других_сведений
        String url = "jdbc:mysql://localhost: 3306/Students?";
        //Имя пользователя БД
        String name = "root";
        //Пароль
        String password = "rootroot";
        try {

//            .getConnection("jdbc:mysql://localhost: 3306/Students?" + "user=root&password=rootroot");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager
                    .getConnection(url,name,password);
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("select*from Students.Student");
            System.out.println(resultset.getMetaData());
//добавление данных
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into Students.Student(name_surname, `group`,yearOfEntering ) values (?,?,?)");

            try {

                preparedStatement.setString(1, "Johanson Steam");
                preparedStatement.setInt(2, 1);
                preparedStatement.setInt(3, 2020);
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
//удаление данных
            PreparedStatement preparedStatement1 = connection.prepareStatement("DELETE FROM Students.Student WHERE studId >4");

            try {

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

            } catch (SQLException e) {
                e.printStackTrace();
            }


        } finally {
            if (connection != null) {
                try {
                    System.out.println("Connection closed");
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("SQLException");
                }
            }
        }

    }
}
