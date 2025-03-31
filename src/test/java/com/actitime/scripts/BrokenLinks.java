package com.actitime.scripts;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.helper.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinks {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
		Thread.sleep(5000);
		String loginpage = driver.getCurrentUrl();
		System.out.println(loginpage);
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("7088886601");
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		
		WebElement longpressbutton= driver.findElement(By.xpath("//p[@class='exGLbnIbapRgCUA']"));
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Human verification challenge']")));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='XWEDWKtNXmOeVCA']//p[@id='stxQmqhHWFUjBEJ']")).click();
		
		
		
		
		
		
		
		
		
	//===========================BROKEN LINKS CODE=========================================================//	
		/*
		 * driver.findElement(By.
		 * xpath("//input[@class='user_pass_input' and @type='text']")).sendKeys(
		 * "sankumar"); driver.findElement(By.
		 * xpath("//input[@class='user_pass_input' and @type='password']")).sendKeys(
		 * "Asdfgh@789");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //maximize
		 * driver.manage().window().maximize();
		 * 
		 * //implicitly wait 10 seconds
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * List <WebElement> tag = driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println("Link Size =" + tag.size());
		 * 
		 * for (WebElement e : tag) {
		 * 
		 * String url=e.getAttribute("href");
		 * 
		 * verifyBrokenLink(url); } }
		 * 
		 * public static void verifyBrokenLink(String linkUrl) {
		 * 
		 * try { URL url = new URL(linkUrl);
		 * 
		 * HttpURLConnection httpCon=(HttpURLConnection) url.openConnection();
		 * httpCon.setConnectTimeout(3000); httpCon.connect();
		 * 
		 * if (httpCon.getResponseCode()>=400) {
		 * 
		 * System.out.println(linkUrl + "--->" + httpCon.getResponseCode() +" " +
		 * httpCon.getResponseMessage() + "  Link is Broken"); } else {
		 * 
		 * System.out.println(linkUrl + "--->" + httpCon.getResponseCode() +" " +
		 * httpCon.getResponseMessage() + "  Link is not Broken");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * } catch (Exception e) { // TODO: handle exception }
		 */
		
	}
	
}
