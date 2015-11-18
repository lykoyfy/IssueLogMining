package cn.edu.fudan.se.runtime.test;

import java.util.LinkedList;
import java.util.List;

import cn.edu.fudan.se.IssueLogMining.bean.User;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args){
		
		HibernateUtil util = new HibernateUtil();

		User user = new User();
		user.setCan_login(true);
		user.setEmail("email");
		user.setId(26);
		user.setIs_new(false);
		user.setName("name");
		user.setReal_name("real_name");
		
		LinkedList<User> list = new LinkedList<User>();
		list.add(user);
		
		util.save(list);
		
		List<User> users = util.query("from User u where u.id=11");
		User userTest = users.get(0);

		System.out.println(userTest.getId() + "\t" + user.getId());
		
		util.closeSession();
		util.closeFactory();
	}
}
