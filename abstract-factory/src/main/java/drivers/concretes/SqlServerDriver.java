package drivers.concretes;

import drivers.interfaces.Driver;

public class SqlServerDriver implements Driver {

	@Override
	public void commit() {

	}

	@Override
	public void rollback() {

	}

	@Override
	public void execute(String sql) {

	}

	@Override
	public String getDriverName() {
		return "SqlServer";
	}
}
