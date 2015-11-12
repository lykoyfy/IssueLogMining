package cn.edu.fudan.se.IssueLogMining.httpHandler;

public class HttpRequestClientFactory {
	private String token;
	
	public void setToken(String token) {
		this.token = token;
	}

	public HttpRequestClient produceHttpRequestClient(){
		HttpRequestClient client = new HttpRequestClient();
		client.setToken(token);
		client.init();
		return client;
	}
}
