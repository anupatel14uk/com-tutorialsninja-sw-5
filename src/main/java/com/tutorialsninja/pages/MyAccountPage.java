package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
   //    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public String getAccountLogoutText() {
        Reporter.log("get Account Logout Text  " + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    public String getYourAccountHasBeenCreatedText() {
        Reporter.log("get Your Account Has Been Created Text  " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on continue button " + continueBtn.toString());
        clickOnElement(continueBtn);
    }
}
