import java.util.*;
import java.util.ArrayDeque;
public class ArrayQueueExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> d=new ArrayDeque<Integer>();
		d.add(10);
		d.add(20);
		d.add(23);
		System.out.println(d);
		System.out.println(".....................");
		
		System.out.println(d.poll());
		
		System.out.println(".....................");
		for(Object i:d) {
			System.out.println(i);
		}
		System.out.println(".....................");
		
		System.out.println(d.remove(23));
		
		System.out.println(".....................");
		
		System.out.println(d);

	}

}
