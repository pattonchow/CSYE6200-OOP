package workspace_2021_9_yao_zhou_Factory1;



public class FoodItemFactory extends AbstractItemFactory{
	
	@Override
	public Item getObject(int id, String name, double price) {
		return new FoodItem(id, name, price);
	}
	
//	public FoodItem getObject(String csvData) {
//		return new FoodItem(csvData);
//	}
	
}
