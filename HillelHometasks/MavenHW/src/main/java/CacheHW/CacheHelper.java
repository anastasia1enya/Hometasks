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
    private CacheManager cacheManager;

    private Cache<String,Object> userCache;

//    private Cache <String, Map<String, Object>> userCache;

    @Getter
    @Setter
    private String name ;

    public CacheHelper(String name) {

        this.name = name;


        cacheManager = CacheManagerBuilder
                .newCacheManagerBuilder().build();
        cacheManager.init();

        userCache = cacheManager
                .createCache(name, CacheConfigurationBuilder
                        .newCacheConfigurationBuilder(
                                String.class, Object.class,
                                ResourcePoolsBuilder.heap(10))
                        .withExpiry(Expirations.timeToLiveExpiration(Duration.of(10, TimeUnit.SECONDS))));


        userCache.put(name,new HashMap<String,Object>());
    }

    public Cache<String, Object> getUserCache() {
        return cacheManager.getCache(name, String.class, Object.class);
    }

    public void clearCache(){
        cacheManager.getCache(name, String.class, Object.class).clear();
    }
}
