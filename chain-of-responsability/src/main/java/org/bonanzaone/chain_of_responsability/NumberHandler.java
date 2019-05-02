package org.bonanzaone.chain_of_responsability;

public class NumberHandler implements RequestHandler {

	@Override
	public void handleRequest(Request request, Chain chain) {

		try {
			Double.parseDouble(request.getRequest());
			System.out.println("Handled by Number Handler");
		} catch (NumberFormatException e) {
			System.out.println("Number Handler wasnt able to handle value: " + request.getRequest());
		} finally {
			chain.next(request);
		}

	}

}
