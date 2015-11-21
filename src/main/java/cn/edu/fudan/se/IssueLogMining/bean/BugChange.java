package cn.edu.fudan.se.IssueLogMining.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="changes")
public class BugChange {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	private int history_id;
	private String field_name;
	private String removed;
	private String added;
	private int attachment_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHistory_id() {
		return history_id;
	}
	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}
	public String getField_name() {
		return field_name;
	}
	public void setField_name(String field_name) {
		this.field_name = field_name;
	}
	public String getRemoved() {
		return removed;
	}
	public void setRemoved(String removed) {
		this.removed = removed;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public int getAttachment_id() {
		return attachment_id;
	}
	public void setAttachment_id(int attachment_id) {
		this.attachment_id = attachment_id;
	}

	
}
