import chain.of.responsibility.NumberHandler;
import chain.of.responsibility.Request;
import chain.of.responsibility.RequestChain;
import chain.of.responsibility.TextHandler;

public class Main {

	public static void main(String[] args) {

		RequestChain chain = new RequestChain();
		chain.add(new NumberHandler());
		chain.add(new TextHandler());
		
		Request textRequest = new Request();
		textRequest.setRequest("Test");
		
		chain.startChain(textRequest);
		
	}

}
