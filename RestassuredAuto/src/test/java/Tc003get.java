import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tc003get {
	@Test
	void google()
	{
		RestAssured.baseURI="https://maps.googleapis.com";
		RequestSpecification httpreq=RestAssured.given();
		Response response=httpreq.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");
		String responsebody=response.getBody().asString();
		System.out.println("response body is:"+responsebody);
		String contentType=response.header("Content-Type");// capture details of Content-Type header
		  System.out.println("Content Type is:"+contentType);
		  Assert.assertEquals(contentType, "application/xml; charset=UTF-8");
		  String contentEncoding=response.header("Content-Encoding");// capture details of Content-Encoding  header
		  System.out.println("Content Encoding is:"+contentEncoding);
		  Assert.assertEquals(contentEncoding, "gzip");
	}

}
