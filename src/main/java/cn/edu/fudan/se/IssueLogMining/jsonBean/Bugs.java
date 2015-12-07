package cn.edu.fudan.se.IssueLogMining.jsonBean;

import java.util.List;

import cn.edu.fudan.se.IssueLogMining.bean.Bug;

public class Bugs implements JsonBean{
	
	private List<Bug> bugs;
	
	@SuppressWarnings("unchecked")
	public List<Bug> getChildren(){
		return bugs;
	}
}
