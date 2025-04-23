package uistore;

import org.openqa.selenium.By;

public class BirthdayCakesLocator {

	public static By nothanks = By.cssSelector("#wzrk-cancel");
	public static By location = By.cssSelector("span[class='flex items-center justify-start gap-4 text-12 font-500 xxl:text-14 text-red-500 ']");
	public static By searchLocation = By.cssSelector("#pincode-location-input");
	public static By continueshopping = By.xpath("//div[text()='Continue Shopping']");
	public static By pin_contains_Chennai = By.cssSelector("span[class='w-full max-w-[150px] overflow-hidden text-ellipsis whitespace-nowrap md:max-w-[200px]']");
	public static By pincode_contains = By.cssSelector("#location-and-country-popup");
	public static By hovercakes = By.xpath("//span[text()='Cakes']");
	public static By birthdayCakes = By.xpath("//a[@id='Birthday Cakes']");
	public static By sameday = By.xpath("//a[text()='Same Day Delivery']");
	public static By product = By.xpath("//div[text()='Decorated Chocolate Truffle Cake Half Kg']");
	public static By addcart = By.xpath("//div[text()='Add To Cart']");
}
