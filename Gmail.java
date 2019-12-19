package com.shree;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {


    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        //WebElement email = driver.findElement(By.xpath("//*[@id=\'identifierId\']"));
        //WebElement email = driver.findElement(By.name("identifier"));
        WebElement email = driver.findElement(By.id("identifierId"));

        email.sendKeys("koiralashreekrishna");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("----");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
