package ArraylistEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {
		List<String> s= new ArrayList<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		
		System.out.println(s);
		//update value
		s.set(1, "y");
		System.out.println(s);
		
		//remove element
		s.remove(4);
		System.out.println(s);
		
		List<String> list = Arrays.asList("abc","bgrd","bcdr");
		list.contains("d");
		System.out.println(list);
	}
}
