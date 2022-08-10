package workspace_2021_9_yao_zhou_Factory1;
import java.util.ArrayList;
import java.util.List;


public class Store extends AbstractStore{
	
	int id;
	String name;
	private List<Item>inventory;
	
	public void init(int id, String name) {
		this.id = id;
		this.name = name;
		this.inventory = new ArrayList<>();
	}
	
	public Store() {
		init(1, "Default Store");
	}
	
	public Store(int id, String name) {
		init(id, name);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addItem(Item item) {
		this.inventory.add(item);
	}
	
	@Override
	public String getInventoryInfo() {
		StringBuilder info = new StringBuilder("Inventory: ");
		info.append(this.inventory.size() + " items in inventory.\n");
		for (Item item : this.inventory) {
			info.append(item.toString() + "\n");
		}
		return info.toString();
	}
	
	public void clearInventory() {
		this.inventory.clear();
	}
	
	public void sortInventory() {
		this.inventory.sort(null);
	}
	
	public void showInventory() {
		System.out.println(this.getInventoryInfo());
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("[" + this.getId() +"] " + this.getName() + " \n");
		info.append(this.getInventoryInfo());
		return info.toString();
	}
	
	@Override
	public void show() {
		System.out.println(toString());
	}
	
	public static void demo() {
		System.out.println("\n\t" + Store.class.getName() + ".demo() starting...");
		
//		{	
//			Item soymilk = new Item(1, "Soy milk", 4.39);
//			Item pizza = new Item(4, "Pizza", 1.49);
//			Item iphone = new Item(6, "IPhone 13", 999);
//			Item ipad = new Item(8, "IPad Mini", 499);
//			Item airpods = new Item(7, "AirPods Pro", 249);
//			Item laundry = new Item(11, "Laundry", 12.49);
//			List<Item> newcarts = new ArrayList<>();
//			newcarts.add(soymilk);
//			newcarts.add(pizza);
//			newcarts.add(iphone);
//			newcarts.add(ipad);
//			newcarts.add(airpods);
//			newcarts.add(laundry);
//			
//			
//			
//			System.out.println("adding "+ newcarts.size() +" item in your cart.");
//			for(Item cart : newcarts) {
//				System.out.println(cart);
//			}
//		}
		
		{
			FoodItemFactory ffactory = new FoodItemFactory();
			AbstractItemFactory efactory = ElectronicItemFactory.getInstance();
			AbstractItemFactory sfactory = ServiceItemFactory.getInstance();
			List<Item> newcarts = new ArrayList<>();
			newcarts.add(ffactory.getObject(1, "Soy milk", 4.39));
			newcarts.add(ffactory.getObject(4, "Pizza", 1.49));
			newcarts.add(efactory.getObject(6, "IPhone 13", 999));
			newcarts.add(efactory.getObject(8, "IPad Mini", 499));
			newcarts.add(efactory.getObject(7, "AirPods Pro", 249));
			newcarts.add(sfactory.getObject(11, "Laundry", 12.49));
			newcarts.add(sfactory.getObject(9,"Housework Cleaner",44.99));
			
			System.out.println("\nadding "+ newcarts.size() +" item in your cart.");
			for(Item cart : newcarts) {
				System.out.println(cart);
			}
			
			System.out.println("\nSort your carts' item by ID: ");
			newcarts.sort(Item.IdComparator());
			newcarts.forEach(System.out::println);
			
			System.out.println("\nSort your carts' item by Name: ");
			newcarts.sort(Item.NameComparator());
			newcarts.forEach(System.out::println);
			
			System.out.println("\nSort your carts' item by Price: ");
			newcarts.sort(Item.PriceComparator());
			newcarts.forEach(System.out::println);
			
		}
	}

}
