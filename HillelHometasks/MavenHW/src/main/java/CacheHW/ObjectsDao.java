package CacheHW;
import CacheClass.CacheHelper;
import lombok.AllArgsConstructor;
import org.ehcache.Cache;

import java.util.HashMap;

//@AllArgsConstructor
public class ObjectsDao {

    private CacheHelper cache;

//    public UserDao(CacheHelper cache) {
//        this.cache = cache;
//    }



    public Object getCache(String cacheName, String key) throws InterruptedException {
        Cache ch = cache.getUserCache();


        if (ch.containsKey(cacheName) && ch.containsKey(key)) {
            System.out.println("get value from cache");
            return (Object) ch.get(key);
        } else {

            return String.format("value not found in cache with id : %s", key);

        }

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.print("#");
//        }
//        System.out.println();
//        System.out.println("get value from DB");
//        Objects user = new Objects(id, "Ivan", "Ivanov", 27, "phone", "email");
//        ch.put(id, user);


    }
    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException{
        Cache ch = cache.getUserCache();


        if (ch.containsKey(cacheName) ) {
            ch.put(cacheName,new HashMap<String,Object>());
            System.out.println("sucses");
            return true;
        } else {
            System.out.println("false");
            return false;

        }

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.print("#");
//        }
//        System.out.println();
//        System.out.println("get value from DB");
//        Objects user = new Objects(id, "Ivan", "Ivanov", 27, "phone", "email");
////        ch.put(id, user);
//        ch.put(cacheName,new HashMap<String,Object>());

    }


}
