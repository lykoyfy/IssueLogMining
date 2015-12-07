package cn.edu.fudan.se.IssueLogMining.dataHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;

import cn.edu.fudan.se.IssueLogMining.decoder.UserDecode;

public class GerneralDataHandler<T> extends AbstractDataHandler{
	
	private Class<?> data;
	
	public void setData(Class<?> data) {
		this.data = data;
	}

	@Override
	public void cancelled() {
		super.countDown();
        System.out.println("cancelled!!");
        super.printInfo();
	}

	@Override
	public void completed(HttpResponse response) {
        System.out.println("completed!!");
        System.out.println(response.getStatusLine());
        HttpEntity myEntity = response.getEntity();
        StringBuffer result = new StringBuffer();
        BufferedReader rd;
		try {
			rd = new BufferedReader(new InputStreamReader(myEntity.getContent()));
	        String tempLine = rd.readLine();
	        while (tempLine != null) {
	         result.append(tempLine);
	         tempLine = rd.readLine();
	        }
		} catch (UnsupportedOperationException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
        try {
        	List<T> dataList = UserDecode.decodeList(result.toString(), data);
        	dataUtil.save(dataList);
        	dataUtil.closeSession();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally{
	        super.printInfo();
			super.countDown();
			
		}		
	}

	@Override
	public void failed(Exception arg0) {
		super.countDown();
        System.out.println("failed!!");
        arg0.printStackTrace();
        super.printInfo();
		
	}

	@Override
	public AbstractDataHandler clone() {
		GerneralDataHandler handler = new GerneralDataHandler();
		handler.setUtil(dataUtil);
		handler.setData(data);
		return handler;
	}

}
