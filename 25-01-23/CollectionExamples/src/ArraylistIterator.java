import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> list = new ArrayList<String>();
	list.add("data");
	list.add("demo");
	list.add("room");
	list.add("demo");

	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) //It returns true if the iterator has more elements otherwise it returns false.
	{
		System.out.println(itr.next());//moves the cursor pointer to the next element.
	}
}
}
