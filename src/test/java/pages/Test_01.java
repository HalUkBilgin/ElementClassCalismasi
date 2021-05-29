package pages;

import Utils.Condition;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static Utils.ElementClass.$;
import static Utils.ElementClass.open;

public class  Test_01 implements Locators {


    @Test
    public void testA() {// new ile 'public class ElementClass' dan nesne tanımlamak zorunda kalmadık.
        open(url);
        $(username).shouldBe(Condition.clicakble).setValue(uName).click();
        $(password).setValue(pass).click();
        $(loginButton).scrollIntoView().click();
    }
    @Test
    public void testB(){
        open(url2);
        $(searchInput).shouldBe(Condition.visible).setValue("iphone").pressEnter();
        $(aboutUs).scrollIntoView().click();
    }

}
