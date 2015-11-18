package cn.edu.fudan.se.IssueLogMining.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flag_type")
public class FlagType {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	private String name;
	private String description;
	private String cc_list;
	private String sort_key;
	private boolean is_active;
	private boolean is_requestable;
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
	public String getCc_list() {
		return cc_list;
	}
	public void setCc_list(String cc_list) {
		this.cc_list = cc_list;
	}
	public String getSort_key() {
		return sort_key;
	}
	public void setSort_key(String sort_key) {
		this.sort_key = sort_key;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public boolean isIs_requestable() {
		return is_requestable;
	}
	public void setIs_requestable(boolean is_requestable) {
		this.is_requestable = is_requestable;
	}
	
	

}
