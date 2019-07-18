package com.selenium.test;

import com.selenium.test.configs.BaseUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
    private BaseUtils base;
    private final String BASE_URL = "https://www.amazon.com/";

    @Test
    public void SearchOne(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook Pro");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        driver.close();
    }

    @Test
    public void SearchTwo(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Iphone X");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        driver.close();
    }

    @Test
    public void SearchThree(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tempe");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        driver.close();
    }
}
