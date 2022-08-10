package workspace_2021_9_yao_zhou_Factory1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectronicItem extends Item implements Comparable<Item>{
	
	public ElectronicItem() {
		super(2, "ElectronicItem", 1.49);
	}
	
	public ElectronicItem(int id, String name, double price) {
		super(id, name, price);	
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public ElectronicItem(String csvData) {
		String[] tokens = csvData.split(",");
		int id = Integer.parseInt(tokens[0]);
		double price = Double.parseDouble(tokens[2]);
		this.init(id, tokens[1], price);
	}
	
//	@Override
//	public int compareTo(Item object) {
//		return this.getPrice().compareTo(this.getPrice());
//	}
public static void demo() {
		
		FileUtil fileUtil = new FileUtil();
		String fileName = "ElectronicItemCSV.txt";
		List<String> ElectronicCSVData = new ArrayList<String>(
				Arrays.asList(
						"5,MacBook,1999",
						"6,IPhone 13,999",
						"7,AirPods Pro,249",
						"8,IPad Mini,499")
				);
		fileUtil.writeTextFile(fileName, ElectronicCSVData);
		List<String>readCSVData = fileUtil.readTextFile(fileName);
		readCSVData.forEach(System.out::println);
		
//		{
//			
//			List<Item> Electronicitems = new ArrayList<>();
//			for(String str : readCSVData) {
//				Electronicitems.add(new Item(str));
//			}
//			
//			System.out.println(Electronicitems.size() + " Food in cart.");
//			for(Item Electronicitem : Electronicitems) {
//				System.out.println(Electronicitem);
//			}
//		}
//		
//		{
//			
//			ElectronicItemFactory factory = new ElectronicItemFactory();
//			List<Item>Electronicitems = new ArrayList<>();
//			for(String str : readCSVData) {
//				Electronicitems.add(factory.getObject(str));
//			}
//			
//			
//			System.out.println("Sort FoodItem by ID: ");
//			Electronicitems.sort(Item.IdComparator());
//			Electronicitems.forEach(System.out::println);
//			
//			System.out.println("Sort FoodItem by Name: ");
//			Electronicitems.sort(Item.NameComparator());
//			Electronicitems.forEach(System.out::println);
//			
//			System.out.println("Sort FoodItem by Price: ");
//			Electronicitems.sort(Item.PriceComparator());
//			Electronicitems.forEach(System.out::println);
//		}

	}

}
