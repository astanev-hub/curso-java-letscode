package com.principal;

import java.util.Iterator;
import java.util.Stack;

public class Pilhas {
	public static void main(String[] args) {
		String str = "Pangeia";
		
		char[] pangeiaAux = new char[str.length()];
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
	}
}
