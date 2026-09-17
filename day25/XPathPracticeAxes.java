package day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPracticeAxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://practice.rcvacademy.com/");

		driver.manage().window().maximize();


		// Self = Select the current node

		String text = driver.findElement(
				By.xpath("//td[contains(text(),'John')]/self::td")
		).getText();

		System.out.println("Self : " + text);


		// Parent = Select the parent of the node

		String text1 = driver.findElement(
				By.xpath("//td[contains(text(),'John')]/parent::tr")
		).getText();

		System.out.println("Parent : " + text1);


		// Child = Select the child elements

		List<WebElement> childs = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/parent::tr/child::td")
		);

		System.out.println("Number of Child elements : " + childs.size());


		// Ancestor = Select parent, grandparent, etc.

		List<WebElement> ancestors = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/ancestor::*")
		);

		System.out.println("Number of Ancestors : " + ancestors.size());

		for (WebElement ancestor : ancestors) {

			System.out.println("Ancestor : " + ancestor.getTagName());
		}


		// Descendant = Select all elements below the current node

		List<WebElement> descendants = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/ancestor::tr/descendant::*")
		);

		System.out.println("Number of Descendants : " + descendants.size());


		// Ancestor-or-self

		List<WebElement> ancestorOrSelf = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/ancestor-or-self::*")
		);

		System.out.println(
				"Number of Ancestor-or-self : "
						+ ancestorOrSelf.size()
		);


		// Descendant-or-self

		List<WebElement> descendantOrSelf = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/ancestor::tr/descendant-or-self::*")
		);

		System.out.println(
				"Number of Descendant-or-self : "
						+ descendantOrSelf.size()
		);


		// Following-sibling = Select sibling elements after current node

		List<WebElement> followingSibling = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/following-sibling::td")
		);

		System.out.println(
				"Number of Following Siblings : "
						+ followingSibling.size()
		);

		for (WebElement element : followingSibling) {

			System.out.println(
					"Following Sibling : "
							+ element.getText()
			);
		}


		// Preceding-sibling = Select sibling elements before current node

		List<WebElement> precedingSibling = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/preceding-sibling::td")
		);

		System.out.println(
				"Number of Preceding Siblings : "
						+ precedingSibling.size()
		);

		for (WebElement element : precedingSibling) {

			System.out.println(
					"Preceding Sibling : "
							+ element.getText()
			);
		}


		// Following = Select elements after current node

		List<WebElement> following = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/following::*")
		);

		System.out.println(
				"Number of Following elements : "
						+ following.size()
		);


		// Preceding = Select elements before current node

		List<WebElement> preceding = driver.findElements(
				By.xpath("//td[contains(text(),'John')]/preceding::*")
		);

		System.out.println(
				"Number of Preceding elements : "
						+ preceding.size()
		);


		driver.quit();
	}
