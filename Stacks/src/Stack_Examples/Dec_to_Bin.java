package Stack_Examples;
import java.util.*;

public class Dec_to_Bin {
	  public static void main(String[] args) {
	        Stack<Integer> obj = new Stack<>();
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter number:");
	        int number = in.nextInt();
	        
	        //till number is not zero %2-->push stack /2-->update number contiunes
	        while(number>0) {
	        	int rem=number%2;	        
	        	obj.push(rem);
	        	number=number/2;
	        }
	        
	        //till stack not empty pop and print
	        while(!obj.empty())
	        {
	        	 System.out.print(obj.pop());
	        }

}}
