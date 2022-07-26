import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Allheaders {
	@Test
	public void getheaders()
	{
		RestAssured.baseURI="https://maps.googleapis.com";
		RequestSpecification httpreq=RestAssured.given();
		Response response=httpreq.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");
		String responsebody=response.getBody().asString();
		System.out.println("response body is:"+responsebody);
		System.out.println("Headers are:");
		System.out.println(response.getHeaders());
		
	}

}