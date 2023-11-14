package com.acelu.tests;

import com.acelu.pages.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    private WebDriver driver;
    private BasePage page;

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        page = new BasePage(driver);
    }

    @Test
    public void loginTest(){
        page.get("https://www.saucedemo.com/")
            .login("standard_user","secret_sauce");


    }


    @AfterEach
    public void afterEach(){
        page.quit();
    }


}
