package uistore;

import org.openqa.selenium.By;

public class PersonalisedPageLocators {
    public static By popUp = By.cssSelector("#wzrk-cancel");
    public static By whereToDeliver = By.xpath("//span[text()='Where to deliver?']");
    public static By enterBar = By.xpath("//input[@placeholder='Enter Receiver’s pincode, location, area']");
    public static By continueShopping = By.xpath("//div[text()='Continue Shopping']");
    public static By personalised = By.xpath("//span[text()='Personalised']");
    public static By mugs = By.xpath("(//div[text()='Mugs'])[2]");
    public static By magicalMugs = By.xpath("//a[text()='Magic Mugs']");
    public static By firstProduct = By.xpath("//div[text()='Birthday Special Black Personalised Magic Mug']");
    public static By addToCart = By.xpath("//div[text()='Add To Cart']");
    public static By offersAvailable = By.xpath("//p[text()='Offers Available']");
}
