package CacheHW;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;

import java.util.concurrent.TimeUnit;

public class CacheHelper {
    private CacheManager cacheManager;
    private Cache<String,User> userCache;
//    private Cache<String,userCache> userCache1;

    public CacheHelper() {
        cacheManager = CacheManagerBuilder
                .newCacheManagerBuilder().build();
        cacheManager.init();

        userCache = cacheManager
                .createCache("user-cache", CacheConfigurationBuilder
                        .newCacheConfigurationBuilder(
                                String.class, User.class,
                                ResourcePoolsBuilder.heap(10))
                        .withExpiry(Expirations.timeToLiveExpiration(Duration.of(10, TimeUnit.SECONDS))));
    }

    public Cache<String, User> getUserCache() {
        return cacheManager.getCache("user-cache", String.class, User.class);
    }

    public void clearCache(){
        cacheManager.getCache("user-cache", String.class, User.class).clear();
    }
}
