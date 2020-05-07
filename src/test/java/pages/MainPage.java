package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends BasePage{
//
    @FindBy(css = "a.login")
    private WebElement signInButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        open();
    }

    public void clickOnSignInButton() {

//        String text = getDriver().findElement(By.cssSelector("locator")).getText();
//        Pattern p = Pattern.compile("93\\+\\d{5,}");
//        Matcher m = p.matcher(text);
//        if (m.matches()) {
//            System.out.println(text);
//        }
//
//        String text1 = getDriver().findElement(By.cssSelector("locator2")).getText();
//        Pattern p1 = Pattern.compile("\\d{4}");
//        Matcher m1 = p1.matcher(text1);
//        if (m1.matches()) {
//            System.out.println(text1);
//        }

        element(signInButton).click();
  }
}
