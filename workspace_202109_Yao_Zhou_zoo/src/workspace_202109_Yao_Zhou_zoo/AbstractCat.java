package workspace_202109_Yao_Zhou_zoo;


public class AbstractCat extends AbstractAnimalAPI{
	
	private final static String K_CAT_NAME = "Cat";
	private final static String K_CAT_NOISE = "Meow!";
	
	@Override
	public void speak() {
		System.out.println(K_CAT_NAME + " speak: " + K_CAT_NOISE);
	}

}
