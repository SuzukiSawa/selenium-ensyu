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
		WebDriver driver = new ChromeDriver(); // ChromeDriver�̍쐬
		driver.get("https://rakuplus.jp"); // get()�Ńu���E�U�N��
		
		// ���[���A�h���X����
		driver.findElement(By.name("log")).sendKeys(" ");

		// �p�X���[�h����
		driver.findElement(By.name("pwd")).sendKeys(" ");

		// �`�F�b�N�{�b�N�X�Ƀ`�F�b�N������
		driver.findElement(By.id("rememberme")).click();

		// ���O�C���{�^��������
		driver.findElement(By.cssSelector("#wp-submit")).click();
	
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file.toPath(), new File("C:\\test\\" + file.getName()).toPath());
		
		//driver.quit();

	}
}