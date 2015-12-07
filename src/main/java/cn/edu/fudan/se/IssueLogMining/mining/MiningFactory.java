package cn.edu.fudan.se.IssueLogMining.mining;

import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;

public class MiningFactory {
	
	private HttpRequestClientFactory factory ;
	private HibernateUtil util;
	
	public void setFactory(HttpRequestClientFactory factory) {
		this.factory = factory;
	}

	public void setUtil(HibernateUtil util) {
		this.util = util;
	}

	public GeneralMining produceMinigEngine(){
		GeneralMining mining = new GeneralMining();
		mining.setClientFactory(factory);
		mining.setDataUtil(util);
		return mining;
	}
}
