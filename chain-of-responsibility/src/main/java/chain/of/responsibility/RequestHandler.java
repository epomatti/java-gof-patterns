package chain.of.responsibility;


public interface RequestHandler {
	
	public void handleRequest(Request request, Chain chain);

}
