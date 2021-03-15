package CacheHW;

import static CacheHW.CacheHelper.loggerInfo;
import static CacheHW.CacheHelper.loggerWarn;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CacheHelper ch = new CacheHelper();

        ch.putCache("names","1", "Petrov");
//        System.out.println(ch.toString());
        loggerInfo.info("Print of cache"+ ch.toString());
        ch.putCache("names","2", "Ivanov");
        loggerInfo.info("Print of cache"+ch.toString());
//        System.out.println(ch.toString());
        ch.putCache("lol","3", "Andrew");
        loggerInfo.info("Print of cache"+ch.toString());
//        System.out.println(ch.toString());
        System.out.println(ch.getCache("names", "2"));
        loggerInfo.info("Print of cache"+ch.toString());
        ch.clearCache("lol");
//        System.out.println(ch.toString());
    }
}
