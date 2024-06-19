
public class Inventory {
	public static final int SIZE = 5; 
	
	private Item[] items = new Item[SIZE]; 
	
	public boolean add(Item item) {
		for (int i=0; i<items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				
				return true;
			}
		}
			
			
		return false;
	}

	public Weapon fetchWeapon(String description) {
		for (int i=0; i<items.length; i++) {
			if (items[i] instanceof Weapon) {
				Weapon fetchedItem = (Weapon)items[i];
				if (description.equals(fetchedItem.getClass().getName())) {
					items[i] = null;
					return fetchedItem;
				}
			}
		}
			
		return null;		
	}
	
	public Herb fetchHerb(String description) {
		for (int i=0; i<items.length; i++) {
			if (items[i] instanceof Herb) {
				Herb fetchedItem = (Herb)items[i];
				if (description.equals(fetchedItem.getClass().getName())) {
					items[i] = null;
					return fetchedItem;
				}
			}
		}
			
		return null;		
	}
	
	@Override
	public String toString() {
		String itemList = "";
		for (Item item: items) {
			itemList += item.getName() + "\n";
		}
		
		return itemList;
	}
}
