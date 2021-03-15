package CacheHW;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CacheHelper ch = new CacheHelper();

        ch.putCache("names","1", "Petrov");
        ch.getCache("names","1");

    }
}
