package HibernateHW;

import org.hibernate.Query;
import org.hibernate.Session;

import javax.transaction.Transaction;


public class Creation {

    String name;
    String group;
    int year;

    Creation(String name,String group, int year){
        this.name=name;
        this.group=group;
        this.year=year;
    }

    public void recordsAdd( )
    {
        try {
            System.out.println("Добавление записи в таблицу БД");

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
//            Query query1 = session.createSQLQuery("INSERT INTO Student\n" +
//                    "(name_surname,group,yearOfEntering) \n" +
//                    "VALUES \n" +
//                 name+group+year
//                    );
            Query query2=  session.createQuery("INSERT INTO student\n" +
                    "(name_surname,group,yearOfEntering) \n" +
                            "VALUES \n" +
                            name+group+year
            );
//                        .list();
//                        .forEach(System.out::println);

//            query2.executeUpdate();
            session.save(query2);
            session.getTransaction().commit();

            query2.list()
                        .forEach(System.out::println);
            session.close();
            System.out.println("Succsess!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
