package CacheHW;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CacheTests {

    CacheHelper cacheHelper;
    String cacheName = "TestCache1";
    String key ="1.";
    Object o = "Ivanov";

    @Before
    public void init () throws InterruptedException {

       cacheHelper = new CacheHelper();

       //for test# 2
       cacheHelper.putCache(cacheName,key,o);

       //for test #4
        cacheHelper.putCache("TestDelete","000",true);

    }
    //test #1
    @Test
    public void putCacheTest() throws InterruptedException {
        Assert.assertTrue(cacheHelper.putCache(cacheName,key,o));
        Assert.assertEquals(o, cacheHelper.getCache(cacheName,key));

    }
    //test #2
    @Test
    public void getCacheTest() throws InterruptedException {
        Assert.assertEquals(cacheHelper.getCache(cacheName,key),o);

    }
    //test #3
    @Test
    public void clearAllCacheTest() throws InterruptedException {

        cacheHelper.clearCache();
       Assert.assertEquals(cacheHelper.getSize(),0);

    }

    //test #4
    @Test
    public void clearCacheTest() throws InterruptedException {

        cacheHelper.clearCache("TestDelete");
        Assert.assertEquals(cacheHelper.getSize(),1);
        Assert.assertFalse(cacheHelper.getSize()==0);

    }

}
