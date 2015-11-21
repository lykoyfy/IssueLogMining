package cn.edu.fudan.se.runtime.test;

import cn.edu.fudan.se.IssueLogMining.bean.Attachment;
import cn.edu.fudan.se.IssueLogMining.bean.Bug;
import cn.edu.fudan.se.IssueLogMining.bean.BugChange;
import cn.edu.fudan.se.IssueLogMining.bean.BugHistory;
import cn.edu.fudan.se.IssueLogMining.bean.Comment;
import cn.edu.fudan.se.IssueLogMining.bean.Component;
import cn.edu.fudan.se.IssueLogMining.bean.Flag;
import cn.edu.fudan.se.IssueLogMining.bean.FlagType;
import cn.edu.fudan.se.IssueLogMining.bean.Group;
import cn.edu.fudan.se.IssueLogMining.bean.User;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;

public class HibenrnateBeanClassTest {
	
	private static HibernateUtil util = new HibernateUtil();
	
	public static void main(String[] args){
		try{
			saveUser();
		
			saveAttachment();
			saveBug();
			saveBugChange();
			saveComment();
			saveComponent();
			saveFlag();
			saveFlagType();
			saveGroup();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error!!!");
		}finally{
			util.closeSession();
			util.closeFactory();			
		}
	}
	
	public static void saveUser(){
		User user = new User();
		user.setId(111);
		user.setEmail("mail");
		user.setName("name");
		user.setReal_name("real_name");
		
		util.save(user);
	}
	
	public static void saveAttachment(){
		Attachment attachment = new Attachment();
		attachment.setId(111);
		attachment.setBug_id(12);
		attachment.setContent_type("ssdadsa");
		
		util.save(attachment);
	}
	
	public static void saveBug(){
		Bug bug = new Bug();
		bug.setId(111);
		bug.setAssigned_to("sdasda");
		
		util.save(bug);
	}
	
	public static void saveBugChange(){
		BugChange change = new BugChange();
		change.setId(111);
		change.setField_name("sdadsad"); 
		
		util.save(change);
	}
	
	public static void saveBugHistory(){
		BugHistory history = new BugHistory();
		history.setId(111);
		
		util.save(history);
	}
	
	public static void saveComment(){
		Comment comment = new Comment();
		comment.setId(111);
		
		util.save(comment);
	}
	
	public static void saveComponent(){
		Component component = new Component();
		component.setId(111);
		
		util.save(component);
	}
	
	public static void saveFlag(){
		Flag flag = new Flag();
		flag.setId(111);
		
		util.save(flag);
	}
	
	public static void saveFlagType(){
		FlagType type = new FlagType();
		type.setId(111);
		
		util.save(type);
	}
	
	public static void saveGroup(){
		Group group = new Group();
		group.setId(111);
		
		util.save(group);
	}
	
}
