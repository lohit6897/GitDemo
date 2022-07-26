import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tc001GetReq {
	@Test
	void getweatherDetails()
	{
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RequestSpecification httpreq=RestAssured.given();
		Response resp=httpreq.request(Method.GET,"/employees");
		String responsebody=resp.getBody().asString();
		System.out.println(responsebody);
		int StatusCode=resp.getStatusCode();
		System.out.println("status code:"+StatusCode);
		Assert.assertEquals(StatusCode, 200);
		String statusline=resp.getStatusLine();
		System.out.println(statusline);
	
		
}
}