package cn.edu.fudan.se.runtime.test;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AuthenticationHandler;
import cn.edu.fudan.se.IssueLogMining.dataHandler.UserDataHandler;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;

public class Test {
	public static void main(String[] args) throws Exception{
		HttpRequestClientFactory factory = new HttpRequestClientFactory();
		HttpRequestClient client1 = factory.produceHttpRequestClient();
		
		AuthenticationHandler handler = new AuthenticationHandler();
		handler.setHttpRequest(factory);
		String[] urls = new String[1];
		urls[0] = "https://bugzilla.mozilla.org/rest/login?login=lyklove0810@sina.com&password=lyklovefy0810";
		client1.handleHttpGetRequest(urls, handler);

		HttpRequestClient client2 = factory.produceHttpRequestClient();
		UserDataHandler handler2 = new UserDataHandler();
		urls = new String[1];
		urls[0] = "https://bugzilla.mozilla.org/rest/user?ids=555333";
		client2.handleHttpGetRequest(urls, handler2);
	}
}
