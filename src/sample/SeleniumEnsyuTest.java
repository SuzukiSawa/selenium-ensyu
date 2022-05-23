package sample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumEnsyuTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // ChromeDriverの作成

		driver.get("http://www.google.com/xhtml"); // get()でブラウザ起動
		Thread.sleep(5000);

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		searchBox.submit();
		
		
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("selenium"));
		 element.click();
		
//		driver.quit();
	}

	
//	@Test
//	void test2() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
//		WebDriver driver = new ChromeDriver(); // ChromeDriverの作成
//
//		driver.get("https://www.yahoo.co.jp/"); // get()でブラウザ起動
//		Thread.sleep(5000);
//
//		WebElement searchBox = driver.findElement(By.name("p"));//driver.findElement(By.name("　"))　操作したい要素を取り出す
//		searchBox.sendKeys("ラクスパートナーズ");
//		searchBox.submit();
//
//		Thread.sleep(5000);
////		driver.quit();
//	}
}
