package org.sjn.TestNgEx2109;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestNG009 {
//parameter added in xml
@Test
public void test01(){
    Assert.assertTrue(true);
}
//skip
    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
    }
    @Test
    public void test03(){
        Assert.assertTrue(true);
    }

    }
