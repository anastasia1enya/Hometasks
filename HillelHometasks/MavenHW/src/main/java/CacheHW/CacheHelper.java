package CacheHW;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @Author Anastasia.enya
 * @version 1.0

 */

/**
 * Default constructor, creates  the default map
 *      * @param userCache
 */
public class CacheHelper {

    private HashMap<String, HashMap<String, Object>> userCache;

    CacheHelper() {
        userCache = new HashMap<>();
    }
    /**
     * Loggers for entries
     */


    static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    /**
     * This method puts the object into cache
     * @param cacheName -name of the  cache
     * @param key - key to the object
     * @param o - the object
     * @throws InterruptedException
     */
    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException {

        if (userCache.containsKey(cacheName)) {

            userCache.get(cacheName).put(key, o);
            loggerInfo.info("Put into cache "+cacheName+" was success ");

        } else {

            userCache.put(cacheName, new HashMap<>());
            userCache.get(cacheName).put(key, o);

            loggerInfo.info("Creation and Put into cache "+cacheName+" was success ");

        }
        return true;
    }

    /**
     *
     * @return printed cache
     */
    @Override
    public String toString() {
        return
                userCache.toString()
                ;
    }

    /**
     * This method returns the object by the given cache name & key
     * @param cacheName - name of the  cache
     * @param key - key to the object
     * @return - returns the object
     * @throws InterruptedException
     */
    public Object getCache(String cacheName, String key) throws InterruptedException {

        if (userCache.containsKey(cacheName) && userCache.get(cacheName).containsKey(key)) {
            loggerWarn.warn("Get value from cache " +cacheName);
            return (Object) userCache.get(cacheName).get(key);
        } else {

            return String.format("value not found in cache with id : %s", key);
        }
    }

    /**
     * this method returns the size
     * @return - returns the quantity of elements
     */

    public int  getSize(){
        return    userCache.size();
    }



    /**
     * this method clears the  whole cache
     */
    public void clearCache(){

       userCache.clear();
       loggerWarn.warn("All is clear");
    }


    /**
     * this method clears the  certain cache by name
     * @param cacheName - name of the  cache
     */


    public void clearCache(String cacheName){
      if (userCache.containsKey(cacheName)){
          userCache.get(cacheName).clear();
          userCache.remove(cacheName);
          loggerWarn.warn("Delete of "+cacheName+" was success ");

      } else {
//          System.out.println("fail");
          loggerError.error("ERROR");
      }

    }

}

