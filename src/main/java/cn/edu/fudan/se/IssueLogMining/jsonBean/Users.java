package cn.edu.fudan.se.IssueLogMining.jsonBean;

import java.util.List;

import cn.edu.fudan.se.IssueLogMining.bean.User;

public class Users implements JsonBean{
	private List<User> users;

	@SuppressWarnings("unchecked")
	public List<User> getChildren() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
