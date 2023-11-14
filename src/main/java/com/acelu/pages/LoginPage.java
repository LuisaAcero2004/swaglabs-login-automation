package com.acelu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement usernameTextbox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(id = "login-button")
    WebElement loginButton;


    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public LoginPage setUsername(String username){
        sendKeys(usernameTextbox,username);
        return this;
    }

    public LoginPage setPassword(String password){
        sendKeys(passwordTextBox,password);
        return this;
    }

    public ProductsPage clickLoginButton(){
        click(loginButton);
        return new ProductsPage(driver);
    }

    public ProductsPage login(String username, String password){
        return setUsername(username)
                .setPassword(password)
                .clickLoginButton();
    }


}
