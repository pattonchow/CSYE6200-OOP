package workspace_202109_Yao_Zhou_zoo;


public class AbstractDog extends AbstractAnimalAPI{
	
	private final static String K_DOG_NAME = "Dog";
	private final static String K_DOG_NOISE = "Wroof!";
	
	@Override
	public void speak() {
		System.out.println(K_DOG_NAME + " speak: " + K_DOG_NOISE);
	}

}
