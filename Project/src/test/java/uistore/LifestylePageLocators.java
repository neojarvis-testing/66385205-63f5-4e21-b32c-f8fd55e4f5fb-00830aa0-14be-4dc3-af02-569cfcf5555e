package uistore;

import org.openqa.selenium.By;

public class LifestylePageLocators {
    public static By location = By.xpath("//span[text()='Location missing']");
    public static By searchBar = By.xpath("//input[@placeholder='Enter Receiver’s pincode, location, area']");
    public static By continueShopping = By.xpath("//button[@class=' flex w-full h-auto px-10 py-12 items-center gap-2.5 bg-fnp-300 text-white-900 justify-center  rounded-lg  ']");
    public static By pincodeKolkata = By.xpath("//span[text()='Kolkata, West Bengal, India, 700073']");
    public static By lifestyle = By.xpath("//span[text()='Lifestyle']");
    public static By jewellery = By.xpath("(//div[text()='Jewellery'])[4]");
    public static By rings = By.xpath("//a[text()='Rings']");
    public static By firstProduct = By.xpath("//div[text()='Solitaire Heart Ring']");
    public static By addToCart = By.xpath("//div[text()='Add To Cart']");
    public static By reviews = By.xpath("//h3[text()='Customer Reviews']");
    
}
