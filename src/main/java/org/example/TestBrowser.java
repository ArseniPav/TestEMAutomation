package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowser {
    @Test
    public void testOpenBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.pl/?hl=pl");

        driver.findElement(By.id("//textarea[@id='APjFqb']")).sendKeys("Уточки");
        driver.findElement(By.xpath("//input[@value='Szukaj w Google' and @class='gN089b'][1]")).click();

        System.out.println("Success");
        driver.quit();
    }
}
