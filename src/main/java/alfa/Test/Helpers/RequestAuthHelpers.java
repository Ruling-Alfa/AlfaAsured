package alfa.Test.Helpers;

import io.restassured.authentication.FormAuthConfig;
import io.restassured.specification.RequestSpecification;

public class RequestAuthHelpers {
	private static String USERNAME = "username";
	private static String PASSWORD = "password";
	private static String OAuthToken = "token";

	public static RequestSpecification EvaluateAuthType(RequestSpecification reqSpec, Auth auth) {
		switch (auth) {
		case Basic:
			reqSpec = setBasicAuthScheme(reqSpec);
			break;

		case PreEmptiveBasic:
			reqSpec = setPreEmptiveBasicAuthScheme(reqSpec);
			break;

		case Digest:
			reqSpec = setDigestAuthScheme(reqSpec);
			break;
			
		case FormAuth:
			reqSpec = setFormsAuthScheme(reqSpec);
			break;
		
		case OAuth:
			reqSpec = setOAuth2Scheme(reqSpec);
			break;

		default:
			break;
		}
		return reqSpec;
	}

	private static RequestSpecification setPreEmptiveBasicAuthScheme(RequestSpecification spec) {
		return spec.auth().preemptive().basic(USERNAME, PASSWORD);
	}

	private static RequestSpecification setBasicAuthScheme(RequestSpecification spec) {
		return spec.auth().basic(USERNAME, PASSWORD);
	}

	private static RequestSpecification setDigestAuthScheme(RequestSpecification spec) {
		return spec.auth().digest(USERNAME, PASSWORD);
	}

	private static RequestSpecification setFormsAuthScheme(RequestSpecification spec) {
		return spec.auth().form(USERNAME, PASSWORD, FormAuthConfig.springSecurity());
	}
	
	private static RequestSpecification setOAuth2Scheme(RequestSpecification spec) {
		return spec.auth().oauth2(OAuthToken);
	}
}