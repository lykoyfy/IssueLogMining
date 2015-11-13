package cn.edu.fudan.se.IssueLogMining.bean;

public class Attachment {
	private int id;
	private int size;
	private String creation_time;
	private String last_change_time;
	private int bug_id;
	private String file_name;
	private String summary;
	private String content_type;
	private boolean is_private;
	private boolean is_obsolete;
	private boolean is_patch;
	private String creator;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	public String getLast_change_time() {
		return last_change_time;
	}
	public void setLast_change_time(String last_change_time) {
		this.last_change_time = last_change_time;
	}
	public int getBug_id() {
		return bug_id;
	}
	public void setBug_id(int bug_id) {
		this.bug_id = bug_id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public boolean isIs_private() {
		return is_private;
	}
	public void setIs_private(boolean is_private) {
		this.is_private = is_private;
	}
	public boolean isIs_obsolete() {
		return is_obsolete;
	}
	public void setIs_obsolete(boolean is_obsolete) {
		this.is_obsolete = is_obsolete;
	}
	public boolean isIs_patch() {
		return is_patch;
	}
	public void setIs_patch(boolean is_patch) {
		this.is_patch = is_patch;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	
	
}
