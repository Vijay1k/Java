package TestNG.java;

public class SingletonClass {

	
	
	private static SingletonClass Ins = null;
	
	public String str;
	
	private SingletonClass() {
		str = "Printed";
		System.out.println(str);
	}
	
	public static SingletonClass getInstance() {
		if(Ins==null) 
			Ins = new SingletonClass();
		
		return Ins;
	}
	public static void main(String [] args) {
		
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		
		
		
		
	}
}


