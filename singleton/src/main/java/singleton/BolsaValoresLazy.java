package singleton;

import lombok.Getter;
import lombok.Setter;

public class BolsaValoresLazy {
	
	private static BolsaValoresLazy BOLSA_LAZY = null;
	
	@Getter @Setter
	private Float real;
	
	private BolsaValoresLazy() {}
	
	public static synchronized BolsaValoresLazy getInstance() {	
		if(BOLSA_LAZY == null) {
			BOLSA_LAZY = new BolsaValoresLazy();
		}
		return BOLSA_LAZY;
	}

}
