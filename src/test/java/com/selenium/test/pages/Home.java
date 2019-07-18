package com.selenium.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {
    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement txtSearch;

    @FindBy(how = How.ID, using = "nav-link-accountList")
    public WebElement lblSignin;

    @FindBy(how = How.ID, using = "nav-cart")
    public WebElement lblCart;

    @FindBy(how = How.ID, using = "nav-item-signout")
    public WebElement mnuSignOut;

    @FindBy(how = How.ID, using = "nav-link-shopall")
    public WebElement mnuDepartments;

    @FindBy(how = How.XPATH, using = "//span[@class='nav-text'][contains(text(),'Electronics')]")
    public WebElement lblElectronics;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'HEADPHONES')]")
    public WebElement lblHeadphones;

    @FindBy(how = How.XPATH, using = "//input[@value='Go']")
    public WebElement btnSearch;
}
