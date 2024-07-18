package org.example.Tests;

import org.testng.annotations.Test;

public class TestNgTraining extends BaseTest{
    @Test
    public void testNgTraining() throws Exception {
        System.out.println("I am TestNgTraining");
        String propValue = getProperty("pwd");
        System.out.println(propValue);
    }
}
