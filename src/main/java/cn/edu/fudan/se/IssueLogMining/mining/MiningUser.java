package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.dataHandler.UserDataHandler;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;

public class MiningUser {
	
	private HttpRequestClientFactory clientFactory;
	private HibernateUtil dataUtil;
	
	public void setClientFactory(HttpRequestClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	public void setDataUtil(HibernateUtil dataUtil) {
		this.dataUtil = dataUtil;
	}

	public void miningUserData() throws Exception{
		UserDataHandler dataHandler = new UserDataHandler();
		dataHandler.setUtil(dataUtil);
		
		String[] urls = new String[100];
		int ids = 469711;
		while(ids < 555176){
			for(int j=0; j<100; j++){
				StringBuilder urlBuilder = new StringBuilder("https://bugzilla.mozilla.org/rest/user?");
				for(int z=0; z<30; z++){
					urlBuilder.append("ids=").append(ids).append("&");
					ids++;
				}
				urlBuilder.deleteCharAt(urlBuilder.length()-1);
				urls[j] = urlBuilder.toString();
			}
			
			HttpRequestClient client = clientFactory.produceHttpRequestClient();						
			client.handleHttpGetRequest(urls, dataHandler);
		}
		
		//client.closeHttpClient();
	}
}
