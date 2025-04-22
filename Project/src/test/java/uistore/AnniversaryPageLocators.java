package uistore;

import org.openqa.selenium.By;

public class AnniversaryPageLocators {
    public static By noThanks=By.xpath("//button[text()='No, Thanks']");
    public static By whereToDeliver = By.cssSelector("span[class='block max-w-[153px] overflow-hidden text-ellipsis whitespace-nowrap text-16 font-600 text-fnp-500 md:text-16 xxl:text-18']");
    public static By inputLocation = By.cssSelector("input[class=' overflow-hidden text-ellipsis whitespace-nowrap false font-medium inter focus:border-[#191A0B] border-grey-300 rounded-lg border text-fnp-500 text-sm block  focus:outline-none w-full p-3.5 h-44 md:h-auto       overflow-hidden text-ellipsis whitespace-nowrap disabled:pointer-events-none disabled:cursor-not-allowed disabled:bg-white-900']");
    public static By continueShopping = By.xpath("//div[text() = 'Continue Shopping']");
    public static By anniversary = By.xpath("//span[text() = 'Anniversary']");
    public static By flowers = By.xpath("(//div[text() = 'Flowers'])[5]");
    public static By roses = By.xpath("//a[text() = 'Roses']");
    public static By firstProd = By.xpath("//div[text() = 'Mixed Roses Romantic Bunch']");
    public static By buyNow = By.xpath("//div[text() = 'Buy Now']");
    public static By home = By.xpath("//a[text() = 'Home']");
}
