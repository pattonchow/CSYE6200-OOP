package workspace_2021_9_yao_zhou_Factory1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodItem extends Item implements Comparable<Item>{
	
	public FoodItem() {
		super(2, "FoodItem", 1.49);
	}
	
	public FoodItem(int id, String name, double price) {
		super(id, name, price);
	}
	

	
	public FoodItem(String csvData) {
		String[] tokens = csvData.split(",");
		int id = Integer.parseInt(tokens[0]);
		double price = Double.parseDouble(tokens[2]);
		this.init(id, tokens[1], price);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public static void demo() {
		
		FileUtil fileUtil = new FileUtil();
		String fileName = "FoodItemCSV.txt";
		List<String> FoodCSVData = new ArrayList<String>(
				Arrays.asList(
						"1,Soy Milk,4.39",
						"2,Orgnic Corn,1.99",
						"3,White Bread,2.35",
						"4,Pizza,1.49")
				);
		fileUtil.writeTextFile(fileName, FoodCSVData);
		List<String>readCSVData = fileUtil.readTextFile(fileName);
		readCSVData.forEach(System.out::println);
		
//		{
//			
//			List<Item> fooditems = new ArrayList<>();
//			for(String str : readCSVData) {
//				fooditems.add(new Item(str));
//			}
//			
//			System.out.println(fooditems.size() + " Food in cart.");
//			for(Item fooditem : fooditems) {
//				System.out.println(fooditem);
//			}
//		}
//		
//		{
//			
//			FoodItemFactory factory = new FoodItemFactory();
//			List<Item>fooditems = new ArrayList<>();
//			for(String str : readCSVData) {
//				fooditems.add(factory.getObject(str));
//			}
//			
//			
//			System.out.println("Sort FoodItem by ID: ");
//			fooditems.sort(Item.IdComparator());
//			fooditems.forEach(System.out::println);
//			
//			System.out.println("Sort FoodItem by Name: ");
//			fooditems.sort(Item.NameComparator());
//			fooditems.forEach(System.out::println);
//			
//			System.out.println("Sort FoodItem by Price: ");
//			fooditems.sort(Item.PriceComparator());
//			fooditems.forEach(System.out::println);
//		}

	}
	
	
	

}
