package org.bonanzaone.chain_of_responsability;


public interface RequestHandler {
	
	public void handleRequest(Request request, Chain chain);

}
