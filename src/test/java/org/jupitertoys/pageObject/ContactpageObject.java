package org.jupitertoys.pageObject;

import org.jupitertoys.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactpageObject extends DriverFactory {
    //Webelement for Submit Button
    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submitBtn;
    //Webelement for foreNameField
    @FindBy(id = "forename")
    private WebElement foreNameField;
    // webelement for SurnameField
    @FindBy(id = "surname")
    private WebElement surNameField;
    // webelement for emailField
    @FindBy(id = "email")
    private WebElement emailField;
    // webelement for telephoneField
    @FindBy(id = "telephone")
    private WebElement telephoneField;
    // webelement for messageField
    @FindBy(id = "message")
    private WebElement messageField;
    // webelement for submission message
    @FindBy(css = ".alert-success")
    private WebElement submissionMessage;
    // webelement for feedbackErrorMessage
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]")
    private WebElement feedbackErrorMessage;

//creating a method to submission in contact page
    public void setSubmitBtn() {
        submitBtn.click();
    }
//creating a method to enter Mandatory fields in contact page
    public void enterFields() {
        foreNameField.sendKeys("sandeep");
        surNameField.sendKeys("i");
        emailField.sendKeys("sandy.tester83@gmail.com");
        telephoneField.sendKeys("07440324960");
        messageField.sendKeys("I am happy to do shopping in Jupiter toys");
    }
   //creating a method to get a thanks message for assertions
    public String setSubmissionMessage() {
        return submissionMessage.getText();
    }

    //creating a method  to get error message for assertion
    public String verificationError() {
        return feedbackErrorMessage.getText();
    }
   //creating a method to enter mandatory fields with invalid data in contact page
    public void enterInvalidData() {
        foreNameField.sendKeys(("##$$%%^^@@@@"));
        surNameField.sendKeys("000000");
        emailField.sendKeys("5468479@$#%$^");
        telephoneField.sendKeys("jhjdfvndsm");
        messageField.sendKeys("76875@$@#$325");
    }
}
