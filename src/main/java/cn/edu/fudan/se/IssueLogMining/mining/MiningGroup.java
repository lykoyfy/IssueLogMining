package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.dataHandler.GroupDataHandler;
import cn.edu.fudan.se.IssueLogMining.dataHandler.UserDataHandler;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;

public class MiningGroup {
	
	private HttpRequestClientFactory clientFactory;
	private HibernateUtil dataUtil;	
	
	public void setClientFactory(HttpRequestClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	public void setDataUtil(HibernateUtil dataUtil) {
		this.dataUtil = dataUtil;
	}

	public void miningGroupData() throws Exception{
		GroupDataHandler dataHandler = new GroupDataHandler();
		dataHandler.setUtil(dataUtil);
		
		String[] urls = new String[1];
		urls[0] = "https://bugzilla.mozilla.org/rest/group?";
		
		HttpRequestClient client = clientFactory.produceHttpRequestClient();						
		client.handleHttpGetRequest(urls, dataHandler);
		int ids = 0;
//		while(ids < 10000){
//			for(int j=0; j<100; j++){
////				StringBuilder urlBuilder = new StringBuilder("https://bugzilla.mozilla.org/rest/group?"
////						+ "include_fields=is_active,description,user_regexp,is_bug_group,"
////						+"name,id;");
//				StringBuilder urlBuilder = new StringBuilder("https://bugzilla.mozilla.org/rest/group?");
//				for(int z=0; z<30; z++){
//					urlBuilder.append("ids=").append(ids).append("&");
//					ids++;
//				}
//				urlBuilder.deleteCharAt(urlBuilder.length()-1);
//				urls[j] = urlBuilder.toString();
//			}
//			
//			HttpRequestClient client = clientFactory.produceHttpRequestClient();						
//			client.handleHttpGetRequest(urls, dataHandler);
//		}
		
		
	}
}
