package HibernateHW;

import org.hibernate.Query;
import org.hibernate.Session;

import javax.transaction.Transaction;

public class Creation {

    public void recordsAdd( String name,String group, int year)
    {
        try {
            System.out.println("Добавление записи в таблицу БД");

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query1 = session.createSQLQuery("INSERT INTO Students\n" +
                    "(name_surname,group,yearOfEntering) \n" +
                    "VALUES \n" +
                 (name+group+year)
                    );


            query1.executeUpdate();
            session.getTransaction().commit();
            query1.toString();
            session.close();
            System.out.println("Succsess!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
