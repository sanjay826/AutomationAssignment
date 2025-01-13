package access.mode1;

  public class AccessModeClass1 {
	
	 public String empName="Sanjay";
	  public void printEmpDetails() {
		
		System.out.println("815312");
		System.out.println("Jharkhand");
		
	}

	 public String getName() {
		 return empName;
	 }
	 public  void setName(String name) {
		 empName=name;
	 }
	public static void main(String[] args) {
		
		AccessModeClass1 obj=new AccessModeClass1();
		System.out.println(obj.empName);
		obj.printEmpDetails();

	}

}
