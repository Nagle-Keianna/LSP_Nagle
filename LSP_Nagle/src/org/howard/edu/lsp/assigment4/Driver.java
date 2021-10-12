package org.howard.edu.lsp.assigment4;

import java.util.*;

public class Driver {
	public static void main(String[] args) throws IntegerSetException {
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> intSetb= new ArrayList<>();
		
		IntegerSet set1= new IntegerSet(list1);
		IntegerSet set2=  new IntegerSet(intSetb);
		
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(3);
		set1.add(8);
		set1.add(7);
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		System.out.println("Set 1's list is: "+set1.getList());
		System.out.println("Set 2's list is: "+set2.getList());
		
		System.out.println();
		
		System.out.println("The statement that the lists are equal is: "+set1.equals(set2));
		
		System.out.println();
		  
		System.out.println("The largest element in Set1 is: "+ set1.largest());
		System.out.println("The smallest element in Set1 is: "+ set1.smallest());
		
		System.out.println();
		
		System.out.println("Largest element in Set2 is: "+ set2.largest());
		System.out.println("Smallest element in Set2 is: "+ set2.smallest());
		
		
	}

}
