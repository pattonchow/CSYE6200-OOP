package workspace_2021_9_yao_zhou_Factory1;

public class ElectronicItemFactory extends AbstractItemFactory{
	
	private static ElectronicItemFactory instance;
	
	private ElectronicItemFactory() {
		
	}
	
	public static synchronized ElectronicItemFactory getInstance(){
		if(instance == null) {
			instance = new ElectronicItemFactory();
		}
		return instance;
	}
	
//	@Override
//	public Item getObject() {
//		return new ElectronicItem();
//	}
	
	@Override
	public Item getObject(int id, String name, double price) {
		return new ElectronicItem(id, name, price);
	}
	
//	public Item getObject(List<String>args) {
//		int id = Integer.parseInt(args.get(0));
//		String name = args.get(1);
//		double price = Double.parseDouble(args.get(2));
//		return new ElectronicItem(id, name, price);
//	}
	
//	public Item getObject(String csvData) {
//		return new ElectronicItem(csvData);
//	}
//	
}
