package cn.edu.fudan.se.IssueLogMining.jsonBean;

import java.util.List;

import cn.edu.fudan.se.IssueLogMining.bean.Group;

public class Groups implements JsonBean{

	private List<Group> groups;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Group> getChildren() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	
}
