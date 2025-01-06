package com.creatio.crm.language.basic.practice;

import java.util.HashMap;
import java.util.Map;

public class ForLoop {

	public static void main(String[] args) {
		
		String[] empNames=new String[5];
		
		empNames[0]="Amit";
		empNames[1]="Anurag";
		empNames[2]="Devi";
		empNames[3]="Bharath";
		empNames[4]="Suresh";
		
		for(int i=0;i<empNames.length;i++)
		{
			System.out.println(empNames[i]);
		}
		
		System.out.println("===For each loop===");
		for(String value : empNames) {
			System.out.println(value);
		}
		
		System.out.println("=====Hashmap For each Loop===");
		Map<Integer,String> empNameHashMap=new HashMap<Integer, String>();
		empNameHashMap.put(1,"Amit");
		empNameHashMap.put(2,"Sanjay");
		empNameHashMap.put(2,"Kumar");
		empNameHashMap.put(4,"Amit");
		empNameHashMap.put(5,"Yadav");
		empNameHashMap.put(6,null); 
		empNameHashMap.put(null,null);
		empNameHashMap.put(null,"Rekha");
		empNameHashMap.remove("Amit");
		
		for(Integer key :empNameHashMap.keySet()) {
			System.out.println(empNameHashMap.get(key));
			
		}

	}

}
