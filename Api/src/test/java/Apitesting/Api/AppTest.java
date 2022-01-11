package Apitesting.Api;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class AppTest {
	  WebDriver driver;
      ExtentHtmlReporter htmlReporter;
      ExtentReports extent;
      XSSFWorkbook workbook;
      
      String s="/home/testing/Desktop/xLSHEET/BHARAT TEST FILE 1/bharath1 (2) (1).xlsx";
		
    

    
  
      @Test
      public void TC_001() throws Exception {
	  Thread.sleep(2000);
	  
	  //........................url 
	  
      FileInputStream fil1=new FileInputStream(s);	
	  Workbook bh1=WorkbookFactory.create(fil1);
      Sheet sh1=bh1.getSheet("Sheet5");
      Row r1=sh1.getRow(0);
      Cell c1=r1.getCell(0);
       String value1=c1.getStringCellValue();
       System.out.println(value1);
       
       
      
       RestAssured.baseURI=value1;
       RequestSpecification bhss=RestAssured.given();
      
       //JSONObject req=new JSONObject();
      // req.put("token","YWNjZXNzZWFzeWJhZ3M");
      // req.put("user_id","327");
      // req.put("first_name", "bharat");
      // req.put("last_name", "kumar");
     //  req.put("email", "bharat@tvisha.in");
     //  req.put("area_name ", "amalapuram");
     //  req.put("city_name", "hyd");
    //   req.put("latitude", "1323232.08");
     
     //  req.put("longitude", "1323232.08");
       
    //   bhss.header("Content-Type","application/json");
       
       
       
      // bhss.body(req.toJSONString());
       
       //.....................id 
      
      FileInputStream fil=new FileInputStream(s);	
 	   Workbook bh=WorkbookFactory.create(fil);
       Sheet sh=bh.getSheet("Sheet5");
      Row r=sh.getRow(1);
      Cell c=r.getCell(0);

       String value2=c.getStringCellValue();
       System.out.println(value2);
       
      
      
        Response re=bhss.request(Method.GET,value2);
        String re1=re.getBody().asString();
        System.out.println(re1);
        
        
      
        
       // int statusCode=re.getStatusCode();
      //  System.out.println("Respons code"+statusCode);
      //  Assert.assertEquals(statusCode,200);
        
        
       
        Thread.sleep(1500);
	    System.out.println("TC_001 PASSED API Applications ");
	    ExtentTest test=extent.createTest("****Open Application Api testing ****");
	    test.log(Status.INFO, " Api results "+re1);
	    test.info("EXPECTED RESULT :: "+re1);
		test.log(Status.PASS ,"ACTUAL RESULT ::"+re1+ "Working is successfully!");
		test.pass("Test Case:: TC_001 PASSED");
		System.out.println("TC_001 Test case is Passed"); 	
		
		
  
  
}

     
     
    /*   @Test
       public void TC_002() throws Exception {
	   Thread.sleep(2000);
     
     
     
     
	   
	      FileInputStream fil1=new FileInputStream(s);	
		  Workbook bh1=WorkbookFactory.create(fil1);
	      Sheet sh1=bh1.getSheet("Sheet5");
	      Row r1=sh1.getRow(2);
	      Cell c1=r1.getCell(0);

	       String value1=c1.getStringCellValue();
	       System.out.println(value1);
	       
	       RestAssured.baseURI=value1;
	       RequestSpecification bhss=RestAssured.given();
	       
	       //.....................id 
	       
	       FileInputStream fil=new FileInputStream(s);	
	 	   Workbook bh=WorkbookFactory.create(fil);
	       Sheet sh=bh.getSheet("Sheet5");
	       Row r=sh.getRow(3);
	       Cell c=r.getCell(0);

	       String value2=c.getStringCellValue();
	       System.out.println(value2);
	       
	       
	       
	        Response re=bhss.request(Method.GET,value2);
	        String re1=re.getBody().asString();
	        System.out.println(re1);
	        
	        
	       // int statusCode=re.getStatusCode();
	       // System.out.println("Respons code"+statusCode);
	       // Assert.assertEquals(statusCode,200);
	        
	        
	       
	        Thread.sleep(1500);
		    System.out.println("TC_002 PASSED API Applications ");
		    ExtentTest test=extent.createTest("****Open Application Api testing ****");
		    test.log(Status.INFO, " Api results "+re1);
		    test.info("EXPECTED RESULT :: "+re1);
			test.log(Status.PASS ,"ACTUAL RESULT ::"+re1+ "Working is successfully!");
			test.pass("Test Case:: TC_002 PASSED");
			System.out.println("TC_002 Test case is Passed"); 	
			
			
	  
	  
	}


      @Test
       public void TC_003() throws Exception {
	   Thread.sleep(2000);
     
     
     
     
	   
	      FileInputStream fil1=new FileInputStream(s);	
		  Workbook bh1=WorkbookFactory.create(fil1);
	      Sheet sh1=bh1.getSheet("Sheet5");
	      Row r1=sh1.getRow(4);
	      Cell c1=r1.getCell(0);

	       String value1=c1.getStringCellValue();
	       System.out.println(value1);
	       
	       RestAssured.baseURI=value1;
	       RequestSpecification bhss=RestAssured.given();
	       
	       //.....................id 
	       
	       FileInputStream fil=new FileInputStream(s);	
	 	   Workbook bh=WorkbookFactory.create(fil);
	       Sheet sh=bh.getSheet("Sheet5");
	       Row r=sh.getRow(5);
	       Cell c=r.getCell(0);

	       String value2=c.getStringCellValue();
	       System.out.println(value2);
	       
	       
	       
	        Response re=bhss.request(Method.POST,value2);
	        String re1=re.getBody().asString();
	        System.out.println(re1);
	        
	        
	       // int statusCode=re.getStatusCode();
	       // System.out.println("Respons code"+statusCode);
	       // Assert.assertEquals(statusCode,200);
	        
	        
	       
	        Thread.sleep(1500);
		    System.out.println("TC_003 PASSED API Applications ");
		    ExtentTest test=extent.createTest("****Open Application Api testing ****");
		    test.log(Status.INFO, " Api results "+re1);
		    test.info("EXPECTED RESULT :: "+re1);
			test.log(Status.PASS ,"ACTUAL RESULT ::"+re1+ "Working is successfully!");
			test.pass("Test Case:: TC_003 PASSED");
			System.out.println("TC_003 Test case is Passed"); 	
			
			
	  
	  
	}  
     
     
     
     
     */
     
  
 
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




	 
 
