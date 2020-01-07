package com.ing.pensions.it.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefFileCaptureXML {

    WebDriver driver;

    @Given("I launch Chrome browser")
    public void i_launch_Chrome_browser() {
        driver = EnvironmenStepConfiguration.driver;
    }

    @When("I open google url")
    public void i_open_google_url() {
        driver.get("http://www.google.es");
    }

    @Then("it says google")
    public void it_says_google() {
        final String text = driver.findElement(By.linkText("Tienda")).getText();
        Assert.assertEquals("Tienda", text);
    }
}
