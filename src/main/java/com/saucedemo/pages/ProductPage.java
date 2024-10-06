package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private final By productHeader=By.xpath("//*[@id=\"header_container\"]//span");

    public boolean isProductHeaderDisplayed(){
        return find(productHeader).isDisplayed();
    }
}
