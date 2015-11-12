package cn.edu.fudan.se.IssueLogMining.dataHandler;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.JSONTokener;

import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClient;
import cn.edu.fudan.se.IssueLogMining.httpHandler.HttpRequestClientFactory;

public class AuthenticationHandler extends AbstractDataHandler {
	
	private HttpRequestClientFactory clientFactory;
	
	public void setHttpRequest(HttpRequestClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void cancelled() {
		super.countDown();
        System.out.println("cancelled!!");
        super.printInfo();
	}

	@Override
	public void completed(HttpResponse response) {
        System.out.println("completedss!!");
        System.out.println(response.getStatusLine());
        HttpEntity myEntity = response.getEntity();
        try {
            JSONTokener jsonTokener = new JSONTokener(EntityUtils.toString(myEntity));
            JSONObject tokenJson = (JSONObject) jsonTokener.nextValue();  
            String token = tokenJson.getString("token");
            int id = tokenJson.getInt("id");
            System.out.println(token);
            System.out.println(id);
            clientFactory.setToken(token);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        super.printInfo();
		super.countDown();		
	}

	@Override
	public void failed(Exception arg0) {
		super.countDown();
        System.out.println("failed!!");
        super.printInfo();
	}

	@Override
	public AbstractDataHandler clone() {
		AuthenticationHandler ret =  new AuthenticationHandler();
		ret.setHttpRequest(clientFactory);
		return ret;
	}
	
}
