package com.project.selenium.seleniumproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//broken url
		//Step 1 - IS to get all urls tied up to the links using Selenium
		//Java methods will call URL's and gets you the status code
		// if the status code > 400 then url is not working -> link which tied to url is broken
		// a[href*="soapui"]'

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		//	HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		//	conn.setRequestMethod("HEAD");
		//	conn.connect();

		///	int resCode = conn.getResponseCode();
		//	System.out.println(resCode);

		SoftAssert a =new SoftAssert();

		for(WebElement link : links)
		{
			String url= link.getAttribute("href");
			HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode < 400, "The link with Text" + link.getText()+" is broken with code" +respCode);
		}
		a.assertAll();
	}

	private static Object getReturnCode(WebElement link) {
		return null;
	}
}
