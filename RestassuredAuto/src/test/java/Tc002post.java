import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tc002post {
	@Test
	 void postrequest()
	{
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification https=RestAssured.given();
		JSONObject requestparams=new JSONObject();
		requestparams.put( "name","lohit");
		requestparams.put("job","leader");
		
		https.header("Content-Type","application/JSON");
		https.body(requestparams.toJSONString());
		Response response=https.request(Method.POST,"/users");
		String resonsebody=response.getBody().asString();
		System.out.println("response body:"+resonsebody);
		int StatusCode=response.getStatusCode();
		System.out.println("status code:"+StatusCode);
		Assert.assertEquals(StatusCode,201);
		
		
		
		
	}

}