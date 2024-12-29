package com.creatio.crm.language.basic.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionFramWork {

	public static void main(String[] args) {

		String[] empNames = new String[3];
		empNames[0] = "Amit";
		empNames[1] = "Anurag";
		empNames[2] = "Devi";
		// empNames[3]="Bharath";
		
		
		int[] empID=new int[3];
		empID[0] = 01;
		empID[1] = 02;
		empID[2] = 02;

		System.out.println("Employee Name : " + empNames[0]);
		System.out.println("Employee ID : " + empID[0]);
		
		System.out.println("Employee Name length : " + empNames.length);
		System.out.println("Employee ID length: " + empID.length);

		/*
		 * we will get the error if index size length more which mention fixed one We
		 * will get the error ArrayIndexOutOfBoundsException
		 * 
		 **/
		
		/********************************ArrayList********************************/
		/*
		 * Syntax to initialize List<DataType> variable = New ArrayList<DataType>
		 * Syntax to initialize : variable.add(value);
		 * Syntax to remove value : variable.remove(value);
		 * Syntax to access the value : variable.get(index);
		 * Syntax to get the total the value : variable.size();
		 */
		System.out.println("*********ArrayList**************");
		
		List<String> empNameArraylist=new ArrayList<String>();
		empNameArraylist.add("Amit");
		empNameArraylist.add("Sanjay");
		empNameArraylist.add("Kumar");
		empNameArraylist.add("Amit");
		empNameArraylist.add("Yadav");
		empNameArraylist.add(null);
		empNameArraylist.add("Rekha");
		empNameArraylist.remove("Amit");
		empNameArraylist.size();
		System.out.println("Total value in ArrayList are :"+empNameArraylist.size());
		System.out.println(empNameArraylist);
		
		/********************************LinkedList********************************/
		/*
		 * Syntax to initialize List<DataType> variable = New LinkedList<DataType>
		 * Syntax to initialize : variable.add(value);
		 * Syntax to remove value : variable.remove(value);
		 * Syntax to access the value : variable.get(index);
		 * Syntax to get the total the value : variable.size();
		 * Order : insertion order 
		 * Null : Allowed
		 */
		System.out.println("*********LinkedList**************");
		
		List<String> empNameLinkedList=new LinkedList<String>();
		empNameLinkedList.add("Amit");
		empNameLinkedList.add("Sanjay");
		empNameLinkedList.add("Kumar");
		empNameLinkedList.add("Amit");
		empNameLinkedList.add("Yadav");
		empNameLinkedList.add(null);
		empNameLinkedList.add("Rekha");
		empNameLinkedList.remove("Amit");
		empNameLinkedList.size();
		System.out.println("Total value in LinkedList are :"+empNameLinkedList.size());
		System.out.println(empNameLinkedList);
		

		/********************************HashSet********************************/
		/*
		 * Syntax to initialize HashSet<DataType> variable = New HashSet<DataType>
		 * Syntax to initialize : variable.add(value);
		 * Syntax to remove value : variable.remove(value);
		 * Syntax to access the value : variable.get(index);
		 * Syntax to get the total the value : variable.size();
		 * Order : Random order 
		 * Null : Allowed
		 */
		System.out.println("*********HashSet**************");
		
		Set<String> empNameHashSet=new HashSet<String>();
		empNameHashSet.add("Amit");
		empNameHashSet.add("Sanjay");
		empNameHashSet.add("Kumar");
		empNameHashSet.add("Amit");
		empNameHashSet.add("Yadav");
		empNameHashSet.add(null);
		empNameHashSet.add("Rekha");
		empNameHashSet.remove("Amit");
		empNameHashSet.size();
		System.out.println("Total value in HashSet are :"+empNameHashSet.size());
		System.out.println(empNameHashSet);
		
		/********************************LinkedHashSet********************************/
		/*
		 * Syntax to initialize LinkedHashSet<DataType> variable = New LinkedHashSet<DataType>
		 * Syntax to initialize : variable.add(value);
		 * Syntax to remove value : variable.remove(value);
		 * Syntax to NO access the value : variable.get(index);
		 * Syntax to get the total the value : variable.size();
		 * Order : Insertion order 
		 * Null : Allowed
		 */
		System.out.println("*********LinkedHashSet**************");
		
		Set<String> empNameLinkedHashSet=new LinkedHashSet<String>();
		empNameLinkedHashSet.add("Amit");
		empNameLinkedHashSet.add("Sanjay");
		empNameLinkedHashSet.add("Kumar");
		empNameLinkedHashSet.add("Amit");
		empNameLinkedHashSet.add("Yadav");
		empNameLinkedHashSet.add(null);
		empNameLinkedHashSet.add("Rekha");
		empNameLinkedHashSet.remove("Amit");
		empNameLinkedHashSet.size();
		System.out.println("Total value in LinkedHashSet are :"+empNameLinkedHashSet.size());
		System.out.println(empNameLinkedHashSet);
		
		/********************************TreeSet********************************/
		/*
		 * Syntax to initialize TreeSet<DataType> variable = New TreeSet<DataType>
		 * Syntax to initialize : variable.add(value);
		 * Syntax to remove value : variable.remove(value);
		 * Syntax to NO access the value : variable.get(index);
		 * Syntax to get the total the value : variable.size();
		 * Order : Ascending order 
		 * Null : Not allowed
		 */
		System.out.println("*********TreeSet**************");
		
		Set<String> empNameTreeSet=new TreeSet<String>();
		empNameTreeSet.add("Amit");
		empNameTreeSet.add("Sanjay");
		empNameTreeSet.add("Kumar");
		empNameTreeSet.add("Amit");
		empNameTreeSet.add("Yadav");
		/* empNameTreeSet.add(null); */
		empNameTreeSet.add("Rekha");
		empNameTreeSet.remove("Amit");
		empNameTreeSet.size();
		System.out.println("Total value in TreeSet are :"+empNameTreeSet.size());
		System.out.println(empNameTreeSet);
		
		/********************************HashMap********************************/
		/*
		 * Syntax to initialize HashMap<Key, value> variable = New HashMap<Key, value>
		 * Syntax to initialize : variable.put(key, value);
		 * Syntax to remove value : variable.remove(key);
		 * Syntax to access the value : variable.get(key);
		 * Syntax to get the total the value : variable.size();
		 * Order : Random order keys 
		 * Null : allowed keys allowed , Null value is also allowed. 
		 */
		System.out.println("*********HashMap**************");
		
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
		empNameHashMap.size();
		System.out.println("Total value in HashMap are :"+empNameHashMap.size());
		System.out.println(empNameHashMap);
		
		/********************************LinkedHashMap********************************/
		/*
		 * Syntax to initialize LinkedHashMap<Key, value> variable = New LinkedHashMap<Key, value>
		 * Syntax to initialize : variable.put(key, value);
		 * Syntax to remove value : variable.remove(key);
		 * Syntax to access the value : variable.get(key);
		 * Syntax to get the total the value : variable.size();
		 * Order : insertion order keys 
		 * Null : allowed keys allowed , Null value is also allowed. 
		 */
		System.out.println("*********HashMap**************");
		
		Map<Integer,String> empNameLinkedHashMap=new LinkedHashMap<Integer, String>();
		empNameLinkedHashMap.put(1,"Amit");
		empNameLinkedHashMap.put(2,"Sanjay");
		empNameLinkedHashMap.put(2,"Kumar");
		empNameLinkedHashMap.put(4,"Amit");
		empNameLinkedHashMap.put(5,"Yadav");
		empNameLinkedHashMap.put(6,null); 
		empNameLinkedHashMap.put(null,null);
		empNameLinkedHashMap.put(null,"Rekha");
		empNameLinkedHashMap.remove(2,"Amit");
		empNameLinkedHashMap.size();
		System.out.println("Total value in HashMap are :"+empNameLinkedHashMap.size());
		System.out.println(empNameLinkedHashMap);
		
		/********************************TreeMap********************************/
		/*
		 * Syntax to initialize TreeMap<Key, value> variable = New TreeMap<Key, value>
		 * Syntax to initialize : variable.put(key, value);
		 * Syntax to remove value : variable.remove(key);
		 * Syntax to access the value : variable.get(key);
		 * Syntax to get the total the value : variable.size();
		 * Order : Ascending order keys 
		 * Null : not allowed keys allowed , Null value is  allowed. 
		 */
		System.out.println("*********TreeMap**************");
		
		Map<Integer,String> empNameTreeMap=new TreeMap<Integer, String>();
		empNameTreeMap.put(1,"Amit");
		empNameTreeMap.put(2,"Sanjay");
		empNameTreeMap.put(2,"Kumar");
		empNameTreeMap.put(4,"Amit");
		empNameTreeMap.put(5,"Yadav");
		empNameTreeMap.put(6,null); 
		//empNameTreeMap.put(null,null);
		//empNameTreeMap.put(null,"Rekha");
		empNameTreeMap.remove(2,"Amit");
		empNameTreeMap.size();
		System.out.println("Total value in HashMap are :"+empNameTreeMap.size());
		System.out.println(empNameTreeMap);
		
		
		

	}

}
