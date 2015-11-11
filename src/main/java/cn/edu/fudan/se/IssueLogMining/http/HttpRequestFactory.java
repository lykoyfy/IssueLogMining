/**
 * 
 * author: lyk
 * 
 */
package cn.edu.fudan.se.IssueLogMining.http;

import java.util.concurrent.CountDownLatch;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AbstractDataHandler;

public class HttpRequestFactory {

	private CloseableHttpAsyncClient httpclient;
	private String token;
	
	public void setToken(String token){
		this.token = token;
	}
	
	public void init(){
		RequestConfig requestConfig = RequestConfig.custom()
				    .setSocketTimeout(3000).setConnectTimeout(3000).build();
		httpclient = HttpAsyncClients.custom()
				    .setDefaultRequestConfig(requestConfig).build();
	}
	
	public void handleHttpGetRequest(String[] urls, AbstractDataHandler dataHandler) throws Exception{
		try{
			httpclient.start();
			final CountDownLatch latch = new CountDownLatch(urls.length);
			
			for(String url : urls){
			    final HttpGet request = new HttpGet(url);
			    AbstractDataHandler cloneDataHandler =  dataHandler.clone();
			    cloneDataHandler.setLatch(latch);
			    cloneDataHandler.setRequest(request);
			    httpclient.execute(request, cloneDataHandler);			    
			}
			
			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}finally{
			httpclient.close();
		}
		 
				
	}
	
	
}
