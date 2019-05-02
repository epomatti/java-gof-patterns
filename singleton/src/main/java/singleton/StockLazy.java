package singleton;

import lombok.Getter;
import lombok.Setter;

public class StockLazy {
	
	private static StockLazy STOCK_LAZY = null;
	
	@Getter @Setter
	private Float real;
	
	private StockLazy() {}
	
	public static synchronized StockLazy getInstance() {	
		if(STOCK_LAZY == null) {
			STOCK_LAZY = new StockLazy();
		}
		return STOCK_LAZY;
	}

}
