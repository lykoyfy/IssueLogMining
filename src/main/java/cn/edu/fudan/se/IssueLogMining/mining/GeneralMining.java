package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AbstractDataHandler;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;
import cn.edu.fudan.se.IssueLogMining.urlFactory.AbstractUrlFactory;

public class GeneralMining {
	
	private HttpRequestClientFactory clientFactory;
	private HibernateUtil dataUtil;	
	
	public void setClientFactory(HttpRequestClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	public void setDataUtil(HibernateUtil dataUtil) {
		this.dataUtil = dataUtil;
	}

	public void miningData(AbstractDataHandler dataHandler, AbstractUrlFactory urlFactory){
		dataHandler.setUtil(dataUtil);
		
		while(!urlFactory.isOver()){				
			HttpRequestClient client = clientFactory.produceHttpRequestClient();
			String[] urls = urlFactory.produceUrl();
			try {
				client.handleHttpGetRequest(urls, dataHandler);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
