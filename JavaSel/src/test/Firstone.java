package test;

import test.ChromeDriver;
import test.WebDriver;

public class NewProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/testing/eclipse-workspace/test/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get();

	}

}