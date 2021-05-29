package pages;

import org.openqa.selenium.By;

public interface Locators {
    /*
    interface classı içindeki değişkenlerin hepsi 'public static final' dir

     */

    String url = "https://test.basqar.techno.study/";
    String url2 = "https://opencart.abstracta.us/";
    By username = By.cssSelector("input[formcontrolname='username']");
    By searchInput = By.cssSelector("input[name='search']");
    By aboutUs = By.xpath("//a[text()='About Us']");
    By searchButton = By.cssSelector("button.btn.btn-default");
    By password = By.cssSelector("input[formcontrolname='password']");
    By loginButton = By.xpath("//span[contains(text(),'LOGIN')]");


    String uName = "daulet2030@gmail.com";
    String pass = "TechnoStudy123@";
}
