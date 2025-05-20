package com.demo.test;

import java.util.Scanner;

import com.demo.stackQueue.MyGenericStack;

public class TestCheckParenthesis {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String  ");
		String str1=sc.next();
		
		boolean status = checkValidParenthesis(str1);
		if(status) {
			System.out.println("It is a balanced Parenthesis "+str1);
		}else {
			System.out.println("It is no a balanced Parenthesis");
		}
	}

	private static boolean checkValidParenthesis(String str1) {
		MyGenericStack<Character> st = new MyGenericStack<>();
		for(int i=0; i<str1.length();i++) {
			Character ch = str1.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
	            st.push(ch);			
			}else {
				if(st.isEmpty()) {
					return false;
				}else {
					Character ch1 = st.pop();
					switch(ch) {
					case ')' :
						if(ch1!='(') 
							return false;
						break;
					case ']':
						if(ch1!='[')
							return false;
						break;
					case '}':
						if(ch1!='{')
							return false;
						break;
						
					}
				}
				
			}
		}//end of for loop
		if(st.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
			
   }
}