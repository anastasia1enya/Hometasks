package home.com.Сloneable;
import java.util.ArrayList;
public class test {

        public static void main(String[] args) {
            //Arrays
            ArrayList<String> serials = new ArrayList();
            serials.add("Supernatural");
            serials.add("Vampire diaries");
            serials.add("How i met you mother");
            serials.add("Game of thrones");
            System.out.println(serials);
            serials.add(3,"Margosha");
            System.out.println(serials);
            serials.remove(2);
            System.out.println(serials);
            serials.set(1,"True blood");
            System.out.println(serials);
            System.out.println(serials.size());

        }
    }

