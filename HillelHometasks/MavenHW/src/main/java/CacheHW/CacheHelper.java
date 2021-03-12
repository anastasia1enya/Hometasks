package CacheHW;

import CacheClass.User;
import lombok.Data;
import lombok.Getter;
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
    private CacheManager cacheManager;
//    private Cache<String, User> userCache1;
    private Cache<String,Object> userCache;
//    private Cache<String,userCache> userCache1;

//    @Getter
    public String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CacheHelper(String name) {

        this.name = name;

        userCache.put(name,new HashMap<String,Object>());
        cacheManager = CacheManagerBuilder
                .newCacheManagerBuilder().build();
        cacheManager.init();

        userCache = cacheManager
                .createCache(name, CacheConfigurationBuilder
                        .newCacheConfigurationBuilder(
                                String.class, Object.class,
                                ResourcePoolsBuilder.heap(10))
                        .withExpiry(Expirations.timeToLiveExpiration(Duration.of(10, TimeUnit.SECONDS))));
    }

    public Cache<String, Object> getUserCache() {
        return cacheManager.getCache(name, String.class, Object.class);
    }

    public void clearCache(){
        cacheManager.getCache(name, String.class, Object.class).clear();
    }
}
