package HibernateHW;


import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


//        System.out.println(
                session.createQuery("From student ")
                        .list()
                        .forEach(System.out::println);

//        Query q = session.createQuery("From Students.Groups");
//
//        List<Groups> resultList = q.list();
//        System.out.println("num of users :" + resultList.size());
//        for (Groups std : resultList) {
//            System.out.println(std);
//        }




    }
}
