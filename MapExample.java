/*Map:
 	* predefined interface in java.util
 	* jdk 1.2
 
 	* map is a part of collection framework which does not extends the collection framework.
 	* map is used to organize the data in terms of key and value pair.
 		1.keys can't be duplicated.
 		2.values can be duplicated.
 	
 	*One key and value together we will call it as entry.
 Implementation classes:
 	1.HashMap
 	2.linkedHashMap
 	3.treeMap
 	4.Hashtable
 	
 	Important methods used wrt map:
 	1.put()
 	2.get()
 	3.clear()
 	4.keySet()
 	
 	
 *HashMap:
 	*It is a predefined class in java.util package
 	*jdk 1.2
 	*Insertion order is not maintained
 	*underlined DS is Hash table
 	*
 */

import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Name","Tejaswini");
		hm.put("Place","Tirupati");
		System.out.println(hm);
		System.out.println("....................");
		
		System.out.println(hm.get("Name"));
		
		System.out.println("....................");
		for(Object i:hm.keySet()) {
			System.out.println(i);
		}
		

	}

}
