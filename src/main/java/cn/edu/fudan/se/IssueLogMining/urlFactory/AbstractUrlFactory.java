package cn.edu.fudan.se.IssueLogMining.urlFactory;

public abstract class AbstractUrlFactory {
	
	protected String token;
	protected int index;
	protected int requestSize = 100;
	protected int arraySize = 100;
	protected int maxSize;

	public abstract String[] produceUrl();
	
	public void setToken(String token){
		this.token = token;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setRequestSize(int requestSize) {
		this.requestSize = requestSize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public boolean isOver(){
		if(index < maxSize){
			return false;
		}
		return true;
	}
	
}
