package com.demo.guru99.steps;

import com.demo.guru99.models.Data;
import com.demo.guru99.pageobjects.CreateNewAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CreateNewAccountStep {
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

    @Step
    public void registerUser(Data data){
        createNewAccountPage.setFirstName(data.getUserName());
        createNewAccountPage.setLastName(data.getLastName());
        createNewAccountPage.setPhone(data.getPhone());
        createNewAccountPage.setEmail(data.getEmail());
        createNewAccountPage.setAddress1(data.getAddress1());
        createNewAccountPage.setCity(data.getCity());
        createNewAccountPage.setState(data.getState());
        createNewAccountPage.setPostalCode(data.getPostalCode());
        createNewAccountPage.setPassword(data.getPassword());
        createNewAccountPage.setConfirmPassword(data.getConfirmPassword());
        createNewAccountPage.buttonSubmit();
    }

    @Step
    public void compareRegister(){
        Assert.assertEquals("Thank you for registering. You may now sign-in using the user name and password you've just entered.", createNewAccountPage.registerOk());
    }

}
