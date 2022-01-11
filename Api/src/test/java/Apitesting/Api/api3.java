package Apitesting.Api;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api3 {
	
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
     
	
      FileInputStream fil=new FileInputStream(s);	
	   Workbook bh=WorkbookFactory.create(fil);
      Sheet sh=bh.getSheet("Sheet5");
     Row r=sh.getRow(1);
     Cell c=r.getCell(0);

      String value2=c.getStringCellValue();
      System.out.println(value2);
      
     
     
       Response re=bhss.request(Method.GET,value2);
       
       JsonPath path=re.jsonPath();
     //  System.out.println(path.get("user_id"));
       
      // System.out.println(path.get("first_name"));
      // System.out.println(path.get(""));
      // System.out.println(path.get(""));
       //System.out.println(path.get(""));
       
       
       
     //  String re1=re.getBody().asString();
      // System.out.println(re1);
       
       
     
       
      // int statusCode=re.getStatusCode();
     //  System.out.println("Respons code"+statusCode);
     //  Assert.assertEquals(statusCode,200);
       
       
      
       //Thread.sleep(1500);
	   // System.out.println("TC_001 PASSED API Applications ");
	   // ExtentTest test=extent.createTest("****Open Application Api testing ****");
	   // test.log(Status.INFO, " Api results "+re1);
	   // test.info("EXPECTED RESULT :: "+re1);
		//test.log(Status.PASS ,"ACTUAL RESULT ::"+re1+ "Working is successfully!");
		///test.pass("Test Case:: TC_001 PASSED");
		//System.out.println("TC_001 Test case is Passed"); 	
		
		
 
 
}


}
