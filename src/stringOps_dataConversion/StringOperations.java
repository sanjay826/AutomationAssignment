package stringOps_dataConversion;

public class StringOperations {

	public static void main(String[] args) {
		String value = " Username : Admin | Password : admin123 ";

		// get total chars available with in the string
		System.out.println("Total Chars :" +value.length());
		
		System.out.println("5th char of String is  :" +value.charAt(4));
		
		// print  get reverse String value
		
		String reverseValue=" ";
       for(int i=value.length()-1;i>=0;i--) {
    	   
    	   reverseValue=reverseValue+value.charAt(i);
    	   
       }
       System.out.println(reverseValue);
       
       //Remove unwanted spaces from the String ==>String.trim();
       System.out.println(value);
       System.out.println(value.trim());
       
       //Remove all space from the String 
       
       System.out.println(value.replace(" ", ""));
       
       //Remove all alphabet from the String :String.replaceAll("[a-zA-Z]","")
       
       System.out.println(value.replaceAll("[a-zA-Z]", ""));
       
     //Remove Number from the String :String.replaceAll("[0-9]","")
       
       System.out.println(value.replaceAll("[0-9]", ""));
       
     //Remove special char from the String :String.replaceAll("[^0-9a-zA-Z]", "")
       
       System.out.println(value.replaceAll("[^0-9a-zA-Z]", ""));
       
       //Update case of the chars in string :  value.toUpperCase())| value.toLowerCase()
       System.out.println(value.toUpperCase());
       System.out.println(value.toLowerCase());
       
       // Extract part of text  from the String==> String,subString(StartIndex, endIndex+1)
       System.out.println(value.substring(12 ,18));
       System.out.println(value.substring(30));
       
    // Extract part of text  from Dynamic String ==> String split(regExp);
       String[] splittedValue=value.split(" ");
       
       System.out.println(splittedValue[3]);
       System.out.println(splittedValue[7]);
       
       //Compare the string 
       // 1. equals : Every char along with case should match 
       // 2. equalIgnoreCase : Every char should match by ignoring case of chars 
       //3. Contains : String contains other value with same case 
      // 4. StartWith : String start with 
      // 5. endsWith : String ends with 
       
       String value1 = "Sanjay";
       String value2 = "sanjay";
       String value3 = "Sanjay";
       String value4 = "anjay";
       String value5 = "Anjay";
       
       System.out.println(value1.equals(value2));
       System.out.println(value1.equals(value3));
       System.out.println(value1.equalsIgnoreCase(value2));
       System.out.println(value1.contains(value4));
       System.out.println(value1.startsWith("Sanj"));
       System.out.println(value1.endsWith("jay"));
       
       
       

	}

}
