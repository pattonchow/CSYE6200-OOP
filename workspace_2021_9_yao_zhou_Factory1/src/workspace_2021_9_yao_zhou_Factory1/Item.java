package workspace_2021_9_yao_zhou_Factory1;

import java.util.Comparator;

public class Item implements Comparable<Item>{
	
	public int id;
	public String name;
	public double price;
	
	public Item() {
		init(1, "item", 1.0);
	}
	
	public Item(int id, String name, double price) {
		init(id, name, price);
	}
	
	public void init(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Item(String csvData) {
		String[] tokens = csvData.split(",");
		int id = Integer.parseInt(tokens[0]);
		double price = Double.parseDouble(tokens[2]);
		this.init(id, tokens[1], price);
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(id).append("]")
		.append(" $").append(price)
		.append(" ").append(name);
		
		return sb.toString();
	}
	
	@Override
	public int compareTo(Item object) {
		return this.getName().compareTo(object.getName());
	}
	
	public static Comparator<Item>IdComparator(){
		return new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return Integer.compare(o1.getId(), o2.getId());
			}
		};
	}
	
	public static Comparator<Item>PriceComparator(){
		return new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		};
	}
	
	public static Comparator<Item>NameComparator(){
		return new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
	}

}
