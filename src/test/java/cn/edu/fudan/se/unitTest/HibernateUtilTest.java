package cn.edu.fudan.se.unitTest;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import cn.edu.fudan.se.IssueLogMining.bean.User;
import cn.edu.fudan.se.IssueLogMining.hibernate.HibernateUtil;

public class HibernateUtilTest {
	HibernateUtil util = new HibernateUtil();
	
	@After
	public void afterTest(){
		util.closeSession();
	}
	
	@Test
	public void testSave(){
		User user = new User();
		user.setCan_login(true);
		user.setEmail("email");
		user.setId(11);
		user.setIs_new(false);
		user.setName("name");
		user.setReal_name("real_name");
		
		LinkedList<User> list = new LinkedList<User>();
		list.add(user);
		
		util.save(list);
		
		List<User> users = util.query("from User u where u.id=11");
		User userTest = users.get(0);
		
		Assert.assertEquals(user.getId(), userTest.getId());
		Assert.assertEquals(user.getName(), userTest.getName());		
	}
	
	
}
