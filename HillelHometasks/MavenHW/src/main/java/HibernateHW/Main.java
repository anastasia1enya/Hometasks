package HibernateHW;


import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;


public class Main {
    public static void main(String[] args) {

Creation c = new Creation();
////c.recordsAdd("Artem Petyk",2,2006);
c.recordsFindName("Artem Petyk");
//c.recordsFindId(2);

    }
}
