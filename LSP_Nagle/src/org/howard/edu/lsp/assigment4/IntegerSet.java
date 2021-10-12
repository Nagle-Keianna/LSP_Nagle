package org.howard.edu.lsp.assigment4;
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
	public IntegerSet(ArrayList list) {
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
	 * Returns true if the set contains the value, otherwise false
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
		List<Integer> temp=intSetb.getList();
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list);
		list3.addAll(temp);
	}
	
	/**
	 * Set intersection
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> temp=intSetb.getList();
		list.retainAll(temp);
	}

	/**
	 * Set difference, i.e. s1 -s2
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> temp=intSetb.getList();
		list.removeAll(temp);
	}
	
	/**
	 * Returns true if the set is empty, false otherwise
	 */
	boolean isEmpty(int value) {
		for(int i=0; i<list.size(); i++) {
			if (value == list.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Return String representation of your set
	 */

	public String toString() {
		return list.toString();
	}
	
	public List<Integer> getList() {
		return list;
	}


}

class IntegerSetException extends Exception {
	
}
