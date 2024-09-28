package org.sjn.TestNgEx2109;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG010 {

public void test01(){
    Assert.assertTrue(false);
}
    //skip
    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
    }
    @Test(alwaysRun = true)
    public void test03(){
        Assert.assertTrue(true);
    }

    }
