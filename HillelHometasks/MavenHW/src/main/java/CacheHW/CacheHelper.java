package CacheHW;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @Author Anastasia.enya
 * @version 1.0

 */

/**
 * Конструктор по умолчанию который создает дефолтную мапу
 *      * @param userCache
 */
public class CacheHelper {

    private HashMap<String, HashMap<String, Object>> userCache;

    CacheHelper() {
        userCache = new HashMap<>();
    }
    /**
     * Логгеры для записей
     */


    static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    /**
     * Этот метод  кладет значение в определенный кэш
     * @param cacheName - имя кэша
     * @param key - ключ к объекту
     * @param o - объект
     * @throws InterruptedException
     */
    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException {

        if (userCache.containsKey(cacheName)) {

            userCache.get(cacheName).put(key, o);
            loggerInfo.info("Put into cache "+cacheName+" was success ");
            return true;
        } else {


            userCache.put(cacheName, new HashMap<>());
            userCache.get(cacheName).put(key, o);

            loggerInfo.info("Creation and Put into cache "+cacheName+" was success ");

            return true;

        }
    }

    /**
     *
     * @return расспечатывает кэш
     */
    @Override
    public String toString() {
        return
                userCache.toString()
                ;
    }

    /**
     * Этот метод возвращает объект по запрашиваему ключу
     * @param cacheName - имя кэша
     * @param key - ключ к объекту
     * @return - возвращает объект
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
     * метод ля получения размера кэша
     * @return возвращает размер кэша
     */

    public int  getSize(){
        return    userCache.size();
    }



    /**
     * этот метод очищает весь кэш
     */
    public void clearCache(){

       userCache.clear();
       loggerWarn.warn("All is clear");
    }


    /**
     * этот метод очищает заданный кэш по имени
     * @param cacheName - имя кэша
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

