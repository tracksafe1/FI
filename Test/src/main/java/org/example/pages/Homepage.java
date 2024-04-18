package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;



public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
@FindBy(xpath="//*[@id=\"onetrust-accept-btn-handler\"]")
WebElement Accept;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header__navigation']/ul[1]/li[2]/a")
    WebElement ManufacturingIndustries;
    @CacheLookup
    @FindBy(css = ".subnavigation__link[href='/en-gb/industries/industrial-manufacturing']")
    WebElement industrialManufacturing;
    @CacheLookup
    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[1]/div[1]/div/div/h1")
    WebElement text;



    @CacheLookup
    @FindBy(xpath = "//ul[@class='InPageNavigation_inPageNav__list__4vBtC']")
    List<WebElement> items;
    @CacheLookup
    @FindBy(xpath="//*[@id=\"__next\"]/header/div/nav/div/div[1]/div/a[2]")
    WebElement ContactUs;

    public void clickOnManufacturingIndustries() {
        mouseHoverToElement(ManufacturingIndustries);
        log.info("Clicking Manufacturing Industries" + ManufacturingIndustries.toString());
    }
    public void clickOnIndustrialManufacturing() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(industrialManufacturing);
        log.info("clicking industrialManufacturing" + industrialManufacturing.toString());
    }

    public ArrayList Print() {
        log.info("Print list" + items.toString());
        ArrayList<String> names = new ArrayList<>();
        for (WebElement Names : items) {
            names.add(Names.getText());}
        System.out.println(names);
        return names;}
    public String verifyText(){
        log.info("Verifying Text" + text.toString());

        return getTextFromElement(text);
    }
public void clickAccept(){
    log.info("clicking on Accept" + Accept.toString());
        clickOnElement(Accept);
}
public void clickContactUs(){

        clickOnElement(ContactUs);
    log.info("clicking on ContactUs" + ContactUs.toString());
}
public void iframe(){
        driver.switchTo().frame("q-messenger-frame");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/span/div/div[1]/div/button")).click();
        driver.switchTo().defaultContent();
}}
