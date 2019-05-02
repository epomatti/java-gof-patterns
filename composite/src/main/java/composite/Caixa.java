package composite;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements Item{

	private List<Item> itens = new ArrayList<>();
	
	@Override
	public String nome() {
		return "caixa";
	}
	
	public void add(Item item) {
		itens.add(item);
	}
	
	// Assemble

}
