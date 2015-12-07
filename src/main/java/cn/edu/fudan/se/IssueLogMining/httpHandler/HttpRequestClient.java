/**
 * 
 * author: lyk
 * 
 */
package cn.edu.fudan.se.IssueLogMining.httpHandler;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import cn.edu.fudan.se.IssueLogMining.dataHandler.AbstractDataHandler;

public class HttpRequestClient {

	private CloseableHttpAsyncClient httpclient;
	
	public void init(){
		RequestConfig requestConfig = RequestConfig.custom()
				    .setSocketTimeout(300000).setConnectTimeout(300000).build();
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
				e.printStackTrace();
			}

		}finally{
			httpclient.close();
			System.out.println("over!!!");
		}
		 
				
	}
	
	public void closeHttpClient(){
		try {
			httpclient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
