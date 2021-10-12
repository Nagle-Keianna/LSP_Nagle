package org.howard.edu.lsp.assigment4;

import java.util.*;

public class IntegerSet {
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private ArrayList<Integer> list= new ArrayList<>)();
	public Integer Set(ArrayList list) {
		this.list=list;
	}
	
	/**
	 * Clears the internal representation of the set
	 */
	
	public void clear() {
		list.clear();
	}
	
	/**
	 * Returns the length of the set
	 */
	
	public int length() {
		return list.size();
	}

	/** Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> list2=b.list;
		if(list.size()!=list2.size()) {
			return false;
		}
		
		ArrayList<Integer> temp1=list;
		ArrayList<Integer> temp2=intSetb;
		
		Collections.sort(temp1);
		Collections.sort(temp2);
		
		for(int i=0; i<temp1.size(); i++) {
			if(temp1.get(i)!=temp2.get(i)) {
				return false;
			}
		}
		return true;
	} 

	/**
	 * Returns true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {};    
	
	/**
	 * Returns the largest item in the set; Throws an IntegerSetException if the set is empty
	 */ 
	public int largest() throws IntegerSetException {
		if(list.size()==0) {
			IntegerSetException e= new IntegerSetException();
			throw e;
		}
		int max = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
		}
		return max;
	} 

	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 */
	
	public int smallest() throws IntegerSetException; {
		if(list.size()==0) {
			IntegerSetException e= new IntegerSetException();
			throw e;
		}
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)<min) {
				min=list.get(i);
			}
		}
		return min;
	}
	
	/**
	 * Adds an item to the set or does nothing if it's already there
	 */

	public void add(int item) {
		boolean exist=false;
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i)==item) {
				exist=true;
			}
		}
		if(exist==false) {
			list.add(item);
		}
	}
	
	/**
	 * Removes an item from the set or does nothing if not there
	 */

	public void remove(int item) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==item) {
				list.remove(i);
			}
		}
	}  
	/**
	 * Set union
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> temp=intSetb.getlist();
		
		Set<Integer> set = newHashSet<>();
		set.addAll(list);
		set.addAll(temp);
		
		ArrayList<Integer> list3= new ArrayList<>(set);
		IntegerSet list4= new IntegerSet(list3);
		
		return list4;
	}
	
	/**
	 * Set intersection
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp=intSetb.getlist();
		list.retainAll(temp);
		
		IntegerSet list4 = new IntegerSet(list);
		
		return list4;
	}

	/**
	 * Set difference, i.e. s1 -s2
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> temp=list2.getlist();
		
		list.removeAll(temp);
		
		IntegerSet list4= new IntegerSet(list);
		
		return list4;
	}
	
	/**
	 * Returns true if the set is empty, false otherwise
	 */
	boolean isEmpty() {
		
	}
	
	/**
	 * Return String representation of your set
	 */

	public String toString() {};


}

class IntegerSetException extends Exception {
	
}
