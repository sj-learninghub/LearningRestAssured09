package org.sjn.TestNgEx2109;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG008 {
//parameter added in xml
    @Parameters("browser")
    @Test
    void demo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada

    }
}
