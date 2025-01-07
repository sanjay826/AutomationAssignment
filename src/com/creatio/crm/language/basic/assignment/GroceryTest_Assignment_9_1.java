package com.creatio.crm.language.basic.assignment;

import java.util.ArrayList;
import java.util.List;

class GroceryList {

	public List groceryItems;

	// Constructor to initialize the grocery list
	public GroceryList() {
		groceryItems = new ArrayList<String>();
	}
	// Created method to add an item to the list

	public void addItem(String item) {
		groceryItems.add(item);
		System.out.println(item + " has been added in the GroceryList");
	}
    
	// Created method to remove an item to the list
	public void removeItem(String item) {
		groceryItems.remove(item);
		System.out.println(item + " has been removed from the GroceryList");
	}
   
	// Created method to view all added item to the list 
	// Uses a ternary operator to check if the grocery list contains items. If it does, the items are printed; if not, 
	//'The grocery list is empty' is displayed.  
	public void viewList() {
	    System.out.println(groceryItems.isEmpty() ? "The grocery list is empty." : "Grocery list:" + groceryItems);
	}

}

public class GroceryTest_Assignment_9_1 {

	public static void main(String[] args) {

		GroceryList call = new GroceryList();
		call.addItem("Apple");
		call.addItem("Gava");
		call.removeItem("Apple");
		call.viewList();

	}

}
