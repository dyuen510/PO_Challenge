package com.revature;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LINKEDLIST CHALLENGE
		
		//Given two singly linked lists that intersect at some point, find the intersecting node. 
		//Assume the lists are non-cyclical. 
		
//		For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10 return the node with value 8.
//		In this example , assume nodes with the same value are the exact same node Objects.class 
//		Do this in 0( m+n ) time ( where m and n are the lengths of the lists ) and constant space.
		LinkedList<Integer> num1 = new LinkedList<Integer>();
		LinkedList<Integer> num2 = new LinkedList<Integer>();
		
		//populate num1 LinkedList
		num1.add(3);
		num1.add(7);
		num1.add(8);
		num1.add(10);
		
		//populate num2 LinkedList
		num2.add(99);
		num2.add(1);
		num2.add(8);
		num2.add(10);
		
		Challenge1 nf = new Challenge1();
		nf.NodeFinder(num1, num2);
		
		//STACK CHALLENGE
		//Implement a stack that has the following methods:
		//push(val): push val on to the stack
		// pop: pop off and return the topmost element off the stack. If there are no elements in stack throw error
		// max: return the maximum value in the stack currently. If there are no elements in stack, throw error
		// each method should run in constant time
		Stack<Integer> stacks = new Stack<>();
		nf.stackPush(stacks, 10);
		
		nf.stackPop(stacks);
		
		nf.maxStack(stacks);
		
	}
	
	//linkedlist
	public void NodeFinder(LinkedList<Integer> num1, LinkedList<Integer> num2) {
//		System.out.println(num1);
//		System.out.println(num2);
		
		//iterate over linkedlist
		for(int i = 0; i < num1.size(); i++) {
			if(num2.contains(num1.get(i))) {
				System.out.println("Intersecting node: " + num1.get(i));
				break;
			}
		}
	}
	
	
	//stack
	public void stackPush(Stack<Integer> stacks, int num) {
		
		for(int i = 1; i<=num; i++) {
			stacks.push(i);
		}
		System.out.println("Current Stack after push: " + stacks);
	}
	
	public void stackPop(Stack<Integer> stacks) {
//		System.out.println(stacks);
//		System.out.println(stacks.get(0));
		if(stacks.size() == 0 ) {
			System.out.println("Stack is empty");
		}else {
			int pop_value = stacks.get(0);
			stacks.remove(0);
			System.out.println("the returned popped value is : " + pop_value);
			System.out.println("the new stack is " + stacks);
		}
	}
	
	public void maxStack(Stack<Integer> stacks) {
		if(stacks.size() == 0 ) {
			System.out.println("Stack is empty");
		}else {
			int max_value = stacks.get(stacks.size() - 1);
			System.out.println("the max value of the stack is: " + max_value);
		}
	}

}
