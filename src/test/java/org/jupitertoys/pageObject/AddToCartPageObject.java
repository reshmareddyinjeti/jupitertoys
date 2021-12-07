package org.jupitertoys.pageObject;

import org.jupitertoys.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPageObject extends DriverFactory {
    // webelement for shop element
    @FindBy(id = "nav-shop")
    private WebElement shopBtn;
    //webelement for buy element
    @FindBy(css = ".btn-success")
    private WebElement buyBut;
    //webelement for funny cow buy button
    @FindBy(xpath = "//*[@id='product-6']/div/p/a")
    private WebElement buyButFunnyCow;
    //webelement  for fluffy bunny buy button
    @FindBy(xpath = "//*[@id='product-4']/div/p/a")
    private WebElement buyButFluffyBunny;
    //webelement  to click cart button
    @FindBy(css = ".icon-shopping-cart")
    private WebElement cartBut;
    //webelement to get items in the cart
    @FindBy(xpath = "//tbody")
    private WebElement cartItems;


    //creating method to navigate shop page and buy a product
    public void goToShopPage() {
        shopBtn.click();
        //actually it has to click the product only once but it clicking twice ,it is a medium bug
        buyButFunnyCow.click();
        buyButFunnyCow.click();
        buyButFluffyBunny.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cartBut.click();

    }

    //creating a method to get the items  in cart list for assertion
    public String cartListItems() {
        String s = cartItems.getText();
        System.out.println(s);
        return s;
    }
}
