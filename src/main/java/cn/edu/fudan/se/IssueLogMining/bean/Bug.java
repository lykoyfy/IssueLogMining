package cn.edu.fudan.se.IssueLogMining.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bug")
public class Bug {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private double actual_time;
	private String assigned_to;
	private String classification;
	private String component;
	private String creation_time;
	private String creator;
	private String deadline;
	private int dupe_of;     
	private boolean is_cc_accessible;
	private boolean is_confirmed;
	private boolean is_open;
	private boolean is_creator_accessible;
	private String last_change_time;
	private String op_sys;
	private String platform;
	private String priority;
	private String product;
	private String qa_contact;
	private String severity;
	private String status;
	private String summary;
	private String target_milestone;
	private String version;
	private String whiteboard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getActual_time() {
		return actual_time;
	}
	public void setActual_time(double actual_time) {
		this.actual_time = actual_time;
	}
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public int getDupe_of() {
		return dupe_of;
	}
	public void setDupe_of(int dupe_of) {
		this.dupe_of = dupe_of;
	}
	public boolean isIs_cc_accessible() {
		return is_cc_accessible;
	}
	public void setIs_cc_accessible(boolean is_cc_accessible) {
		this.is_cc_accessible = is_cc_accessible;
	}
	public boolean isIs_confirmed() {
		return is_confirmed;
	}
	public void setIs_confirmed(boolean is_confirmed) {
		this.is_confirmed = is_confirmed;
	}
	public boolean isIs_open() {
		return is_open;
	}
	public void setIs_open(boolean is_open) {
		this.is_open = is_open;
	}
	public boolean isIs_creator_accessible() {
		return is_creator_accessible;
	}
	public void setIs_creator_accessible(boolean is_creator_accessible) {
		this.is_creator_accessible = is_creator_accessible;
	}
	public String getLast_change_time() {
		return last_change_time;
	}
	public void setLast_change_time(String last_change_time) {
		this.last_change_time = last_change_time;
	}
	public String getOp_sys() {
		return op_sys;
	}
	public void setOp_sys(String op_sys) {
		this.op_sys = op_sys;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getQa_contact() {
		return qa_contact;
	}
	public void setQa_contact(String qa_contact) {
		this.qa_contact = qa_contact;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getTarget_milestone() {
		return target_milestone;
	}
	public void setTarget_milestone(String target_milestone) {
		this.target_milestone = target_milestone;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getWhiteboard() {
		return whiteboard;
	}
	public void setWhiteboard(String whiteboard) {
		this.whiteboard = whiteboard;
	}
	
	

}
