package chain.of.responsibility;


public interface Chain {
	
	public void next(Request request);

}
