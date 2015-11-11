package cn.edu.fudan.se.IssueLogMining.dataHandler;

import org.apache.http.HttpResponse;

public class UserDataHandler extends AbstractDataHandler{

	@Override
	public void cancelled() {
		super.countDown();
        System.out.println("cancelled!!");
        super.printInfo();
	}

	@Override
	public void completed(HttpResponse response) {
		super.countDown();
        System.out.println("completed!!");
        System.out.println(response.getStatusLine());
        super.printInfo();
		
	}

	@Override
	public void failed(Exception arg0) {
		super.countDown();
        System.out.println("failed!!");
        super.printInfo();
		
	}

	@Override
	public AbstractDataHandler clone() {
		return new UserDataHandler();
	}
	
}
