package alfa.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import alfa.Test.Helpers.Auth;
import alfa.Test.Helpers.RequestSpecHelper;
import alfa.Test.Helpers.RequestSpecParams;

import static io.restassured.RestAssured.*;

public class AuthTesting {
	@BeforeSuite
	public void setUp() {
		
	}
	
	public void TestBasicAuth() {
		RequestSpecParams params = new RequestSpecParams();
		params.authenticationType = Auth.Basic;
		
		given().spec(RequestSpecHelper.ListUsersSpec(params));
	}
	
	public void TestFormsAuth() {
		RequestSpecParams params = new RequestSpecParams();
		params.authenticationType = Auth.FormAuth;
		
		given().spec(RequestSpecHelper.ListUsersSpec(params));
	}
	
	@AfterSuite
	public void tearDown() {
		
	}
}

