package CacheHW;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CacheHelper ch = new CacheHelper("put");

        ObjectsDao dao = new ObjectsDao();

        System.out.println(dao.putCache(ch.getName(), "1", 85));

    }
}
