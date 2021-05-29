package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ElementClass {

    private By by; //By selector classı
    private WebDriver driver;
    private WebElement element;
    private WebDriverWait wait;


    public static  ElementClass $(By by){//bu metod tüm class ı return ediyor.
        return  new ElementClass(by);
    }

    public static void open(String url){
        new ElementClass().openURL(url);
    }

    private ElementClass(){
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,10);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);-->36. satır bu işlemi yapacak
    }

    private  ElementClass(By by){
        this();//this(); komutu yukarıdaki "public ElementClass(){ " constructorun
               // çağırılan diğer class larda çalışması için tanımlandı.this : bu class demek
        this.by = by;
        element =wait.until(ExpectedConditions.presenceOfElementLocated(by)); //29. satırdaki wait komutuna gerek kalmadı.
    }

    private void openURL(String url){
        driver.get(url);
    }

    public ElementClass click(){
        element.click();
        return this;
    }

    public void pressEnter(){
        element.sendKeys(Keys.ENTER);
    }

    public  ElementClass setValue(String text){
        element.sendKeys(text);
        return this;
    }
    public ElementClass shouldBe(Condition condition){
        switch (condition){
            case appear://appear:görünmek
            case visible:
                wait.until(ExpectedConditions.visibilityOf(element));
                break;
            case clicakble:
                wait.until(ExpectedConditions.elementToBeClickable(by));
        }
        return this;
    }
    public ElementClass scrollIntoView(){
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);",element);

        return this;



    }

}
