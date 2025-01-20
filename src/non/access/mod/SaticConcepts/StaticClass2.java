package non.access.mod.SaticConcepts;

public class StaticClass2 {
	
	String name1="Sanjay";
	static String name2="Pooja";
	
	public void printName1() {
		System.out.println(name1);
	}
	public static void printName2() {
		System.out.println(name2);
	}

	public static void main(String[] args) {
		StaticClass2 obj=new StaticClass2();
		System.out.println(obj.name1);
		System.out.println(name2);

	}

}
