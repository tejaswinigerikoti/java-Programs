import java.util.*;
//A thread is used to perform parallel execution in java
/* Types of thread:Both of which can use to implement parallel processing in java depending on priority and importance of the task.
 * 1.user thread:JVM will wait for all the active user threads to complete their execution before it shutdown itself
 
 * 2.daemon thread does not get preference ,JVM will exit and close the java program even if there is daemon thread running in the backgroukndkkkkkkkkkkkkk.
 */
class Demo1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("User Thread is executing");
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Some problem occured");
		}
	}
}
class Demo2 extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Daemon Thread is executing");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Some problem occured");
			}
		}
	}
}
public class TypesofThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main() started executing");
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		d2.setDaemon(true);
		d1.start();
		d2.start();
		System.out.println("Main() stopped working");
	}
}
