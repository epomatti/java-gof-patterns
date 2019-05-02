package chain.of.responsibility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RequestChain implements Chain{	
	
	@Override
	public void next(Request request) {		
		if(requestHandlers.hasNext()) {
			requestHandlers.next().handleRequest(request, this);
		}
	}
	
	private List<RequestHandler> requestHandlerList = new ArrayList<>();
	
	public void add(RequestHandler handler) {
		requestHandlerList.add(handler);
	}
	
	private Iterator<RequestHandler> requestHandlers = null;
	
	public void startChain(Request request) {
		requestHandlers = requestHandlerList.iterator();
		next(request);
	}

}
