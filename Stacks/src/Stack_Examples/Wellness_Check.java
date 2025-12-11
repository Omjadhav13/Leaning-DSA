package Stack_Examples;
import java.util.*;
public class Wellness_Check {
	static boolean Check_Wellness(String Pattern,Stack obj)
    {
        //read char by char
        // if { push to stack
        //if } pop if not empty else return false
		for(int i=0;i<Pattern.length();i++) {
			if ( Pattern.charAt(i) =='{') {
				obj.push(i);
			}
			else if (Pattern.charAt(i)=='}') {
				if(obj.isEmpty()) {
					return false;
				}
				else {
					obj.pop();
				}
			}
			
		}
		return obj.empty();
    }
    public static void main(String[] args) {
//        Stack<Character> obj = new Stack<>();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Pattern:");
//        String Pattern = in.next();
//        boolean result=Check_Wellness(Pattern,obj);
//        System.out.print("\nPattern:"+Pattern+" is:"+result);
    	System.out.println(1+2*3);

    }

}
