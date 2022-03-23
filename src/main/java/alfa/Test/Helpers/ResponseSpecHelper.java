package alfa.Test.Helpers;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecHelper {
	
	public static ResponseSpecification HttpOkResp() {
		return HttpRespCode(200);
	}
	
	public static ResponseSpecification HttpCreatedResp() {
		return HttpRespCode(201);
	}
	
	public static ResponseSpecification HttpNoContentResp() {
		return HttpRespCode(204);
	}
	
	public static ResponseSpecification HttpBadReqResp() {
		return HttpRespCode(400);
	}
	
	public static ResponseSpecification HttpRespCode(int respCode) {
		ResponseSpecBuilder respBuilder = new ResponseSpecBuilder();
		respBuilder.expectStatusCode(respCode);
		
		return respBuilder.build();
	}
}
