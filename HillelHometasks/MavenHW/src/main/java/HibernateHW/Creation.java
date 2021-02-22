package HibernateHW;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

import static HibernateHW.HibernateUtil.shutdown;


public class Creation {


    public void recordsAdd( String name,int group, int year)
    {
        try {
            System.out.println("Добавление записи в таблицу БД");

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            Student s = new Student();

            s.setGroup(group);
            s.setName_surname(name);
            s.setYearOfEntering(year);

            session.save(s);
            session.getTransaction().commit();

            System.out.println(s.toString());
            shutdown();
            System.out.println("Succsess!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void recordsFindName( String name_surname)
    {
        try {
            System.out.println("Поиск студента");

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            String hql = "FROM Student where name_surname = :paramName";
            Query query = session.createQuery(hql);
            query.setParameter("paramName", name_surname);
            List<Student> studentList = query.list();
            studentList.forEach(System.out::println);

            shutdown();
            System.out.println("Succsess!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void recordsFindId( int id)
    {
        try {
            System.out.println("Поиск студента");

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            String hql = "FROM Student where studId = " + id;
            Query query = session.createQuery(hql);
            List<Student> studentList = query.list();
            studentList.forEach(System.out::println);

            shutdown();
            System.out.println("Succsess!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
