package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item{

	private List<Item> items = new ArrayList<>();
	
	@Override
	public String name() {
		return "box";
	}
	
	public void add(Item item) {
		items.add(item);
	}

}
