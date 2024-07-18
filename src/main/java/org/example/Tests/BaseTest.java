package org.example.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

    protected String getProperty(String key) throws Exception{
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src\\main\\resources\\application.properties");
        properties.load(inputStream);
        return properties.getProperty(key);
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }
}
