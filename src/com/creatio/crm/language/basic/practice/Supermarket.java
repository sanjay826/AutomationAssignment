package com.creatio.crm.language.basic.practice;

public class Supermarket {

    public static void main(String[] args) {
        // Define a 3D array to store categories, subcategories, and products
        String[][][] products = {
            { // Category: Groceries
                {"Cola", "Orange Juice", "Lemonade", "Green Tea", "Black Coffee"}, // Beverages
                {"Popcorn", "Trail Mix", "Beef Jerky", "Salted Nuts", "Rice Cakes"}, // Snacks
                {"Cottage Cheese", "Heavy Cream", "Ice Cream", "Parmesan Cheese", "Eggnog"}, // Dairy Products
                {"Apples", "Bananas", "Carrots", "Potatoes", "Onions"} // Produce
            }
        };

        // Subcategories for Groceries
        String[] subcategories = {"Beverages", "Snacks", "Dairy Products", "Produce"};

        // Display the data
        System.out.println("Product Catalog:");
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                System.out.println("  Subcategory: " + subcategories[j]);
                for (int k = 0; k < products[i][j].length; k++) {
                    System.out.printf("    Product ID: %d,Product Name: %s%n", (k + 1), products[i][j][k]);
                }
            }
        }
    }
}


