package cn.edu.fudan.se.IssueLogMining.decoder;

import java.util.List;

import com.google.gson.Gson;

import cn.edu.fudan.se.IssueLogMining.bean.User;
import cn.edu.fudan.se.IssueLogMining.jsonBean.Users;

public class UserDecode {

	
	public static List<User> decodeUser(String jsonString){
		Gson gson = new Gson();
		Users user = gson.fromJson(jsonString, Users.class);
		return user.getChildren();
 	}
	
	public static <T> T decode(String jsonString, Class c){
		Gson gson = new Gson();
		T t = gson.fromJson(jsonString, c);
		return t;
	}
	
}
