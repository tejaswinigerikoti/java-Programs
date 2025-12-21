/* Comparable
 * it is a predefined interface in java.lang.
 * it was introduced from jdk 1.2 version.
 * Comparable interface has a abstract method called as comparable(0
 * default sorting
  
 syntax:public int compareTo()
 {
 }
 compareTo() return :+1 if it is greater than
 					 -1 if it is lesser than
 					 0 if the object is same
 * Rules to make the object as comparable/Rules in order to work with comparable interface
  1.class has to implement comparable interface.
  2.we need to specify the generic type of which object we are going to compare
  3.Override the compareTo() by specifying  the bussiness logic of comparing or sorting
 */


import java.util.*;
import java.util.TreeSet;
class Car1 implements Comparable<Car1>{
	int cost;
	Car1(int cost){
		this.cost=cost;
	}
	public String toString() {
		return "Car[cost="+cost+"]";
	}
	public int compareTo(Car1 c) {
		return this.cost-c.cost;
	}
}
public class TreeSetExample2 {

	public static void main(String[] args) {
		Car1 c1=new Car1(300);
		Car1 c2=new Car1(200);
		
		TreeSet<Car1> ts=new TreeSet<>();
		ts.add(c1);
		ts.add(c2);
		for(Object i:ts) {
			System.out.println(i);
		}
	}

}
