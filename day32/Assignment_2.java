package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.bjs.com/");

        driver.manage().window().maximize();

        driver.findElement(
            By.cssSelector("input[placeholder='What are you looking for today?']")
        ).sendKeys("water");

        Thread.sleep(5000);

        List<WebElement> list = driver.findElements(
            By.xpath("//a[@auto-data='searchBar_searchRedirectedPage']")
        );

        System.out.println("Number of results: " + list.size());

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getText());

            if (list.get(i).getText().equals("water")) {

                list.get(i).click();

                break;
            }
        }

        driver.quit();
    }
}