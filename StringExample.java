/*String class--->
 	* String object is immutable(not changeable).
 
 * StringBuffer class--->
 	* StringBuffer class is mutable 
 	
 *Every method is synchronized
 *jdk 1.2
 *Thread safety
 
 *performance wise not recommended to use this string buffer object
 */





import java.util.*;
public class StringExample {

	public static void main(String[] args) {
		/*String s=new String("Gerikoti");
		System.out.println(s);
		
		s.concat("Tejaswni");
		System.out.println(s);*/
		
		/*StringBuffer sb=new StringBuffer("Tejaswini");
		System.out.println(sb);
		
		sb.append(" Gerikoti");
		System.out.println(sb);*/
		StringBuilder sb=new StringBuilder("Tejaswini");
		System.out.println(sb);
		
		sb.append(" Gerikoti");
		System.out.println(sb);
	}

}
