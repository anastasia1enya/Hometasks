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

//        PreparedStatement preparedStatement = connect.prepareStatement("INSERT into Students.Student(name_surname, `group`,yearOfEntering ) values (?,?,?)" );
//
//        try{
//
//            preparedStatement.setString(1,"Johanson Steam");
//            preparedStatement.setInt(2,1);
//            preparedStatement.setInt(3,2020);
//           preparedStatement.executeUpdate();
//
//            ResultSet result2 = preparedStatement.executeQuery("select*from Students.Student");
//
//
//            System.out.println("Выводим PreparedStatement");
//            while (result2.next()) {
//                System.out.println("Номер в выборке #" + result2.getRow()
//                        + "\t Номер в базе #" + result2.getInt("studId")
//                        + "\t" + result2.getString("name_surname")
//                        + "\t" + result2.getString("group")
//                        + "\t" + result2.getInt("yearOfEntering"));
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        PreparedStatement preparedStatement1 = connect.prepareStatement("SELECT \n" +
                "    Student\n" +
                "FROM\n" +
                "    referential_constraints\n" +
                "WHERE\n" +
                "    constraint_schema = 'Students'\n" +
                "        AND referenced_table_name = 'group'\n" +
                "        AND delete_rule = 'CASCADE'" );

        try{
////          preparedStatement.setInt(1,100);
//            preparedStatement1.setString(1,"Johanson Steam");
//            preparedStatement1.setInt(2,1);
//            preparedStatement1.setInt(3,2020);
//            preparedStatement.setString(1,"Petrov Ivan");
//            preparedStatement.setString(1,"3");
//            preparedStatement.setString(1,"2015");


            ResultSet result3 = preparedStatement1.executeQuery("\"SELECT \\n\" +\n" +
                    "                \"    Student\\n\" +\n" +
                    "                \"FROM\\n\" +\n" +
                    "                \"    referential_constraints\\n\" +\n" +
                    "                \"WHERE\\n\" +\n" +
                    "                \"    constraint_schema = 'Students'\\n\" +\n" +
                    "                \"        AND referenced_table_name = 'group'\\n\" +\n" +
                    "                \"        AND delete_rule = 'CASCADE'\" ");
//            preparedStatement1.executeUpdate();

//            System.out.println(result2.getMetaData());

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
