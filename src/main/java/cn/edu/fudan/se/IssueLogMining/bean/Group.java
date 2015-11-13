package cn.edu.fudan.se.IssueLogMining.bean;

public class Group {
	private int id;
	private String name;
	private String description;
	private boolean is_bug_group; 
	private String user_regexp;
	private boolean is_active;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIs_bug_group() {
		return is_bug_group;
	}
	public void setIs_bug_group(boolean is_bug_group) {
		this.is_bug_group = is_bug_group;
	}
	public String getUser_regexp() {
		return user_regexp;
	}
	public void setUser_regexp(String user_regexp) {
		this.user_regexp = user_regexp;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
}
