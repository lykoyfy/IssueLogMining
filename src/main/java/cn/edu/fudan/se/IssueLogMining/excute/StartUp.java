package cn.edu.fudan.se.IssueLogMining.excute;

import cn.edu.fudan.se.IssueLogMining.bean.Bug;
import cn.edu.fudan.se.IssueLogMining.dataHandler.GerneralDataHandler;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;
import cn.edu.fudan.se.IssueLogMining.jsonBean.Bugs;
import cn.edu.fudan.se.IssueLogMining.mining.AuthenticationExcutor;
import cn.edu.fudan.se.IssueLogMining.mining.GeneralMining;
import cn.edu.fudan.se.IssueLogMining.mining.MiningFactory;
import cn.edu.fudan.se.IssueLogMining.urlFactory.BugUrlFactory;

public class StartUp {
	private Properties properties ;
	private HttpRequestClientFactory clientFactory ;
	private HibernateUtil util;
	private MiningFactory miningFactory ;
	
	public void init(){
		globalInit();
		authentication();
		readConfig();
	}
	
	private void globalInit(){
		properties = new Properties();
		clientFactory = new HttpRequestClientFactory();
		util = new HibernateUtil();
		miningFactory = new MiningFactory();
		miningFactory.setFactory(clientFactory);
		miningFactory.setUtil(util);
	}
	
	private void authentication(){
		AuthenticationExcutor authenticationExcutor = new AuthenticationExcutor();
		try {
			authenticationExcutor.authentication(clientFactory.produceHttpRequestClient(), properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readConfig(){
		
	}
	
	public void miningBugs(){
		GeneralMining bugMining = miningFactory.produceMinigEngine();
		
		BugUrlFactory urlFactory = new BugUrlFactory();
		urlFactory.setToken(properties.getToken());
		urlFactory.setRequestSize(1);
		urlFactory.setMaxSize(10000);
		
		GerneralDataHandler<Bug> dataHandler = new GerneralDataHandler<Bug>();
		dataHandler.setData(Bugs.class);
		dataHandler.setUtil(util);
		
		bugMining.miningData(dataHandler, urlFactory);
	}
}
