package com.acelu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement waitElementToBeClickable(WebElement webElement){
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void sendKeys(WebElement webElement,String textToSend){
        waitElementToBeClickable(webElement).clear();
        waitElementToBeClickable(webElement).sendKeys(textToSend);
    }

    public void click(WebElement webElement){
        waitElementToBeClickable(webElement).click();
    }

    public LoginPage get(String url){
        driver.get(url);
        return new LoginPage(driver);
    }

    public void quit(){
        if(driver != null){
            driver.quit();
        }

    }




}
