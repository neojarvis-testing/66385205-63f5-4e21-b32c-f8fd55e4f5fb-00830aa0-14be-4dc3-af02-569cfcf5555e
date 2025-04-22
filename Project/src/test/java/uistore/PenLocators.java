package uistore;

import org.openqa.selenium.By;

public class PenLocators {
    public static By noThanks=By.xpath("//button[text()='No, Thanks']");
    public static By deliver=By.xpath("//span[text()='Where to deliver?']");
    public static By area=By.xpath("//input[@id='pincode-location-input']");
    public static By continueshopping=By.xpath("//div[text()='Continue Shopping']");
    public static By search=By.xpath("(//input[@id='search_bar'])[1]");
    public static By first_product=By.xpath("//div[text()='Sheaffer Ballpoint Pen']");
    public static By addtocart=By.xpath("//div[text()='Add To Cart']");
    public static By pincode = By.xpath("//div[@class='flex items-center gap-2']");
    public static By buy = By.xpath("(//div[@class='overflow-hidden text-ellipsis whitespace-nowrap text-center not-italic leading-4 md:block xxl:text-14 text-14 text-base w-auto font-600 pl-4'])[1]");
}
