package singletonPattern;

public class Singleton {

	private Singleton() {

	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		if(instance == null) {
			System.out.println("creating new object");
			return new Singleton();
		} 
		
		return instance;
	}
}
