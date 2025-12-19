class Restaurant{
    synchronized void foodOrder(String orderName){
    String name=Thread.currentThread().getName();
    System.out.println("Thread"+ name +" Customer has ordered "+orderName);
    try{
    	wait();
    }
    catch(Exception e){
    	System.out.println("some problem occured");
    }
    System.out.println("Thread"+name +" Food is delivered to the customer");
    }
     synchronized void cookedOrder(String orderName){
      String name=Thread.currentThread().getName();
       System.out.println("Thread"+name+" The chef has recived the order"+ orderName);
       System.out.println("Thread"+name+" The cooking is under process");
     try{
             Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println("some problem occured");
            }
            System.out.println("Thread"+name+" Order is ready");
            notifyAll();
      }   
      
      
  synchronized void receivedOrder(String orderName){
    String name=Thread.currentThread().getName();
       System.out.println("Thread"+name+" The customer is choosing order"+ orderName);
        try{
             wait();
            }
            catch(Exception e){
                System.out.println("some problem occured");
            }
            System.out.println("Thread"+name+" Customer has received order"+ orderName);
    }
}


public class RestaurantThread {
    public static void main(String[] args) {
        Restaurant r=new Restaurant();
        String orderName="Chilli Chicken";
         new Thread("Customer"){
          public void run(){
              r.receivedOrder(orderName);
         }
      }.start();
        new Thread("waiter"){
          public void run(){
            r.foodOrder(orderName);
          }
        }.start();
        new Thread("chef"){
          public void run(){
            r.cookedOrder(orderName);
          }
        }.start();
        
    }
}