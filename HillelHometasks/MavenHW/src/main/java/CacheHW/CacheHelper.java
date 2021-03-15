package CacheHW;

import CacheClass.User;

import java.util.HashMap;
import java.util.Objects;

public class CacheHelper {

    private HashMap<String, HashMap<String, Object>> userCache;

    CacheHelper() {
        userCache = new HashMap<>();
    }


    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException {

        if (userCache.containsKey(cacheName)) {

            userCache.get(cacheName).put(key, o);
            System.out.println("sucses");
            return true;
        } else {


            userCache.put(cacheName, new HashMap<>());
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

        if (userCache.containsKey(cacheName) && userCache.get(cacheName).containsKey(key)) {
            System.out.println("get value from cache");
            return (Object) userCache.get(cacheName).get(key);
        } else {

            return String.format("value not found in cache with id : %s", key);
        }
    }


    public void clearCache(){

       userCache.clear();
    }

    public void clearCache(String cacheName){
      if (userCache.containsKey(cacheName)){
          userCache.get(cacheName).clear();
          userCache.remove(cacheName);
      } else {
          System.out.println("fail");
      }

    }

}

