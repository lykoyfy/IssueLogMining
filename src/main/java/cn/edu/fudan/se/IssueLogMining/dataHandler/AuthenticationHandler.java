package cn.edu.fudan.se.IssueLogMining.dataHandler;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;

public class AuthenticationHandler extends AbstractDataHandler {

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
        System.out.println(myEntity.getContentType());
        try {
			System.out.println(EntityUtils.toString(myEntity));
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
		return new AuthenticationHandler();
	}
	
}
