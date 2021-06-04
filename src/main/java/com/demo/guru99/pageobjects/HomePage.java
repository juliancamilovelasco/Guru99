package com.demo.guru99.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


//Esta clase va a contener los mapeos y metodos Genericos y netamente de esta clase
@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")
public class HomePage extends PageObject {

    //MAPEOS-------------------------------
    public By registerUser = By.xpath("(//a[@href='register.php'])[2]");  //Localizador con xpath y Mapea la opcion "Register Here"

    //METODOS------------------------------
    public void clickRegisterUser(){
        getDriver().findElement(registerUser).click();
        
    }

}
