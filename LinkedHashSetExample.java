import java.util.*;
/* LinkedHashSet:
 * It is a pre defined class in java.util
 * maintain the insertion order
 * released in jdk 1.4 version
 */

public class LinkedHashSetExample  {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		
		System.out.println(lhs);
		for(Object i:lhs) {
			System.out.println(i);
		}

	}

}
