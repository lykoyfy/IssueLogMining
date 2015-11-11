package cn.edu.fudan.se.unitTest;

import org.junit.Before;
import org.junit.Test;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AuthenticationHandler;
import cn.edu.fudan.se.IssueLogMining.dataHandler.UserDataHandler;
import cn.edu.fudan.se.IssueLogMining.http.HttpRequestFactory;

public class HttpRequestTest {
	HttpRequestFactory factory = new HttpRequestFactory();
	String token;
	@Before
	public void before(){
		factory.init();
	}
	
//	@Test
//	public void testHandleGetRequest() throws Exception{
//		UserDataHandler handler = new UserDataHandler();
//		String[] urls = new String[1];
//		urls[0] = "https://bugzilla.mozilla.org/rest/user?ids=123";
//		factory.handleHttpGetRequest(urls, handler);
//	}
	
	@Test
	public void testAuthentication() throws Exception{
		AuthenticationHandler handler = new AuthenticationHandler();
		String[] urls = new String[1];
		urls[0] = "https://bugzilla.mozilla.org/rest/login?login=lyklove0810@sina.com&password=lyklovefy0810";
		factory.handleHttpGetRequest(urls, handler);
		
	}
	
}
