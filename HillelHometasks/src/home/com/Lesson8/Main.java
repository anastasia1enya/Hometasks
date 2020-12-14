package home.com.Lesson8;



public class Main {

    public static void main(String[] args) {

        // взаимодейтсвуем с коллекцией
        Collections coll = new Collections();

        coll.add(5);
        coll.add(6);
        coll.add(7);
        coll.add(8);
        coll.add(9);
        coll.add(10);
        System.out.println(coll.toString());

        Collections coll2 = coll;

        Collections str = new Collections();

        str.add(5);
        str.add(6);
        str.add(7);
        str.add(8);
        str.add(9);
        str.add(10);

        System.out.println(str.toString());

        System.out.println(coll.equals(str));
        System.out.println(coll.equals(coll2));

        System.out.println("contain?");
        System.out.println(coll.contain(8));
        System.out.println(coll.contain(null));
        System.out.println(coll.size());
        System.out.println(coll.toString());
        coll.clear();
        System.out.println(coll.toString());
        System.out.println(coll.size());

        str.add(3,90);
        System.out.println(str.toString());
        System.out.println(str.get(2));
        System.out.println(str.get(20));

        System.out.println(coll.equals(str));
    }
}
