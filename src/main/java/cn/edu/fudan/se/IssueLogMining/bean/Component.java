package cn.edu.fudan.se.IssueLogMining.bean;

public class Component {
	private int id;
	private String name;
	private String description;
	private String default_assigned_to;
	private String default_qa_contact;
	private int sort_key;
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
	public String getDefault_assigned_to() {
		return default_assigned_to;
	}
	public void setDefault_assigned_to(String default_assigned_to) {
		this.default_assigned_to = default_assigned_to;
	}
	public String getDefault_qa_contact() {
		return default_qa_contact;
	}
	public void setDefault_qa_contact(String default_qa_contact) {
		this.default_qa_contact = default_qa_contact;
	}
	public int getSort_key() {
		return sort_key;
	}
	public void setSort_key(int sort_key) {
		this.sort_key = sort_key;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	

}
