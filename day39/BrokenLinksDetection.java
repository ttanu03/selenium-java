package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDetection{

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Automation practice website
        driver.get("https://www.deadlinkcity.com/");

        // 1. Capture all <a> links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + links.size());

        int brokenLinks = 0;
        int validLinks = 0;

        // 2. Loop through every link
        for (WebElement link : links) {

            // 3. Get href attribute
            String hrefatValue = link.getAttribute("href");

            // Check href exists and is not empty
            if (hrefatValue == null || hrefatValue.isEmpty()) {
                System.out.println("Skipped: href is missing");
                continue;
            }

            try {

                // 4. Convert String into URI/URL
                URL linkURL = new URL(hrefatValue);

                // 5. Open HTTP connection
                HttpURLConnection connection= (HttpURLConnection)linkURL.openConnection();

                // Use HEAD request instead of downloading the whole page
                connection.setRequestMethod("HEAD");

                // Set timeout
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                // 6. Get HTTP response code
                connection.connect();

                int responseCode = connection.getResponseCode();

                // 7. Check response code
                if (responseCode >= 400) {

                    System.out.println(
                            "BROKEN LINK: " + hrefatValue +
                            " | Status Code: " + responseCode);

                    brokenLinks++;

                } else {

                    System.out.println(
                            "VALID LINK: " + hrefatValue +
                            " | Status Code: " + responseCode);

                    validLinks++;
                }

                connection.disconnect();

            } catch (Exception e) {

                System.out.println(
                        "BROKEN/INVALID LINK: " + hrefatValue +
                        " | Error: " + e.getMessage());

                brokenLinks++;
            }
        }

    
      
        System.out.println("Total Links  : " + links.size());
        System.out.println("Valid Links  : " + validLinks);
        

        driver.quit();
    }
}