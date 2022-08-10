package workspace_202109_Yao_Zhou_zoo;

public class InterfaceCat implements AnimalisticAPI{
	
	private final static String K_CAT_NAME = "Cat";
	private final static String K_CAT_NOISE = "Meow! Meow!";
	
	@Override
	public void speak() {
		System.out.println(K_CAT_NAME + " speak: " + K_CAT_NOISE);
		
	}

}
