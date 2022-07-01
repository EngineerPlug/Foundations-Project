package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;
    @FindBy(id = "userName")
    public WebElement usernameInput;
    @FindBy(id = "passWord")
    public WebElement passwordInput;
    @FindBy(id =  "login")
    public WebElement loginButton;
    @FindBy(id = "defectDescription")
    public WebElement defectInput;
    @FindBy(id = "testerChoiceInput")
    public WebElement assignInput;
    @FindBy(id = "assignBtn")
    public WebElement managerbutton;
    
    public void defectInput(String defect){
        this.defectInput.sendKeys(defect);
    }
    public void assignInput(String assigned){
        this.assignInput.sendKeys(assigned);
    }

    
    public Login(WebDriver driver) {

        this.driver = driver; 
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username){
        this.usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }

    public void clickButton(){
        this.loginButton.click();
    }
    public void managerButton(){
        this.managerbutton.click();
    }

    
}
