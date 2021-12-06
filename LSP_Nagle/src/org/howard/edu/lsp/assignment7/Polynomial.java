package org.howard.edu.lsp.assignment7;

import java.io.*;
import java.util.Scanner;

/**
 * <h1>Polynomial Java Class</h1>
 * A class implementation that represents terms in algebraic expressions <p>
 * 
 * @author pbc91 @/02922214
 *@since 2021-12-01]
 *
 */

class Polynomial {
	public static Node addPolynomials(Node headnum1, Node headnum2)
	{
		Node a = headnum1, b = headnum2, newHead = new Node(0, 0),c = newHead;
		while (a!= null || b!= null)
		{
			if (a == null) 
			{
				c.next = b;
				break; 
			}
			else if (b == null) 
			{
				c.next = a;
				break;	
			}
			else if (a.power == b.power) 
			{
				c.next = new Node(a.coefficient + b.coefficient, a.power);
				a = a.next;
				b = b.next;
			}
			else if (a.power > b.power) 
			{
				c.next = new Node(a.coefficient, a.power);
				a = a.next; 
			}
			else if (a.power < b.power) 
			{
				c.next = new Node(b.coefficient, b.power);
				b = b.next; 
			}
			c = c.next;
		}
		return newHead.next;
	}
}

/**
 * <h1>Polynomial Node Class</h1>
 * Implementation of Node class
 *
 */

class Node {
	int coefficient;
	int power;
	Node next;
	Node(int a, int b) 
	{
		coefficient = a;
		power = b;
		next = null; 
	}
}


/**
 * <h1>Polynomial Node Class</h1>
 * Implementation of LinkedList class
 *
 */

class LinkedList {
	public static void main(String args[])
	{
		Node start1 = null, current1 = null, start2 = null,
			current2 = null;
		int[] polynom1_coefficient = { 5, 9, 6 };
		int[] polynom1_power = { 6, 5, 4 };
		int size = polynom1_coefficient.length;
		int i = 0;
		while (size-- > 0) {
			int a = polynom1_coefficient[i];
			int b = polynom1_power[i];
			Node ptr1 = new Node(a, b);
			if (start1 == null) {
				start1 = ptr1;
				current1 = ptr1;
			}
			else
			{
				current1.next = ptr1;
				current1 = ptr1;
			}
			i++;
		}
		int[] polynom2_coefficient = { 4, 3, 8 };
		int[] polynom2_power = { 2, 1, 0 };
		size = polynom2_coefficient.length;
		i = 0;
		while (size-- > 0) {
			int a = polynom2_coefficient[i];
			int b = polynom2_power[i];
			Node ptr2 = new Node(a, b);
			if (start2 == null) {
				start2 = ptr2;
				current2 = ptr2;
			}
			else
			{
				current2.next = ptr2;
				current2 = ptr2;
			}
			i++;
		}
		Polynomial obj = new Polynomial();
		Node sum = Polynomial.addPolynomials(start1, start2);
		Node answer = sum;
		while (answer != null)
		{
			System.out.print(answer.coefficient + "a^" + answer.power);
			if (answer.next != null)
				System.out.print(" + ");
				answer = answer.next;
			}
			System.out.println();
		}
	}
