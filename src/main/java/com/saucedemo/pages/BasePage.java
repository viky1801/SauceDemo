package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;
    public By locator;

    public void setDriver(WebDriver driver) {
        BasePage.driver=driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void set(By locator,String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    public String get(By locator){
        return find(locator).getText();
    }
}
