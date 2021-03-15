package CacheHW;

import CacheClass.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CacheHelper {


    private HashMap <String,Object> userCache;


    public void createCache(String name){

        userCache.put(name,new HashMap <String,Object>() );

    }

    public boolean putCache(String cacheName, String key, Object o) throws InterruptedException {


        if (userCache.containsKey(cacheName)) {
            userCache.put(key, o);
            System.out.println("sucses");
            return true;
        } else {
            System.out.println("false");
            return false;

        }
    }

        public Object getCache(String cacheName, String key) throws InterruptedException {

            if (userCache.containsKey(cacheName) && userCache.containsValue(key)) {
                System.out.println("get value from cache");
                return (Object) userCache.get(key);
            } else {

                return String.format("value not found in cache with id : %s", key);

            }

//    public Cache<String, Object> getUserCache() {
//        return cacheManager.getCache(name, String.class, Object.class);
//    }
//
//    public void clearCache(){
//        cacheManager.getCache(name, String.class, Object.class).clear();
//    }

//    public CacheHelper(String name) {
//
//        this.name = name;
//
//
//        userCache.put(name,new HashMap<String,Object>());
//    }

}
}
