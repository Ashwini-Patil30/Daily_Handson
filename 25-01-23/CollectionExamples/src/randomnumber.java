import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class randomnumber {

	public static void main(String[] args) {

		Random a = new Random();
		HashSet<Integer> hash = new HashSet<>();
		for (int count = 0; count <= 15; count++) {
			while (hash.size() < 16) {
				hash.add(1 + a.nextInt(30));
			}
		}
		ArrayList<Integer> c1 = new ArrayList<>();
		//System.out.println(hash);
		for(int i=0;i<=hash.size();i++) {
			if(i%2==0) {
//				System.out.println(i);
				c1.add(i);
				}
			}
		System.out.println(c1);
		
		// 2nd program of string
		String sample = "India, officially the Republic of India (Hindi: Bhārat Gaṇarājya),[25] is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world. Bounded by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the west;[f] China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east. In the Indian Ocean, India is in the vicinity of Sri Lanka and the Maldives; its Andaman and Nicobar Islands share a maritime border with Thailand, Myanmar, and Indonesia. The nation's capital city is New Delhi.";

		String[] text=sample.split(" ");
		
		for(int i=0;i<=text.length-1;i++) {
			System.out.print(text[i] + ",");
		}
		
		for(int i=0;i<=c1.size()-1;i++) {
			System.out.println(text[c1.get(i)]);
		}
	}
}
