package CacheHW;


import com.google.common.cache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Expirations;
import org.junit.Before;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CacheTests {

CacheHelper cacheHelper;
    CacheManager cacheManager;
    Cache<String, HashMap<String, Object>> userCache;

    @Before
    public void init (){
        cacheHelper = new CacheHelper();

        HashMap<String, Object> testCache = new HashMap<>();



            cacheManager = CacheManagerBuilder
                    .newCacheManagerBuilder().build();
            cacheManager.init();

            userCache = cacheManager
                    .createCache("user-cache", CacheConfigurationBuilder
                            .newCacheConfigurationBuilder(
                                    String.class, Object.class,
                                    ResourcePoolsBuilder.heap(10))
                            .withExpiry(Expirations.timeToLiveExpiration(Duration.of(10, TemporalUnit.class))));


        public Cache<Integer, User> getUserCache() {
            return cacheManager.getCache("user-cache", Integer.class, User.class);
        }

        public void clearCache(){
            cacheManager.getCache("user-cache", Integer.class, User.class).clear();
        }




    }

}
