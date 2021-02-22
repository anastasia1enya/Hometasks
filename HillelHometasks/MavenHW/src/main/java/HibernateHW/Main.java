package HibernateHW;


import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;


public class Main {
    public static void main(String[] args) {

//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//
//                session.createQuery("From Student")
//                        .list()
//                        .forEach(System.out::println);
//
//

Creation c = new Creation("Vasya Petrov",2,1999);
c.recordsAdd();

    }
}
