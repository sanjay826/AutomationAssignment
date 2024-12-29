package com.creatio.crm.language.basic.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_Part1 {

	public static void main(String[] args) {
		
		List<String> counteries=new ArrayList<String>();
		
		// Top Five countries 
		counteries.add("India");
		counteries.add("China");
		counteries.add("United State");
		counteries.add("Indonesia");
		
		
		// Printed 2nd most populated country 
		System.out.println("2nd largtes populated Country :" + counteries.get(1));
		System.out.println(counteries);
		
		/*Best 10 Tourist Attraction Place */
		
		Set<String> attractionPlace=new HashSet<String>();
		attractionPlace.add("TajMahal");
		attractionPlace.add("Wall of China");
		attractionPlace.add("Conark Mandir");
		attractionPlace.add("Eiffel Tower");
		attractionPlace.add("Statue of Liberty ");
		attractionPlace.add("Gatway of India");
		attractionPlace.add("Burj khalifa");
		attractionPlace.add("Goa");
		attractionPlace.add("Dubai");
		attractionPlace.add("London");
		
		//Display size for all tourist attractions
		System.out.println("The Size of all the top 10 most visited tourist attractions place :" +attractionPlace.size());
		System.out.println(attractionPlace);
		
		/*
		 * Created a map of the 5 largest cities in the United States and their
		 * populations.
		 */
		Map<String, Integer> largestCities=new HashMap<String, Integer>();
		largestCities.put("New York",8419600);
		largestCities.put("Los Angeles",3822238);
		largestCities.put("Chicaogo",2665039);
		largestCities.put("Houston",2302878);
		largestCities.put("Phoenix",1644409);
		
		
		//Printed all 5 largest cities for the United States and their populations. 
		System.out.println(largestCities);
		
		
		/*
		 * Create a list of the top 5 highest-grossing movies of all time and print out
		 * the third movie on the list.
		 */
		
		//top 5 highest-grossing movies of all time
		List<String> superhitMovie=new LinkedList<String>();
		superhitMovie.add("Pathan");
		superhitMovie.add("BaahuBali");
		superhitMovie.add("RRR");
		superhitMovie.add("Avtar");
		superhitMovie.add("Pushpa");
		
		//Printed 3rd highest-grossing movies of all time
		System.out.println("highest-grossing movies of all time"+superhitMovie.get(2));
		
		// Printed all movie list
		System.out.println(superhitMovie);
		
		
		

	}

}
