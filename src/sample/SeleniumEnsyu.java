package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEnsyu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // ChromeDriverの作成

		driver.get("http://www.google.com/xhtml"); // get()でブラウザ起動
		Thread.sleep(5000);

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();

		Thread.sleep(5000);
		driver.quit();
	}
}
