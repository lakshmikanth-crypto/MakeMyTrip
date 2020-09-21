package classlevel;

import java.awt.AWTException;
import java.io.File;
//import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LanchFb {
	public static WebDriver driver;
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File src =tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc =new File("C:\\Users\\madhu\\eclipse-workspace\\ScreeenshootsClass\\reports\\"+name+".png");
		
		FileUtils.copyFile(src,desc);
		
	}

	public static void main(String[] args) throws InterruptedException,AWTException,IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhu\\eclipse-workspace\\FacebookAssinment\\Drivers\\chromedriver.exe  ");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		screenshot("launch1");
		
		WebElement from_city =driver.findElement(By.id("fromCity"));
		from_city.click();
		
		
		
		
		WebElement from =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		
		from.sendKeys("chennai");
		
		WebElement to_city =driver.findElement(By.id("toCity"));
		
		to_city.click();
		
		
		
		WebElement dec =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		dec.sendKeys("delhi");
		
		WebElement search =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
		search.click();
		
		screenshot("launch2");
		
		
		}
	}

