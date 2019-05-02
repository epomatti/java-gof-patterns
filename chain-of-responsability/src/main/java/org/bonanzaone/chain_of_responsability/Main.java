package org.bonanzaone.chain_of_responsability;

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
