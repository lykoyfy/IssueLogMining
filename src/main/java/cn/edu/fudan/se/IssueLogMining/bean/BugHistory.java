package cn.edu.fudan.se.IssueLogMining.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history")
public class BugHistory {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	private int bug_id;
	private String time;
	private String who;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBug_id() {
		return bug_id;
	}
	public void setBug_id(int bug_id) {
		this.bug_id = bug_id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}

	
}
