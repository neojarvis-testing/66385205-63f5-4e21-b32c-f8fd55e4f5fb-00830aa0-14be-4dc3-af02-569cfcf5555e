package pages;

import uistore.HomepageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Homepage {
    public WebDriverHelper helper;
    public Homepage(){
        helper=new WebDriverHelper(Base.driver);
    }
    public void clickbirthday(){
        helper.clickE(HomepageLocators.birthday);
        LoggerHandler.info("click birthday");
    }
}
