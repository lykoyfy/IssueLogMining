package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AuthenticationHandler;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;

public class AuthenticationExcutor {
	
	public void authentication(HttpRequestClientFactory factory) throws Exception{
		HttpRequestClient client = factory.produceHttpRequestClient();
		AuthenticationHandler handler = new AuthenticationHandler();
		handler.setHttpRequest(factory);
		String[] urls = new String[1];
		urls[0] = "https://bugzilla.mozilla.org/rest/login?login=lyklove0810@sina.com&password=lyklovefy0810";
		client.handleHttpGetRequest(urls, handler);
	}
}
