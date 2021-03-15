package CacheHW;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;


public class CacheHelper {

    private HashMap<String, HashMap<String, Object>> userCache;

    CacheHelper() {
        userCache = new HashMap<>();
    }


    static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException {

        if (userCache.containsKey(cacheName)) {

            userCache.get(cacheName).put(key, o);
            loggerInfo.info("Put into cache"+userCache.get(cacheName)+" was success ");
            return true;
        } else {


            userCache.put(cacheName, new HashMap<>());
            userCache.get(cacheName).put(key, o);

            loggerInfo.info("Creation and Put into cache"+userCache.get(cacheName)+" was success ");

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
            loggerWarn.warn("Get value from cache" +userCache.get(cacheName));
            return (Object) userCache.get(cacheName).get(key);
        } else {

            return String.format("value not found in cache with id : %s", key);
        }
    }


    public void clearCache(){

       userCache.clear();
       loggerWarn.warn("All is clear");
    }

    public void clearCache(String cacheName){
      if (userCache.containsKey(cacheName)){
          userCache.get(cacheName).clear();
          userCache.remove(cacheName);
          loggerWarn.warn("Delete of "+userCache.get(cacheName)+" was success ");

      } else {
//          System.out.println("fail");
          loggerError.error("ERROR");
      }

    }

}

