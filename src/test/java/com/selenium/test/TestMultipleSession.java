package com.selenium.test;

import com.selenium.test.configs.BaseUtils;
import com.selenium.test.pages.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestMultipleSession {
    private BaseUtils base;

    public TestMultipleSession(BaseUtils base) {
        this.base = base;
    }

    @Test
    public void SearchOne(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        Home home = new Home(base.Driver);
        base.Driver.navigate().to("amazon.com");
        home.txtSearch.sendKeys("Macbook Pro");
        home.btnSearch.click();
    }

    @Test
    public void SearchTwo(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        Home home = new Home(base.Driver);
        base.Driver.get("amazon.com");
        home.txtSearch.sendKeys("Microsoft");
        home.btnSearch.click();
    }

    @Test
    public void SearchThree(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        Home home = new Home(base.Driver);
        base.Driver.get("amazon.com");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        home.txtSearch.sendKeys("Apple");
        home.btnSearch.click();
    }


//    @Test
//    public void executSessionOne(){
//        //First session of WebDriver
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        //Goto guru99 site
//        driver.get("http://demo.guru99.com/V4/");
//        //find user name text box and fill it
//        driver.findElement(By.name("uid")).sendKeys("Driver 1");
//
//    }
//
//    @Test
//    public void executeSessionTwo(){
//        //Second session of WebDriver
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        //Goto guru99 site
//        driver.get("http://demo.guru99.com/V4/");
//        //find user name text box and fill it
//        driver.findElement(By.name("uid")).sendKeys("Driver 2");
//
//    }
//
//    @Test
//    public void executSessionThree(){
////        Third session of WebDriver
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        //Goto guru99 site
//        driver.get("http://demo.guru99.com/V4/");
//        //find user name text box and fill it
//        driver.findElement(By.name("uid")).sendKeys("Driver 3");
//
//    }
//
//    @AfterTest
//    public void afterTest(){
////        driver.close();
//    }
}