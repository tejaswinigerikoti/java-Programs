class Printer implements Runnable{
	synchronized public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" Printing started");
		for(int i=1;i<=5;i++) {
			synchronized(this) {
				System.out.println(name+ " is printing");
			}
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Some problem occured");
			}
		}
		System.out.println(name+ " Completed the printing");
	}
}
public class Lockmethod2 {
	public static void main(String[] args) {
		Printer p=new Printer();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
 
		t1.setName("Akhila");
		t2.setName("manasa");
		t3.setName("Likhitha");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
