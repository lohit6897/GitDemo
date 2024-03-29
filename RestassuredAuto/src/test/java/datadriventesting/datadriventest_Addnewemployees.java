package datadriventesting;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class datadriventest_Addnewemployees 
{
	@Test(dataProvider="getEmpData")
	public void postnewEmployees(String ename,String ejob)
	{
	
	RestAssured.baseURI="https://reqres.in/api";
	RequestSpecification https=RestAssured.given();
	JSONObject requestparams=new JSONObject();
	requestparams.put("name",ename);
	requestparams.put("job",ejob);
	//requestparams.put("age",eage);
	
	https.header("Content-Type","application/JSON");
	https.body(requestparams.toJSONString());
	Response response=https.request(Method.POST,"/users");
	String responsebody=response.getBody().asString();
	System.out.println("Response Body is:  "+responsebody);
	
	
	int statuscode=response.statusCode();
	System.out.println("Status code: "+statuscode);
	}
	
	@DataProvider()
	String [][] getEmpData() throws IOException
	
	{
		String path=System.getProperty("user.dir")+"/src/test/java/datadriventesting/Datadriven.xlsx";
		int rowsnum=XLUtility.getRowCount(path, "Sheet1");
		
		int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
		
		String empdata[][]=new String[rowsnum][colcount];
		for(int i=1;i<=rowsnum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				empdata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
				
			}
		}
	
		return (empdata);

	}
}
	
