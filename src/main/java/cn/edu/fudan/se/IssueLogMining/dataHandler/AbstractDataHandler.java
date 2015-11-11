package cn.edu.fudan.se.IssueLogMining.dataHandler;

import java.util.concurrent.CountDownLatch;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.concurrent.FutureCallback;

public abstract class AbstractDataHandler implements FutureCallback<HttpResponse>{
	private CountDownLatch latch;
	protected HttpRequestBase request;

	public void setLatch(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void setRequest(HttpRequestBase request) {
		this.request = request;
	}

	protected void countDown(){
		latch.countDown();
	}
	
	protected void printInfo(){
		System.out.println(request.getRequestLine());
	}
	
	abstract public AbstractDataHandler clone();
}
