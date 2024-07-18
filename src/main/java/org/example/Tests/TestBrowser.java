package org.example.Tests;


import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(MyListener.class)
public class TestBrowser extends BaseTest {

    int a = 0;
    int b = 0;

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
   @BeforeMethod
    public void beforeMethod(){
        System.out.println("Подготовка тестовых данных");
        a = 2;
        b = 5;
    }

    @Test(description = "Test")
    public void testOne(){
        Assert.assertEquals(a+b,7);
    }
    @Test
    public void testTwo(){
        System.out.println("Я тест 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Очистка тестовых данных");
       a = 0;
       b = 0;
    }
}
