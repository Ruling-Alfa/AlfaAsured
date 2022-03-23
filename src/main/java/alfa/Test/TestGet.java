package alfa.Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;

import java.lang.reflect.Type;

import alfa.Test.Helpers.RequestSpecHelper;
import alfa.Test.Helpers.ResponseSpecHelper;
import alfa.Test.pojo.User;
import alfa.Test.pojo.UserList;

public class TestGet {
	@BeforeSuite
	public void setup() {
		
	}
	
	@Test
	public void TestListUser() {
		given().spec(RequestSpecHelper.ListUsersSpec())
		.get()
		.then()
		.spec(ResponseSpecHelper.HttpOkResp());
	}
	
	@Test
	public void TestListValidUserDetail() throws Exception{
		int userId = 2;
		User user = given().spec(RequestSpecHelper.GetUserDetailSpec(userId))
		.get()
		.as(User.class);
		
		assert(user.getData().getId() == userId);
		
//		System.out.println(user.toString());
	}
	
	@Test
	public void TestListValidUsers() throws Exception{
		Type type = new TypeReference<UserList>() {}.getType();
		UserList users = given().spec(RequestSpecHelper.ListUsersSpec())
		.get()
		.as(type);
		
		assert(users.getData() != null && users.getData().size() > 0);
//		System.out.println(users.toString());
	}
	
	
	@AfterSuite
	public void teardown() {
		
	}
}
