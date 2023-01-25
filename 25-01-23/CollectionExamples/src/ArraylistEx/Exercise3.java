package ArraylistEx;

//Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {
		List<String> arraylist=new ArrayList<>();
		arraylist.add("red");
		arraylist.add("orange");
		arraylist.add("green");
		arraylist.add("white");
		arraylist.add("black");
		
//		System.out.println(arraylist);
		
		arraylist.add(0, "added");
		arraylist.add(6, "lastadded");
//		System.out.println(arraylist);
		
			Collections.sort(arraylist);
			System.out.println(arraylist);
	
		
	}
	
}
