package workspace_202109_Yao_Zhou_zoo;

public class InterfaceLion implements AnimalisticAPI{
	
	private final static String K_LION_NAME = "Lion";
	private final static String K_LION_NOISE = "Awal! Awal!";
	
	@Override
	public void speak() {
		System.out.println(K_LION_NAME + " speak: " + K_LION_NOISE);
	}


}
