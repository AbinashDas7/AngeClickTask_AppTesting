package stepdefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.*;
import pages.OrderAProduct;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class StepDefinitions {
    private OrderAProduct orderPage;
    private AppiumDriver<WebElement> driver; // Change to AppiumDriver

    @Given("^user is on product page$")
    public void user_is_on_the_login_page() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Abinash");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        ClassLoader classLoader = getClass().getClassLoader();
        File apkFile = new File(classLoader.getResource("apps/Android-MyDemoAppRN.1.3.0.build-244.apk").getFile());
        String apkPath = apkFile.getAbsolutePath();
        capabilities.setCapability(MobileCapabilityType.APP, apkPath);

        try {
            URL url = new URL("http://127.0.0.1:4723");
            driver = new AndroidDriver<>(url, capabilities); 
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        orderPage = new OrderAProduct((AndroidDriver<WebElement>) driver);
    }


    @And("^Verify user able to click on product$")
    public void Verify_user_able_to_click_on_product() throws InterruptedException {
    	orderPage.clickOnProductImage();
    }

    @Then("^Verify User able to Add that product into cart$")
    public void Verify_User_able_to_Add_that_product_into_cart() throws InterruptedException {
        orderPage.clickAddToCartButton();
    }
    
    @Then("^Verify User able to Add that product two times into cart$")
    public void Verify_User_able_to_Add_that_product_into_cart_two_times() throws InterruptedException {
        orderPage.addTwoProduct();
    }
    
    @Then("^Check user able to click on cart$")
    public void Verify_User_able_to_click_on_cart() throws InterruptedException {
        orderPage.clickCartButton();
    }

    @And("^Check whether the same price showing in cart or not$")
    public void Check_whether_the_same_price_showing_in_cart_or_not() throws InterruptedException {
        orderPage.checkPriceinCart();
    }

    @And("^Verify User able to click on Proceed TO Checkout button$")
    public void Verify_User_able_to_click_on_Proceed_TO_Checkout_button() throws InterruptedException {
    	orderPage.clickOnProceedTOCheckoutButton();
    }
    
    @And("^Check whether user able to delete one product from cart or not$")
    public void Check_whether_user_able_to_delete_one_product_from_cart_or_not() throws InterruptedException {
    	orderPage.deleteOneProduct();
    }
    
    
    @And("^Verify User able to add another different product$")
    public void Verify_able_to_add_another_different_product() throws InterruptedException {
    	orderPage.addAnotherProduct();
    }
    
    @Then("^Verify User able to Login or not$")
    public void Verify_User_able_to_Login_or_not() throws InterruptedException {
        orderPage.loginUser();
    }


    @And("^Check User able to add all shipping address$")
    public void Check_User_able_to_add_all_shipping_address() throws InterruptedException {
        orderPage.fillAddress();
    }

    @And("^Verify User able add card Details$")
    public void Verify_User_able_add_card_Details() throws InterruptedException {
        orderPage.paymentDetails();
    }

    @And("^Check whether the product price and shipping price sums up and total price calculated or not$")
    public void Check_whether_the_product_price_and_shipping_price_sums_up_and_total_price_calculated_or_not() throws InterruptedException {
        orderPage.checkpriceSumsUp();
    }

    @And("^Check user able to Order the product and get successfull message$")
    public void Check_user_able_to_Order_the_product_and_get_successfull_message() throws InterruptedException {
        orderPage.clickOnplaceOrderButton();
    }

    
     
    @And("^Verify user able to click on Menu$")
    public void Verify_user_able_to_click_on_Menu() throws InterruptedException {
        orderPage.clickOnMenu();
    }
     
    @And("^Check Login option from Menu catalogue$")
    public void Check_Login_option_from_Menu_catalogue() throws InterruptedException {
        orderPage.clickOnLogin();
    }
    
    
    @Then("^Check User login through only username$")
    public void Check_login_through_only_username() throws InterruptedException {
        orderPage.loginUserWithoutPass();
    }
    
    @Then("^Check User login through no username and password$")
    public void Check_User_login_through_no_username_and_password() throws InterruptedException {
        orderPage.loginUserWithoutCred();
    }
}

