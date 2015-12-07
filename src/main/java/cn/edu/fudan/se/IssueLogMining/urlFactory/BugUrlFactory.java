package cn.edu.fudan.se.IssueLogMining.urlFactory;

public class BugUrlFactory extends AbstractUrlFactory{

	private final String baseUrl = "https://bugzilla.mozilla.org/rest/bug?";
	
	@Override
	public String[] produceUrl() {
		
		if(super.isOver()){
			return null;
		}
		
		String[] urls = new String[super.arraySize];		
		for(int i=0; i<super.arraySize; i++){
			StringBuilder urlBuilder = new StringBuilder(baseUrl);
			for(int j=0; j<super.requestSize; j++){
				urlBuilder.append("id="+index+"&");
				index++;
			}
			urlBuilder.append("token="+super.token);
			urls[i] = urlBuilder.toString();
		}
		return urls;
	}
	
	
	
	
	
}
