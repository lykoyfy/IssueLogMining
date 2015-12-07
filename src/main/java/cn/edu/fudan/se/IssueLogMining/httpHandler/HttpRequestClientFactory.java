package cn.edu.fudan.se.IssueLogMining.httpHandler;

public class HttpRequestClientFactory {

	public HttpRequestClient produceHttpRequestClient(){
		HttpRequestClient client = new HttpRequestClient();
		client.init();
		return client;
	}
}
