package org.bonanzaone.chain_of_responsability;

public class TextHandler implements RequestHandler {

	@Override
	public void handleRequest(Request request, Chain chain) {

		try {
			System.out.println("Text handler!");
		} finally {
			chain.next(request);
		}

	}

}
