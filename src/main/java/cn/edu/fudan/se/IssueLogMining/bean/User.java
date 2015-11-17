package cn.edu.fudan.se.IssueLogMining.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	private boolean can_login;
	
	
	private String real_name;
	private String name;
	private String email;
	
	@Transient
	private List<Integer> groups;
	@Transient
	private boolean is_new;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="can_login")
	public boolean isCan_login() {
		return can_login;
	}
	public void setCan_login(boolean can_login) {
		this.can_login = can_login;
	}
	@Column(name="is_new")
	public boolean isIs_new() {
		return is_new;
	}
	public void setIs_new(boolean is_new) {
		this.is_new = is_new;
	}
	@Column(name="real_name")
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="email")
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
