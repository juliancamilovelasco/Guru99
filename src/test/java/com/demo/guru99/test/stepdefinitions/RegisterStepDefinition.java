package com.demo.guru99.test.stepdefinitions;

import com.demo.guru99.models.Data;
import com.demo.guru99.steps.CreateNewAccountStep;
import com.demo.guru99.steps.HomeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    CreateNewAccountStep createNewAccountStep;

    @Given("^Select Register Here$")
    public void select_Register_Here() throws InterruptedException {
        homeStep.openBrowser();
        Thread.sleep(3000);
        homeStep.selectCreateNewAccount(); //llama al metodo
        Thread.sleep(5000);
    }

    @When("^Fill in the fields$")
    public void fill_in_the_fields(List<Data> dataList) throws InterruptedException {
        createNewAccountStep.registerUser(dataList.get(0));
        Thread.sleep(3000);
    }

    @Then("^See message REGISTER$")
    public void see_message_REGISTER() {
        createNewAccountStep.compareRegister();
    }
}
