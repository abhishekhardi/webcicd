package Utilities;

import java.net.URL;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FetchApiResponse {
	
	static Response Response;
	static String value;
	static String key;
	

	public static Response PostMethod(String url, String postData, String Header)

	{
		RestAssured.baseURI  = url;	
    	Response r = RestAssured.given().
    					headers("accessToken", Header, "buildNumber", "2.1.78").
    			relaxedHTTPSValidation().    			
				contentType(ContentType.JSON).
				accept(ContentType.JSON).				
    	body(postData).
        when().
        post("/password-change");

    	return r;
    	
	}
	
	public static io.restassured.response.Response GetMethod_UAT(String Url)
	{
		Url=Url.trim();
		if(isValid(Url.trim()))
		{  	
			RestAssured.baseURI=Url;
			Response=	RestAssured.
					given().
					relaxedHTTPSValidation().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					header("usertype", "avod").
					header("accesstoken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJFT00xalJXejR0T0paZzQ4ZUU5N0ZrYU9zeEQzIiwiZW1haWwiOiJ0ZXN0LnN2b2QwMzhAZ21haWwuY29tIiwia1VzZXJJZCI6IjI1NjgzNzU2NSIsImlhdCI6MTU4MTA1MjE3OCwiZXhwIjoxNTgxOTE2MTc4LCJpc3MiOiJ2b290In0.Dw6KgDBvApYSgWnLDpCMPAU0alTrg6C5B5mH-jnj6q8").
					when().
					get(Url);
		}
		return Response;
	}
	
	
	public static io.restassured.response.Response GetMethod_PROD(String Url)
	{
		Url=Url.trim();
		if(isValid(Url.trim()))
		{  	
			RestAssured.baseURI=Url;
			Response=	RestAssured.
					given().
					relaxedHTTPSValidation().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					header("usertype", "avod").
					//header("accesstoken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiI3NzY1ZDkwNmU0MzU0NTVhOGI5NWRhOWVjNTUxMzVlMSIsImVtYWlsIjoiYXZpcy5taXNocmE5MUBnbWFpbC5jb20iLCJrVXNlcklkIjoiNTcwNzU2NjEiLCJpYXQiOjE1ODEwNTQ4MjksImV4cCI6MTU4MTkxODgyOSwiaXNzIjoidm9vdCJ9.PJDFJtb7wy0kO9c8pZ9Mts_3H6u9lwUE3G4tIA5IXnA").
					when().
					get(Url);
		}
		return Response;
	}
	
	
	public static io.restassured.response.Response PostMethod_UAT(String Url)
	{
		Url=Url.trim();
		if(isValid(Url.trim()))
		{  	
			RestAssured.baseURI=Url;
			Response=	RestAssured.
					given().
					relaxedHTTPSValidation().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					header("usertype", "avod").
					header("accesstoken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJFT00xalJXejR0T0paZzQ4ZUU5N0ZrYU9zeEQzIiwiZW1haWwiOiJ0ZXN0LnN2b2QwMzhAZ21haWwuY29tIiwia1VzZXJJZCI6IjI1NjgzNzU2NSIsImlhdCI6MTU4MTA1MjE3OCwiZXhwIjoxNTgxOTE2MTc4LCJpc3MiOiJ2b290In0.Dw6KgDBvApYSgWnLDpCMPAU0alTrg6C5B5mH-jnj6q8").
					when().
					get(Url);
		}
		return Response;
	}
	
	
	public static io.restassured.response.Response PostMethod_PROD(String Url)
	{
		Url=Url.trim();
		if(isValid(Url.trim()))
		{  	
			RestAssured.baseURI=Url;
			Response=	RestAssured.
					given().
					relaxedHTTPSValidation().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					header("usertype", "avod").
					header("accesstoken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiI3NzY1ZDkwNmU0MzU0NTVhOGI5NWRhOWVjNTUxMzVlMSIsImVtYWlsIjoiYXZpcy5taXNocmE5MUBnbWFpbC5jb20iLCJrVXNlcklkIjoiNTcwNzU2NjEiLCJpYXQiOjE1ODEwNTQ4MjksImV4cCI6MTU4MTkxODgyOSwiaXNzIjoidm9vdCJ9.PJDFJtb7wy0kO9c8pZ9Mts_3H6u9lwUE3G4tIA5IXnA").
					when().
					get(Url);
		}
		return Response;
	}
	
		
	public static io.restassured.response.Response DeleteMethod_UAT(String Url)
	{
		Url=Url.trim();
		if(isValid(Url.trim()))
		{  	
			RestAssured.baseURI=Url;
			Response=	RestAssured.
					given().
					relaxedHTTPSValidation().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					header("usertype", "avod").
					header("accesstoken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiJFT00xalJXejR0T0paZzQ4ZUU5N0ZrYU9zeEQzIiwiZW1haWwiOiJ0ZXN0LnN2b2QwMzhAZ21haWwuY29tIiwia1VzZXJJZCI6IjI1NjgzNzU2NSIsImlhdCI6MTU4MTA1MjE3OCwiZXhwIjoxNTgxOTE2MTc4LCJpc3MiOiJ2b290In0.Dw6KgDBvApYSgWnLDpCMPAU0alTrg6C5B5mH-jnj6q8").
					when().
					get(Url);
		}
		return Response;
	}
	
	
	public static io.restassured.response.Response DeleteMethod_PROD(String Url)
	{
		Url=Url.trim();
		if(isValid(Url.trim()))
		{  	
			RestAssured.baseURI=Url;
			Response=	RestAssured.
					given().
					relaxedHTTPSValidation().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					header("usertype", "avod").
					header("accesstoken", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiI3NzY1ZDkwNmU0MzU0NTVhOGI5NWRhOWVjNTUxMzVlMSIsImVtYWlsIjoiYXZpcy5taXNocmE5MUBnbWFpbC5jb20iLCJrVXNlcklkIjoiNTcwNzU2NjEiLCJpYXQiOjE1ODEwNTQ4MjksImV4cCI6MTU4MTkxODgyOSwiaXNzIjoidm9vdCJ9.PJDFJtb7wy0kO9c8pZ9Mts_3H6u9lwUE3G4tIA5IXnA").
					when().
					get(Url);
		}
		return Response;
	}
	
		
	public static boolean isValid(String url)
    {
       try 
       {
            new URL(url).toURI();
            return true;
        }
       catch (Exception e)
       {
            return false;
       }
    }
	
	
	public static Boolean StatusCodeCompare(io.restassured.response.Response resp)
	{
		if(resp.getStatusCode()==200)
			return true;
		else
			return false;
		
	}

	public static Response PostMethod(String url, String postData)
	{
		RestAssured.baseURI  = url.trim();	
    	Response r = RestAssured.given().
    			relaxedHTTPSValidation().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
    	body(postData).
        when().
        post("");

    	return r;
	}
	
	public static Response PutMethod(String url, String postData)
	{
		RestAssured.baseURI  = url.trim();	
    	Response r = RestAssured.given().
    			relaxedHTTPSValidation().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
    	body(postData).
        when().
        put("");
    	return r;
	}
	
	public static Response PostMethodWithFormParam(String url, String postData)
	{
		RequestSpecification requestSpec=new RequestSpecBuilder().addParam("","").build();
		if(postData=="" || postData.equalsIgnoreCase(null))
		{
			key="";
			value="";
			requestSpec.formParam(key,value);
		}
		else
		{
			String[] arr=postData.split(",");
			String[] arr1=null;
			
			for(int i=0;i<arr.length;i++)
			{
				String s=arr[i].replace("\n", "");
				arr1=s.split(":");
				key=arr1[0];
				
				if(arr1.length==1)
				{
//					System.out.println("Empty");
					value="";
				}
				else
				{
					value=arr1[1];
				}
				
				requestSpec.formParam(key,value);
			}
		}
		
		requestSpec
				.baseUri(url)
				.sessionId("S31508252");

		Response r=RestAssured.given().log().all().
        spec((RequestSpecification) requestSpec).post(url);
//		System.out.println(r.asString());
		return r;	
	}
}
