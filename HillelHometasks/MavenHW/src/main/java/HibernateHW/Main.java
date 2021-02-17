package HibernateHW;


import org.hibernate.Session;



public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


//        System.out.println(
                session.createQuery("From Student ")
                        .list()
                        .forEach(System.out::println);

//        Query q = session.createQuery("From Students.Student");

//        List<User> resultList = q.list();
//        System.out.println("num of users :" + resultList.size());
//        for (User usr : resultList) {
//            System.out.println(usr);
//        }
//
//        q = session.createQuery("From UserShort");
//
//        List<UserShort> rList = q.list();
//        for (UserShort usr : rList) {
//            System.out.println(usr);
//        }


    }
}
