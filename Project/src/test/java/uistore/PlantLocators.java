package uistore;

import org.openqa.selenium.By;

public class PlantLocators {
    public static By deliver=By.xpath("//span[text()='Where to deliver?']");
    public static By area=By.xpath("//input[@id='pincode-location-input']");
    public static By continueshopping=By.xpath("//div[text()='Continue Shopping']");
    public static By pincode = By.xpath("//div[@class='flex items-center gap-2']");
    public static By plant=By.xpath("//span[text()='Plants']");
    public static By luckybamboo=By.xpath("(//div[@class='single-item plant_types'])[1]");
    public static By jade_plants=By.xpath("(//div[@class='single-item plant_types'])[2]");
    public static By money_plants=By.xpath("(//div[@class='single-item plant_types'])[4]");
    public static By cart=By.xpath("//div[text()='Cart']");
    public static By noThanks=By.xpath("//button[text()='No, Thanks']");
    
}
