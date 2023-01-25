import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //list accepts duplicate elements
		List<String> list= new ArrayList<String>();
		list.add("ashu");
		list.add("priyu");
		list.add("attu");
		list.add("priyu");
		
		List<String> list1 = Arrays.asList("abc","bgrd","bcdr");
		
		list.forEach(n -> System.out.print(n)); //elements will print on same line
		list1.forEach(n -> System.out.println(" "+ n)); //println will on next line element

	}

}


