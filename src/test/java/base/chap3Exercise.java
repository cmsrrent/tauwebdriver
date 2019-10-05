package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class chap3Exercise {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputsLink1 = driver.findElement(By.linkText("Shifting Content"));
        inputsLink1.click();

        WebElement inputsLink2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        inputsLink2.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size() + " menu elements on this page");

        driver.quit();
        //added from GitHub
    }

    public static void main(String args[]){
        chap3Exercise test = new chap3Exercise();
        test.setUp();
    }
}
