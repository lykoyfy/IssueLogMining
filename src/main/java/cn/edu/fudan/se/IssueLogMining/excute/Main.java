package cn.edu.fudan.se.IssueLogMining.excute;


public class Main {
	public static void main(String[] args) throws Exception{
		StartUp start = new StartUp();
		start.init();
		
		start.miningBugs();
	}	
}
