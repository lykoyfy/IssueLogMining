package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AuthenticationHandler;
import cn.edu.fudan.se.IssueLogMining.excute.Properties;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;

public class AuthenticationExcutor {
	
	public void authentication(HttpRequestClient client, Properties properties) throws Exception{
		AuthenticationHandler handler = new AuthenticationHandler();
		handler.setProperties(properties);
		String[] urls = new String[1];
		urls[0] = "https://bugzilla.mozilla.org/rest/login?login=lyklove0810@sina.com&password=lyklovefy0810";
		client.handleHttpGetRequest(urls, handler);
	}
}
