package com.keysight.pages;

import com.keysight.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@data-value='Contact Us']")
    WebElement clickContactUs;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Innovation Challenge Final: Watch Live']")
    WebElement verifytext;

    @CacheLookup
    @FindBy (xpath = "//div[@id='gnavbar']/div/ul/li")
    List<WebElement> topmenu;


    public void clickOnTopmenu (String module) throws InterruptedException {
        for (WebElement listmenu : topmenu){
            if (listmenu.getText().equalsIgnoreCase(module)){
                Thread.sleep(2000);
                listmenu.click();
                break;
            }
        }
    }
    public void clickOnContactUsbutton () {
        clickOnElement(clickContactUs);
    }

    public String setVerifyText() {
        return getTextFromElement(verifytext);
    }

}

