package org.example.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.Homepage;
import org.example.pages.contactInfoPage;
import org.testng.Assert;

public class step {
    @Given("^user is on Homepage$")
    public void userIsOnHomepage() {

    }

    @And("^User clicks on ManufacturingIndustries$")
    public void userClicksOnManufacturingIndustries() {
        new Homepage().clickOnManufacturingIndustries();
    }

    @And("^user clicks on industrialManufacturing$")
    public void userClicksOnIndustrialManufacturing() throws InterruptedException {
        new Homepage().clickOnIndustrialManufacturing();
    }

    @And("^user verify text message \"([^\"]*)\"$")
    public void userVerifyTextMessage(String a)  {
        Assert.assertEquals(new Homepage().verifyText(),a,"pass");
    }

    @When("^user clicks on AcceptCookies$")
    public void userClicksOnAcceptCookies() {
        new Homepage().clickAccept();
    }



    @Then("^print names of links on tha page$")
    public void printNamesOfLinksOnThaPage() {
        new Homepage().Print();
    }



    @And("^user clicks on contact us$")
    public void userClicksOnContactUs() {
        new Homepage().clickContactUs();
    }

    @And("^User enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userEnter(String BusinessEmailAddress, String FirstName, String LastName, String PhoneNumber, String CompanyName, String Country, String Industry)  {
      new contactInfoPage().enterEmail(BusinessEmailAddress);
        new contactInfoPage().enterFirstName(FirstName);
                new contactInfoPage().enterLastName(LastName);
                new contactInfoPage().enterPhoneNumber(PhoneNumber);
                new contactInfoPage().enterCompanyName(CompanyName);
                new contactInfoPage().enterCountry(Country);
                new contactInfoPage().enterIndustry(Industry);

    }

    @Then("^user clicks on submit button$")
    public void userClicksOnSubmitButton() {
        new contactInfoPage().clickOnSubmit();
    }
}
