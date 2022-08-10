package workspace_2021_9_yao_zhou_Factory1;

public class ServiceItemFactory extends AbstractItemFactory{
	
	private static ServiceItemFactory instance = new ServiceItemFactory();
	
	private ServiceItemFactory() {
		
	}
	
	public static synchronized ServiceItemFactory getInstance(){
		return instance;
	}
	

	
	
	@Override
	public Item getObject(int id, String name, double price) {
		return new ServiceItem(id, name, price);
	}
	
//	public Item getObject(List<String>args) {
//		int id = Integer.parseInt(args.get(0));
//		String name = args.get(1);
//		double price = Double.parseDouble(args.get(2));
//		return new ServiceItem(id, name, price);
//	}

//	public Item getObject(String csvData) {
//		return new ServiceItem(csvData);
//	}
	
}
