package drivers.interfaces;

public interface Driver {

	public void commit();

	public void rollback();

	public void execute(String sql);

	public String getDriverName();

}
