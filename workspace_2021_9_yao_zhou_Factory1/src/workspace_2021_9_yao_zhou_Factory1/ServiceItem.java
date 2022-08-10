package workspace_2021_9_yao_zhou_Factory1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceItem extends Item implements Comparable<Item>{
	
	public ServiceItem() {
		super(2, "ServiceItem", 1.49);
	}
	
	public ServiceItem(int id, String name, double price) {
		super(id, name, price);	
	}
	
	public ServiceItem(String csvData) {
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
		String fileName = "ServiceItemCSV.txt";
		List<String> ServiceCSVData = new ArrayList<String>(
				Arrays.asList(
						"9,Housework Cleaner,44.99",
						"10,Air-condition Installation,39.99",
						"11,Laundry,12.49",
						"12,Plumbing,99.99")
				);
		fileUtil.writeTextFile(fileName, ServiceCSVData);
		List<String>readCSVData = fileUtil.readTextFile(fileName);
		readCSVData.forEach(System.out::println);
		
//		{
//			
//			List<Item> Serviceitems = new ArrayList<>();
//			for(String str : readCSVData) {
//				Serviceitems.add(new Item(str));
//			}
//			
//			System.out.println(Serviceitems.size() + " Service in cart.");
//			for(Item Serviceitem : Serviceitems) {
//				System.out.println(Serviceitem);
//			}
//		}
//		
//		{
//			
//			ServiceItemFactory factory = new ServiceItemFactory();
//			List<Item>Serviceitems = new ArrayList<>();
//			for(String str : readCSVData) {
//				Serviceitems.add(factory.getObject(str));
//			}
//			
//			
//			System.out.println("Sort ServiceItem by ID: ");
//			Serviceitems.sort(Item.IdComparator());
//			Serviceitems.forEach(System.out::println);
//			
//			System.out.println("Sort ServiceItem by Name: ");
//			Serviceitems.sort(Item.NameComparator());
//			Serviceitems.forEach(System.out::println);
//			
//			System.out.println("Sort ServiceItem by Price: ");
//			Serviceitems.sort(Item.PriceComparator());
//			Serviceitems.forEach(System.out::println);
//		}

	}

}
