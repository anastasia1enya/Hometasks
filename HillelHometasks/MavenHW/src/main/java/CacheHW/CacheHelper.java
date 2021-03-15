package CacheHW;

import CacheClass.User;

import java.util.HashMap;
import java.util.Objects;

public class CacheHelper {

    private HashMap<String, HashMap<String, Object>> userCache;

    private HashMap<String, Object> userCache1;

    CacheHelper() {
        userCache = new HashMap<>();
    }


    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException {

        if (userCache.containsKey(cacheName)) {

            userCache.get(cacheName).put(key, o);
//            userCache1.put(key, o);
//            userCache.put(cacheName, userCache1);
            System.out.println("sucses");
            return true;
        } else {

            // 1 option
//            userCache.put(cacheName, new HashMap<>());
//            userCache.get(cacheName).put(key, o);

            // 2 option

//            userCache1 = new HashMap<>();
//            userCache1.put(key, o);
//            userCache.put(cacheName,userCache1);

           // 3 option
            userCache1 = new HashMap<>();
            userCache.put(cacheName, userCache1);
            userCache.get(cacheName).put(key, o);

            System.out.println("sucses and create");

            return true;

        }
    }

    @Override
    public String toString() {
        return
                userCache.toString()
                ;
    }

    public Object getCache(String cacheName, String key) throws InterruptedException {

        if (userCache.containsKey(cacheName) && userCache1.containsKey(key)) {
            System.out.println("get value from cache");
            return (Object) userCache1.get(key);
        } else {

            return String.format("value not found in cache with id : %s", key);
        }
    }

    public Object getCache1(String cacheName, String key) throws InterruptedException {

        System.out.println(userCache1.get(key));
        return userCache1.get(key);

    }

    public void clearCache(){

       userCache.clear();
    }

    public void clearCache(String cacheName){
      if (userCache.containsKey(cacheName)){
          userCache1.clear();
          userCache.remove(cacheName);
      } else {
          System.out.println("fail");
      }

    }

}

