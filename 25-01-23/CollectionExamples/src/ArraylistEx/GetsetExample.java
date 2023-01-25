package ArraylistEx;

import java.util.ArrayList;
//import java.util.List;

public class GetsetExample {
	public static void main(String[] args)
	{
		ArrayList<String> listex=new ArrayList<>();
		listex.add(0, "red");
		listex.add(1, "yellow");
		listex.add(2, "blue");
		listex.add(3, "pillu");
		System.out.println(listex);
		System.out.println("element at index is:" + listex.get(1));
		
		listex.set(1,"black");
		System.out.println(listex);
		
		for(String ex : listex)
		{
			System.out.println(ex);
		}
	}
}
