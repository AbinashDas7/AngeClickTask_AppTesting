package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
//LoginPage.java
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class OrderAProduct {
private static AndroidDriver<WebElement> driver;

//    private RemoteWebDriver driver;
    public OrderAProduct(AndroidDriver<WebElement> driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver2, this);
    }
    private static Properties properties = new Properties();

    static {
        try {
            // Load properties file
            FileInputStream fis = new FileInputStream("src/test/resources/data/UserDetails.properties");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Xpath..Implementing POM 
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc='store item'])[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement productImage;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc='store item'])[2]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement productImage2;
	
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Add To Cart button']")
    private WebElement addToCartButton;
	
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='counter plus button']/android.widget.ImageView")
    private WebElement addPlusButton;
    
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='cart badge']/android.widget.ImageView")
    private WebElement CartButton;
    
    @FindBy(xpath = "//android.widget.TextView[@content-desc='total price']")
    private WebElement itemNumberShowedInDown;
    
    @FindBy(xpath = "//android.widget.TextView[@content-desc='product price']")
    private WebElement itemNumberShowedInUp;
    
    @FindBy(xpath = "//android.widget.TextView[@text='Proceed To Checkout']")
    private WebElement proceedToCheckOut;
    
	

	    @FindBy(xpath = "(//android.widget.TextView[@text='2'])[2]")
	    private WebElement productnumberInCart;
	  
	    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='counter minus button']/android.widget.ImageView")
	    private WebElement deleteproduct;
		
		
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Username input field']")
    private WebElement username;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Password input field']")
    private WebElement password;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Login button']")
    private WebElement loginBtn;
    
  
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='open menu']/android.widget.ImageView")
    private WebElement menu;
	
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement catalogBtn;
    
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Full Name* input field']")
    private WebElement fullNameText;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Address Line 1* input field']")
    private WebElement addressLine1;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Address Line 2 input field']")
    private WebElement addressLine2;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='City* input field']")
    private WebElement City;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='State/Region input field']")
    private WebElement state;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Zip Code* input field']")
    private WebElement ZipCOde;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Country* input field']")
    private WebElement country;    
    @FindBy(xpath = "//android.widget.TextView[@text='To Payment']")
    private WebElement payment;
    
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Card Number* input field']")
    private WebElement cardNumber;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Expiration Date* input field']")
    private WebElement cardExpiry;
    @FindBy(xpath = "//android.widget.EditText[@content-desc='Security Code* input field']")
    private WebElement securityCode;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Review Order button']")
    private WebElement reviewOrder;
    
    @FindBy(xpath = "//android.widget.TextView[@content-desc='total price']")
    private WebElement priceTotal;
    @FindBy(xpath = "//android.widget.TextView[@text='$5.99']")
    private WebElement priceExtra;
    
  
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Place Order button']")
    private WebElement placeOrderButton;
  
    @FindBy(xpath = "//android.widget.TextView[@text='Checkout Complete']")
    private WebElement OrderStatus;
    
  
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='container header']")
    private WebElement productTab;
    
  
    @FindBy(xpath = "//android.widget.TextView[@text='Password is required']")
    private WebElement passwordRequiredMessage;
    
    @FindBy(xpath = "//android.widget.TextView[@text='Username is required']")
    private WebElement usernameRequiredMessage;
    
    	    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='store item'])[3]/android.view.ViewGroup[1]/android.widget.ImageView")
    	    private WebElement login;
 
    public void clickOnProductImage() throws InterruptedException {
    	Thread.sleep(4000);
    	productImage.click();
    }
    boolean addTwo = false;
    public void addTwoProduct() throws InterruptedException {
    	Thread.sleep(2000);
    	addPlusButton.click();
        addToCartButton.click();
        addTwo = true;
    }
    
    public void clickAddToCartButton() throws InterruptedException {
    	Thread.sleep(2000);
        addToCartButton.click();
    }

    
    public void clickCartButton() throws InterruptedException {
    	Thread.sleep(2000);
    	CartButton.click();
    }
    
    public void deleteOneProduct() throws InterruptedException {
    	Thread.sleep(2000);
    	if(productnumberInCart.getText().contains("2")) {
    		deleteproduct.click();
    	}
    	
    	//check delete or not
    	if(productnumberInCart.getText().contains("1")) {
    		System.out.println("Product deleted successfully");
    	}
    }
    
    public void goBack() throws InterruptedException {
    	Thread.sleep(2000);
//    	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	menu.click();
    	Thread.sleep(2000);
    	catalogBtn.click();
    }
    public void addAnotherProduct() throws InterruptedException {
    	goBack();
    	Thread.sleep(2000);
    	productImage2.click();
    }
    
    String textItemUp;
    double textItemUpParsed;
    double textItemDownParsed;
    double val;
    public void checkPriceinCart() throws InterruptedException {
    	Thread.sleep(2000);
    	System.err.print("wrong matching"+itemNumberShowedInDown.getText()+" "+itemNumberShowedInUp.getText());
        String textItemDown = itemNumberShowedInDown.getText();
        textItemDownParsed= Double.parseDouble(textItemDown.replace("$", "")); 
        textItemUp = itemNumberShowedInUp.getText();
        textItemUpParsed = Double.parseDouble(textItemUp.replace("$", ""));
        
        if(addTwo == true) {
        	val = textItemUpParsed+textItemUpParsed;
        }else {
        	val = textItemUpParsed; 
        }
        System.err.print("wrong matching"+textItemDown+" "+textItemUpParsed);
        if(textItemDownParsed == textItemUpParsed) {
        	System.out.println("Showing Correct result");
        }else {
        	System.err.print("wrong matching");
        }
        
      //Price In Cart
        WebElement priceInCart = driver.findElementByXPath("//android.widget.TextView[@content-desc='total price']");
        String textpriceInCart = priceInCart.getText();
        System.out.println(textpriceInCart);
    }
    
    public void clickOnProceedTOCheckoutButton() throws InterruptedException {
    	Thread.sleep(2000);
        proceedToCheckOut.click();
    }
    
    public void loginUser() throws InterruptedException {
        Thread.sleep(2000);
        //Login
        username.sendKeys(properties.getProperty("username"));
        password.sendKeys(properties.getProperty("password"));
      
        //Click Login
        loginBtn.click();
    }
    public void loginUserWithoutPass() throws InterruptedException {
        Thread.sleep(2000);
        //Login
        username.sendKeys(properties.getProperty("username"));
        //Click Login
        loginBtn.click();

        if(passwordRequiredMessage.isDisplayed()) {
        	Assert.assertTrue(true);
        }
    }
    
    public void loginUserWithoutCred() throws InterruptedException {
        Thread.sleep(2000);
        //Click Login
        loginBtn.click();
        if(usernameRequiredMessage.isDisplayed()) {
        	Assert.assertTrue(true);
        }
    }
    
    public void fillAddress() throws InterruptedException {
        Thread.sleep(2000);
        fullNameText.sendKeys(properties.getProperty("fullName"));
        addressLine1.sendKeys(properties.getProperty("addressLine1"));
        addressLine2.sendKeys(properties.getProperty("addressLine2"));
        City.sendKeys(properties.getProperty("city"));
        state.sendKeys(properties.getProperty("state"));
        ZipCOde.sendKeys(properties.getProperty("zipCode"));
        country.sendKeys(properties.getProperty("country"));
        
        //Click payment
        payment.click();
    }
    
    
    public void paymentDetails() throws InterruptedException {
        //fill Payment details
        Thread.sleep(3000);
        fullNameText.sendKeys(properties.getProperty("fullName"));
        cardNumber.sendKeys(properties.getProperty("cardNumber"));
        cardExpiry.sendKeys(properties.getProperty("cardExpiry"));
        securityCode.sendKeys(properties.getProperty("securityCode"));
        
        reviewOrder.click();
        //errorr
        reviewOrder.click();
    }

    public void checkpriceSumsUp() throws InterruptedException {
        //Check price value
        Thread.sleep(3000);
        System.out.println(priceTotal.getText());
        double price = Double.parseDouble(priceTotal.getText().replace("$", ""));
        System.out.println("Price in cents: " + price);
        
      //scrolling
 
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"$5.99\").instance(0));");
        Thread.sleep(2000);
        System.out.println(priceExtra.getText());
        double priceEx = Double.parseDouble(priceExtra.getText().replace("$", ""));
        
        //calc total price 
        double priceofproduct = textItemUpParsed;
        double priceTobeFinalized = priceofproduct + priceEx;
        System.out.println(priceTobeFinalized);
        
      
//        WebElement finalPrice = driver.findElementByXPath("//android.widget.TextView[@content-desc='total price']");
        System.out.println(priceTotal.getText());
        Thread.sleep(1000);
        double priceTotalTobePaid = Double.parseDouble(priceTotal.getText().replace("$", ""));
        
        if(priceTobeFinalized == priceTobeFinalized) {
        	System.out.println("we are good");
        }else {
        	System.out.println("some calc error");
        }
    }
    
    public void clickOnplaceOrderButton() throws InterruptedException {
    	Thread.sleep(2000);
    	placeOrderButton.click();
    	Thread.sleep(2000);
    	if(OrderStatus.getText().contains("Complete")) {
    		System.out.println("we are good");
    	}else {
    		System.out.println("Order not placed");
    	}
    }
    
    public void clickOnMenu() throws InterruptedException {
    	Thread.sleep(4000);
    	menu.click();
    }
    
    public void clickOnLogin() throws InterruptedException {
    	Thread.sleep(2000);
    	login.click();
    }
    
}

