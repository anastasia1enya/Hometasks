package CacheHW;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CacheHelper ch = new CacheHelper();

        ch.putCache("names","1", "Petrov");
        System.out.println(ch.toString());
        ch.putCache("names","2", "Ivanov");
        System.out.println(ch.toString());
        ch.putCache("lol","3", "Andrew");
        System.out.println(ch.toString());
        System.out.println(ch.getCache("names", "2"));

        ch.clearCache("lol");
        System.out.println(ch.toString());
    }
}
