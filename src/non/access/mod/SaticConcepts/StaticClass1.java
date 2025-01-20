package non.access.mod.SaticConcepts;

public class StaticClass1 {

	public static void main(String[] args) {
		
		StaticClass2 obj=new StaticClass2();
		System.out.println(obj.name1);
		obj.printName1();
		System.out.println(StaticClass2.name2);
		StaticClass2.printName2();
		

	}

}
