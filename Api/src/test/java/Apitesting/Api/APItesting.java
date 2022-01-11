package Apitesting.Api;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APItesting {
	
	 ExtentHtmlReporter htmlReporter;
     ExtentReports extent;
	
	@Test
	public void TC_001() throws Exception{
		

		  String url = "http://whywegroup.com/app/public/api/profile-api";
		 String contentType="application/x-www-form-urlencoded";
		 
		 Map<String, String> keys = new HashMap<String, String>();
		 String token="YWNjZXNzZWFzeWJhZ3M";
		 keys.put("token", token);
		 String mobile="8897893342";
		 keys.put("mobile",mobile);  
		 String country_code="91";
		 keys.put("user_id",country_code);

		// keys.put("country_code","+91");
			 
		 
Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
	
	//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
    Boolean b	=res.jsonPath().get("success");	
	System.out.println(b);
	
	
	
	
	String b1=	res.jsonPath().get("message");	
	System.out.println(b1);
	
	
	
	 
  //  String value1 ="b";
    
    String n=null;

 
   
    System.out.println("TC_001 PASSED API TESTING");
    ExtentTest test=extent.createTest("****API TESTING-API NAME:Login Application****");
    test.log(Status.INFO, "Web driver initialized Successfully");
 


    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
  test.info("INPUT=[URL"+url+"]");
  test.info("[token="+token+"]");
  test.info("[mobile="+mobile+"]");
  test.info("[country_code="+country_code+"]");
    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

       if(b.equals(b)) {

	    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
		test.pass("Test Case:: TC_001 PASSED");
		System.out.println("TC_001_ Test case is Passed");
	     }else {
	    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
		test.pass("Test Case:: TC_001_ FAIL");
		System.out.println("TC_001_ Test case is FAIL");
    
    
    
    
	     }}
    
	@Test
	public void TC_002() throws Exception{
		

		  String url = "http://whywegroup.com/app/public/api/api-otp-verify";
		 String contentType="application/x-www-form-urlencoded";
		 
		 Map<String, String> keys = new HashMap<String, String>();
		 String token="YWNjZXNzZWFzeWJhZ3M";
		 keys.put("token", token);
		 String mobile="8897892296";
		 keys.put("mobile",mobile);  
		 String user_id="23";
		 keys.put("user_id",user_id);
         String   otp="1234";
         keys.put("otp",otp);
		// keys.put("country_code","+91");
			 
		 
Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
	
	//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
    Boolean b	=res.jsonPath().get("success");	
	System.out.println(b);
	
	
	
	
	String b1=	res.jsonPath().get("message");	
	System.out.println(b1);
	
	
	
	 
  //  String value1 ="b";
    
    String n=null;

 
   
    System.out.println("TC_002 PASSED API TESTING");
    ExtentTest test=extent.createTest("****API TESTING-API NAME:Login Application****");
    test.log(Status.INFO, "Web driver initialized Successfully");
 


    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
  test.info("INPUT=[URL"+url+"]");
  test.info("[token="+token+"]");
  test.info("[mobile="+mobile+"]");
  test.info("[user_id="+user_id+"]");
  test.info("[  otp="+  otp+"]");
    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

       if(b.equals(b)) {

	    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
		test.pass("Test Case:: TC_002 PASSED");
		System.out.println("TC_002_ Test case is Passed");
	     }else {
	    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
		test.pass("Test Case:: TC_002_ FAIL");
		System.out.println("TC_002_ Test case is FAIL");
    
    
    
    
	     }}
    
    
   
	@Test
	public void TC_003() throws Exception{
		

		  String url = "http://whywegroup.com/app/public/api/add-user-data";
		 String contentType="application/x-www-form-urlencoded";
		 
		 Map<String, String> keys = new HashMap<String, String>();
		
		 
		 
		 String token="YWNjZXNzZWFzeWJhZ3M";
		 keys.put("token", token);
		 
		 
		 String user_id="25";
		 keys.put("user_id",user_id);  
		 
		 
		 
		 String first_name="Bharat";
		 keys.put("first_name",first_name);
         String   last_name="Kumar";
         keys.put("last_name",last_name);
         String   email="bharat@tvisha.in";
         keys.put( " Email", email);
         
         String    area_name ="hyderabad";
         
         keys.put("area_name" , area_name);
         
         String      city_name="madhhapur";
         
         keys.put("city_name", city_name);
         
         String latitude="38.8951";
         
         keys.put("latitude", latitude);
         
         
         String    longitude="-77.0345";

         keys.put("longitude", longitude);
         
         
		 keys.put("country_code","+91");
		 keys.put("mobile","8897892296");
			 
		 
Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
	
	//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
    Boolean b	=res.jsonPath().get("success");	
	System.out.println(b);
	
	
	
	
	String b1=	res.jsonPath().get("message");	
	System.out.println(b1);
	
	
	
	 
  //  String value1 ="b";
    
    String n=null;

 
   
    System.out.println("TC_003 PASSED API TESTING");
    ExtentTest test=extent.createTest("****API TESTING-API NAME:Login Application****");
    test.log(Status.INFO, "Web driver initialized Successfully");
 


    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
  test.info("INPUT=[URL"+url+"]");
  test.info("[token="+token+"]");
  test.info("[user_id="+user_id+"]");
  test.info("[first_name="+first_name+"]");
  test.info("[ last_name="+ last_name+"]");
  test.info("[ email="+ email+"]");
  
  test.info("[ area_name="+ area_name+"]");
  
  test.info("[ city_name="+ city_name+"]");
  
  
  test.info("[ latitude="+ latitude+"]");
  
  test.info("[ longitude="+ longitude+"]");
  
  
  
    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

       if(b.equals(b)) {

	    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
		test.pass("Test Case:: TC_003 PASSED");
		System.out.println("TC_003_ Test case is Passed");
	     }else {
	    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
		test.pass("Test Case:: TC_003_ FAIL");
		System.out.println("TC_003_ Test case is FAIL");
    
    
    
    
	     }}
    
    
	
	

	@Test
	public void TC_004() throws Exception{
		

		  String url = "http://whywegroup.com/app/public/api/add-feedback-api";
		 String contentType="application/x-www-form-urlencoded";
		 
		 Map<String, String> keys = new HashMap<String, String>();
		
		 
		 
		 String token="YWNjZXNzZWFzeWJhZ3M";
		 keys.put("token", token);
	
		 String user_id="23";
	
	     keys.put("user_id", user_id);
	
	
	 String service_provider_name="BHARAT";
	
	
	 keys.put("service_provider_name",service_provider_name);
	
	 String service_provider_mobile="8897892297";
		
	 keys.put("service_provider_mobile",service_provider_mobile);
	
	 String rating="4";
	 
	 keys.put("rating", rating);
	 
	 String description="yv services ";
	 keys.put("description", description);
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_004 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING- API NAME:feedback-api Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  test.info("[user_id="+user_id+"]");
	  test.info("[service_provider_name="+service_provider_name+"]");
	  test.info("[ service_provider_mobile="+ service_provider_mobile+"]");
	  test.info("[  rating="+  rating+"]");
	  
	  test.info("[ description="+ description+"]");
	  
	  
	  
	  
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_004 PASSED");
			System.out.println("TC_004_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_004_ FAIL");
			System.out.println("TC_004_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	    
		
	@Test
	public void TC_005() throws Exception{
		

		  String url = "http://whywegroup.com/app/public/api/add-service-provider";
		 String contentType="application/x-www-form-urlencoded";
		 
		 Map<String, String> keys = new HashMap<String, String>();
		
		 
		 
		 String token="YWNjZXNzZWFzeWJhZ3M";
		 keys.put("token", token);
		 
		 String user_id="25";
		 keys.put("user_id", user_id);
		 
		 String category_id="23";
		 
		 keys.put("category_id", category_id);

		 
		 
		 
		 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
			
			//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
		    Boolean b	=res.jsonPath().get("success");	
			System.out.println(b);
			
			
			
			
			String b1=	res.jsonPath().get("message");	
			System.out.println(b1);
			
			
			
			 
		  //  String value1 ="b";
		    
		    String n=null;
		 

		    System.out.println("TC_005 PASSED API TESTING");
		    ExtentTest test=extent.createTest("****API TESTING- PI NAME:add-service-provider Application****");
		    test.log(Status.INFO, "Web driver initialized Successfully");
		 


		    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
		  test.info("INPUT=[URL"+url+"]");
		  test.info("[token="+token+"]");
		  test.info("[user_id="+user_id+"]");
		 
		  
		  
		  
		  
		    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

		       if(b.equals(b)) {

			    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
				test.pass("Test Case:: TC_005 PASSED");
				System.out.println("TC_005_ Test case is Passed");
			     }else {
			    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
				test.pass("Test Case:: TC_005_ FAIL");
				System.out.println("TC_005_ Test case is FAIL");
		    
		    
		    
		    
			     }}
		    
		    
		 
	 
	 
	
@Test
public void TC_006() throws Exception{
	

	  String url = "http://whywegroup.com/app/public/api/profile-api";
	 String contentType="application/x-www-form-urlencoded";
	 
	 Map<String, String> keys = new HashMap<String, String>();
	
	 
	 
	 String token="YWNjZXNzZWFzeWJhZ3M";
	 keys.put("token", token);
	 
	
	 
	 String user_id="25";
	 keys.put("user_id", user_id);
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_006 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING-  API NAME:profile -api Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  test.info("[user_id="+user_id+"]");
	 
	  
	  
	  
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_006 PASSED");
			System.out.println("TC_006_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_006_ FAIL");
			System.out.println("TC_006_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	    
@Test
public void TC_007() throws Exception{
	

	  String url = "http://whywegroup.com/app/public/api/profile-update-api";
	 String contentType="application/x-www-form-urlencoded";
	 
	 Map<String, String> keys = new HashMap<String, String>();
	
	 
	 
	 String token="YWNjZXNzZWFzeWJhZ3M";
	 keys.put("token", token);
	 
	
	 
	 String user_id="25";
	 keys.put("user_id", user_id);
	
    String first_name="BHarat";
	
	keys.put("first_name", first_name);
	
	String last_name="kumar";
	keys.put("last_name",last_name);
	
	String email="tvisha@gmail.in";
	
	
	keys.put("email",email);
	
	
	String mobile="3364556584";
	
	keys.put("mobile",mobile);
	
	String image="photes";
	
	keys.put("image",image);
	
	
	
	
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_007 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING-  API NAME:profile -api Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  test.info("[user_id="+user_id+"]");
	 
	  
	 
	  test.info("[first_name="+first_name+"]");
	  test.info("[last_name="+last_name+"]");
	 
	  test.info("[email="+email+"]");
	  test.info("[mobile="+mobile+"]");
	 
	  test.info("[image="+image+"]");
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_007 PASSED");
			System.out.println("TC_007_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_007_ FAIL");
			System.out.println("TC_007_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	    
	
@Test
public void TC_008() throws Exception{
	

	  String url = "http://whywegroup.com/app/public/api/about-us-api";
	 String contentType="application/x-www-form-urlencoded";
	 
	 Map<String, String> keys = new HashMap<String, String>();
	
	 
	 
	 String token="YWNjZXNzZWFzeWJhZ3M";
	 keys.put("token", token);
	 
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_008 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING-   API NAME:about-us-api Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_008 PASSED");
			System.out.println("TC_008_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_008_ FAIL");
			System.out.println("TC_008_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	
@Test
public void TC_009() throws Exception{
	

	  String url = "http://whywegroup.com/app/public/api/add-contact-us-api";
	 String contentType="application/x-www-form-urlencoded";
	 
	 Map<String, String> keys = new HashMap<String, String>();
	
	 
	 
	 String token="YWNjZXNzZWFzeWJhZ3M";
	 keys.put("token", token);
	 
	 String user_id="25";
	 keys.put("user_id", user_id);
	
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_009 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING-   API NAME:contact-us-api Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  test.info("[user_id="+user_id+"]");
	  
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_009 PASSED");
			System.out.println("TC_009_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_009_ FAIL");
			System.out.println("TC_009_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	
@Test
public void TC_010() throws Exception{
	

	  String url = "http://whywegroup.com/app/public/api/inbox-api";
	 String contentType="application/x-www-form-urlencoded";
	 
	 Map<String, String> keys = new HashMap<String, String>();
	
	 
	 
	 String token="YWNjZXNzZWFzeWJhZ3M";
	 keys.put("token", token);
	 
	 
	 String service_provider_id="1";
	 keys.put("service_provider_id", service_provider_id);
	 
	 
	 
	 
	 
	 
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_010 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING- API NAME:inbox-api Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  test.info("[service_provider_id="+service_provider_id+"]");
	  
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_010 PASSED");
			System.out.println("TC_010_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_010_ FAIL");
			System.out.println("TC_010_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	
	 
@Test
public void TC_011() throws Exception{
	

	  String url = "http://whywegroup.com/app/public/api/user-service-search";
	 String contentType="application/x-www-form-urlencoded";
	 
	 Map<String, String> keys = new HashMap<String, String>();
	
	 
	 
	 String token="YWNjZXNzZWFzeWJhZ3M";
	 keys.put("token", token);
	 
	 
	 String user_id="25";
	 keys.put("user_id", user_id);
	 
	 
	 String category_id="25";
	 keys.put("category_id",category_id);
	 
	 
	 
	 String limit="10";
	 keys.put("limit", limit);
	 
	 
	 
	 
	 
	 Response res=RestAssured.given().contentType(contentType).formParams(keys).when().post(url).then().extract().response();
		
		//WebElement wb=(System.out.println("API "+res.jsonPath().get("success"));	
	    Boolean b	=res.jsonPath().get("success");	
		System.out.println(b);
		
		
		
		
		String b1=	res.jsonPath().get("message");	
		System.out.println(b1);
		
		
		
		 
	  //  String value1 ="b";
	    
	    String n=null;
	 

	    System.out.println("TC_011 PASSED API TESTING");
	    ExtentTest test=extent.createTest("****API TESTING-  API NAME:user-service-search Application****");
	    test.log(Status.INFO, "Web driver initialized Successfully");
	 


	    //test.info("[Name of service provider   = " +    value1     + "]"+"[Contact Number="+value2+"]"+"[Message="+value4+"]" );
	  test.info("INPUT=[URL"+url+"]");
	  test.info("[token="+token+"]");
	  test.info("[ user_id="+ user_id+"]");
	  test.info("[category_id="+category_id+"]");
	  test.info("[limit="+limit+"]");
	  
	  
	    test.info("EXPECTED RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	

	       if(b.equals(b)) {

		    test.log(Status.PASS ,"ACTUAL RESULT ::"+"[" +  b +"]"+"["+b1+"]"); 	
			test.pass("Test Case:: TC_011 PASSED");
			System.out.println("TC_011_ Test case is Passed");
		     }else {
		    	test.log(Status.FAIL ,"ACTUAL FAIL RESULT ::"+  n );
			test.pass("Test Case:: TC_011_ FAIL");
			System.out.println("TC_011_ Test case is FAIL");
	    
	    
	    
	    
		     }}
	    
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	

@BeforeSuite
public void beforeSuite() throws Exception {

htmlReporter = new ExtentHtmlReporter("unit.html");
extent = new ExtentReports();
extent.attachReporter(htmlReporter);


System.out.println("Android driver started successfully");
}


@AfterSuite
public void afterSuite() {
extent.flush();
}
}



		 
		 
			   
			 	 
		 
		 	 
		 
		 
		 
		 
		 

