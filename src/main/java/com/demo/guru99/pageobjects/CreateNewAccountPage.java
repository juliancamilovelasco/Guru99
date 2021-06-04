package com.demo.guru99.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateNewAccountPage extends PageObject {

    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By email = By.name("email");
    By address1 = By.name("address1");
    By city = By.name("city");
    By state = By.name("state");
    By postalCode = By.name("postalCode");
    By password = By.name("password");
    By confirmPassword = By.name("confirmPassword");
    By buttonSubmit = By.name("submit");


    //METODOS
    public void setFirstName(String user){
        getDriver().findElement(firstName).sendKeys(user);
    }
    public void setLastName(String boxLastName){
        getDriver().findElement(lastName).sendKeys(boxLastName);
    }
    public void setPhone(String boxPhone){
        getDriver().findElement(phone).sendKeys(boxPhone);
    }
    public void setEmail(String boxEmail){
        getDriver().findElement(email).sendKeys(boxEmail);
    }
    public void setAddress1(String boxAddress1){
        getDriver().findElement(address1).sendKeys(boxAddress1);
    }
    public void setCity(String boxCity){
        getDriver().findElement(city).sendKeys(boxCity);
    }
    public void setState(String boxState){
        getDriver().findElement(state).sendKeys(boxState);
    }
    public void setPostalCode(String boxPostalCode){
        getDriver().findElement(postalCode).sendKeys(boxPostalCode);
    }
    public void setPassword(String boxPassword){
        getDriver().findElement(password).sendKeys(boxPassword);
    }
    public void setConfirmPassword(String boxConfirmPassword){
        getDriver().findElement(confirmPassword).sendKeys(boxConfirmPassword);
    }
    public void buttonSubmit(){
        getDriver().findElement(buttonSubmit).click();
    }

    public String registerOk(){
        List<WebElement> fonts = getDriver().findElements(By.tagName("font"));
        return fonts.get(4).getText();
    }
}

