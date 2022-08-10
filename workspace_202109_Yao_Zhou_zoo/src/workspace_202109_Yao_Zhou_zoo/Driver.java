package workspace_202109_Yao_Zhou_zoo;

public class Driver {
	public static void main(String[]args) {
		
		
		AnimalAPI animal = new AnimalAPI();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Lion lion = new Lion();
		AbstractDog adog = new AbstractDog();
		AbstractCat acat = new AbstractCat();
		AbstractLion alion = new AbstractLion();
		InterfaceDog idog = new InterfaceDog();
		InterfaceCat icat = new InterfaceCat();
		InterfaceLion ilion = new InterfaceLion();
		animal.speak();
		dog.speak();
		cat.speak();
		lion.speak();
		adog.speak();
		acat.speak();
		alion.speak();
		idog.speak();
		icat.speak();
		ilion.speak();
		
		
		
	}

}
