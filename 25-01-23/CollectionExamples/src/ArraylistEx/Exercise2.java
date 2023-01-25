package ArraylistEx;

//Write a Java program to iterate through all elements in a array list.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args)
	{
		List<String> arraylist=new ArrayList<>();
		arraylist.add("red");
		arraylist.add("orange");
		arraylist.add("green");
		arraylist.add("white");
		arraylist.add("black");
	
		//foreach loop
//		for(String traverse : arraylist) {
//			System.out.println(traverse);
//		} 
		
		Iterator itr=arraylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
