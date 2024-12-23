package com.creatio.crm.language.basic.practice;

public class ArrayDemo {

	public static void main(String[] args) {
          
		/*
		 *  in case of primitive type
		 *  Declaration instantiate and initialization of the values. */

		int[] arr1 = { 10, 20, 30 };
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("==========Line Break=====================");
		/* Declaration instantiate and initialization size of the array */
        int[] arr2=new int[3];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;
        arr2[0]=40;
        for(int j=0;j<arr2.length;j++) {
        	System.out.println(arr2[j]);
        }
        
		/* in case of non-primitive type of data 
		 * Object Type 
		 * 
		 */
        
        Object[] arr3=new Object[3];
        
        arr3[0]=(10);
        arr3[1]=('D');
        arr3[2]= (20.12);
        
        for(int i=0;i<arr3.length;i++) {
        	
        	System.out.println(arr3[i]);
        	
        }
	}

}
