package sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ensyu2 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // ChromeDriverの作成
		driver.get("https://rakuplus.jp"); // get()でブラウザ起動
		
		// メールアドレス入力
		driver.findElement(By.name("log")).sendKeys(" ");

		// パスワード入力
		driver.findElement(By.name("pwd")).sendKeys(" ");

		// チェックボックスにチェックを入れる
		driver.findElement(By.id("rememberme")).click();

		// ログインボタンを押す
		driver.findElement(By.cssSelector("#wp-submit")).click();
	
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(), new File("C:\\test\\" + file.getName()).toPath());
		
		//driver.quit();

	}
}