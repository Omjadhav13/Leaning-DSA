package Stack_Assignment;

import java.util.Stack;

public class Infix_to_Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix="(A+B)*(C-D)";
		
		System.out.println(Postfix(infix));
		}
	public static int precedence(char expression) {
		switch(expression) {
		case '^' :
			return 3;
		case '*':
		case '/':
			return 2;
			
		case '+':
		case '-':
			return 1;
		}
		return -1;
	}
	public static String Postfix(String infix) {
		// TODO Auto-generated method stub
		String post="";
		
		Stack<Character> sc=new Stack();
		
		for (char c : infix.toCharArray()) {
			if(c=='(' ) {
				sc.push(c);
			}
			else if( c=='+'||c=='*'||c=='/'||c=='-') {
			
				
					if( precedence(c)>precedence(sc.peek())) {
						
						sc.push(c);
						
					}
					else {
						while(sc.peek()!='('&& !sc.isEmpty()) {
							post=post+sc.pop();
						}
						sc.pop();
					}
				}
				else{
					sc.push(c);
				
			}
			
			 if(c>='A'&& c<='Z' || c>='a' && c<='z') {
				post=post+c;
			}
			else if(c==')') {
				while(sc.peek()!='(' && !sc.isEmpty()) {
					post=post+sc.pop();
				}
				sc.pop();
			}
		}
		return post;
	
		
	}
}
