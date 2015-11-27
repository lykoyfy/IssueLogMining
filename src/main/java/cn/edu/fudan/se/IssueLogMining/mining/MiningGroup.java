package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
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
		
	}
}
