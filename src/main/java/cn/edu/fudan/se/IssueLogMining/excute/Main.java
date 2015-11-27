package cn.edu.fudan.se.IssueLogMining.excute;

import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;
import cn.edu.fudan.se.IssueLogMining.mining.AuthenticationExcutor;
import cn.edu.fudan.se.IssueLogMining.mining.MiningUser;

public class Main {
	public static void main(String[] args) throws Exception{
		AuthenticationExcutor authentication = new AuthenticationExcutor();
		HttpRequestClientFactory factory = new HttpRequestClientFactory();
		authentication.authentication(factory);
		
		HibernateUtil util = new HibernateUtil();
		MiningUser miningUser = new MiningUser();
		miningUser.setClientFactory(factory);
		miningUser.setDataUtil(util);
		try{
			miningUser.miningUserData();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			util.closeFactory();
		}
	}
}
