package alfa.Test.Helpers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecHelper {
	
	public static RequestSpecification ListUsersSpec(RequestSpecParams params) {
		return UsersSpecHelper(params, "api/users");
	}
	
	public static RequestSpecification ListUsersSpec() {
		RequestSpecParams params = new RequestSpecParams();
		params.authenticationType = Auth.None;
		return UsersSpecHelper(params, "api/users");
	}
	
	
	public static RequestSpecification GetUserDetailSpec(RequestSpecParams params, int userId) {		
		return UsersSpecHelper(params, "api/users/"+userId);
	}
	
	public static RequestSpecification GetUserDetailSpec(int userId) {		
		RequestSpecParams params = new RequestSpecParams();
		params.authenticationType = Auth.None;
		return UsersSpecHelper(params, "api/users/"+userId);
	}
	
	private static RequestSpecification UsersSpecHelper(RequestSpecParams params, String basePath) {
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setBaseUri("https://reqres.in/");
		reqBuilder.setBasePath(basePath);
		RequestSpecification spec = reqBuilder.build();
		return EvaluateReqParmas(spec, params);
	}
	
	private static RequestSpecification EvaluateReqParmas(RequestSpecification reqSpec, 
				RequestSpecParams params) {
		reqSpec = RequestAuthHelpers.EvaluateAuthType(reqSpec, params.authenticationType);
		return reqSpec;
	}

	
}
