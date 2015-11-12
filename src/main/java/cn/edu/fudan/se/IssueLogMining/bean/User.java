package cn.edu.fudan.se.IssueLogMining.bean;

import java.util.List;

public class User {
	
	private int id;
	private boolean can_login;
	private boolean is_new;
	private String real_name;
	private String name;
	private String email;
	private List<Integer> groups;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isCan_login() {
		return can_login;
	}
	public void setCan_login(boolean can_login) {
		this.can_login = can_login;
	}
	public boolean isIs_new() {
		return is_new;
	}
	public void setIs_new(boolean is_new) {
		this.is_new = is_new;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Integer> getGroups() {
		return groups;
	}
	public void setGroups(List<Integer> groups) {
		this.groups = groups;
	}
	
	public String toString(){
		String ret = "id = " + id
				+"\nname = " + name
				+"\nreal_name = " + real_name
				+"\nemail = " + email
				+"\ncan_login = " + can_login
				+"\nis_new = " + is_new;
		for(int i: groups){
			ret += "\ni";
		}
		
		return ret;
	}

}
