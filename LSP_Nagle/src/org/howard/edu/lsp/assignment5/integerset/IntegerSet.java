package org.howard.edu.lsp.assignment5.integerset;

import java.util.*;

/**
 * <h1>Integer Set Class</h1>
 * Implement a class, IntegerSet, given the specification below. <p>
 * 
 * @author pbc91 @/02922214
 *@since 2021-10-08
 */

public class IntegerSet {
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> list= new ArrayList<Integer>();
	
	
	public IntegerSet() {
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

	/** 
	 * @return Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * @param the second set
	*/
	
	public boolean equals(IntegerSet b) {
		List<Integer> intSetb=b.list;
		if(list.size()!=intSetb.size()) {
			return false;
		}
		
		List<Integer> temp1=list;
		List<Integer> temp2=intSetb;
		
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
	 * @return Returns true if the set contains the value, otherwise false
	 *@param the integer value 
	 */
	public boolean contains(int value) {
		for(int i=0; i<list.size(); i++) {
			if(value == list.get(i)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return Returns the largest item in the set; Throws an IntegerSetException if the set is empty
	 */ 
	public int largest() throws IntegerSetException {
		if(list.size() > 0) {
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
	 * @return Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 */
	
	public int smallest() throws IntegerSetException {
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
	 * @param the number added to the set
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
	 * @param the number being removed from the set
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
	 * @param the sets being added together
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> temp=intSetb.getList();
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list);
		list3.addAll(temp);
	}
	
	/**
	 * Set intersection
	 * @param the sets being intersected
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> temp=intSetb.getList();
		list.retainAll(temp);
	}

	/**
	 * Set difference, i.e. s1 -s2
	 * @param the sets the difference is related to
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> temp=intSetb.getList();
		list.removeAll(temp);
	}
	
	/**
	 * @return Returns true if the set is empty, false otherwise
	 * 
	 */
	public boolean isEmpty() {
		for(int i=0; i<list.size(); i++) {
			if (i == list.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @return Return String representation of your set
	 * 
	 */

	public String toString() {
		return list.toString();
	}
	
	public List<Integer> getList() {
		return list;
	}


}

public class IntegerSetException extends Exception {
	
}
