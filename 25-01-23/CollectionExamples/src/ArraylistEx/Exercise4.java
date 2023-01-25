package ArraylistEx;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		
		System.out.println(s);
		
		System.out.println(s.get(2));
		
		
		
	}

}

//Creates a List of type string, and the list can be potentially typecast 
//into any other type of list. This is called decoupling. You are decoupling 
//your code from a specific implementation of the interface. The advantages it provides, 
//is when writing large amounts of code, you can switch between types of lists to suit your 
//preferences (speed, memory etc), as all of your code, can treat your list as just type List. 
//You can also pass a List as parameters and returns List from functions.

//or

//ArrayList<String> s = new ArrayList<String>();

//Creates an ArrayList of String types and it cannot be used as any other kind of 
//List (Vector,LinkedList etc). Therefore it is bound by the methods available to an ArrayList.