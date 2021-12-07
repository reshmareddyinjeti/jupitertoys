package org.jupitertoys.pageObject;

import org.jupitertoys.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends DriverFactory {
    //webelement  for contact button
    @FindBy(id = "nav-contact")
    private WebElement contactBtn;
//creating a method  to navigate contact page
    public void setContactBtn() {
        contactBtn.click();
    }

}
