package com.demo.guru99.steps;

import com.demo.guru99.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser() throws InterruptedException {
        homePage.open();
        //homePage.waitForCondition()
        Thread.sleep(3000);    }

    @Step
    public void selectCreateNewAccount(){
        homePage.clickRegisterUser();
        //homePage.waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(homePage.registerUser));
    }


}
