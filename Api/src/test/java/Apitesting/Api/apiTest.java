package Apitesting.Api;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class apiTest {
	
	WebDriver driver;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    XSSFWorkbook workbook;
    
  
@Test
public void TC_001() throws Exception  {
	  //Thread.sleep(1500);
   
    File s=new File("/home/testing/Desktop/xLSHEET/BHARAT TEST FILE 1/bharath1 (2) (1).xlsx");
	
	  
	   FileInputStream fil=new FileInputStream(s);
	 
       Workbook bh=WorkbookFactory.create(fil);
       
       Sheet sh=bh.getSheet("Sheet3");
       Row r=sh.getRow(2);
       Cell c=r.getCell(1);

       String value=c.getStringCellValue();
       System.out.println(value);
}

@BeforeSuite
public void beforeSuite() throws Exception {
	
   htmlReporter = new ExtentHtmlReporter("unit.html");
   extent = new ExtentReports();
   extent.attachReporter(htmlReporter);
   	

       // System.setProperty("webdriver.chrome.driver","/home/testing/Downloads/bharath/chromedriver_linux64 (3)/chromedriver");

      //  driver = new ChromeDriver();
        
    

      //  driver.get("http://192.168.2.80/yvservices/public/");

        System.out.println("Url open successfully");
        }

    @AfterSuite
    public void afterSuite() {
  	  
     extent.flush();
    
}}