import java.util.LinkedList;
import java.util.*;
class Employee{
    private String empname;
    private String empdesignation;
    private String empemail;
    Employee(String empname,String empdesignation,String empemail){
    	super();
    	this.empname=empname;
    	this.empdesignation=empdesignation;
    	this.empemail=empemail;
    }
    public String getempname(){
    	return empname;
    }
    public String getempdesignation(){
    	return empdesignation;
    }
    public String getempemail(){
    	return empemail;
    }
    public String toString(){
    	return "Employee empname = "+empname +" empdesigntaion = "+empdesignation +" empemail = "+empemail;
    }
}
public class LinkedListExample2 {
    public static void main(String[] args) {
        
	    Employee e1=new Employee("Akhila", "Student", "akhi@13");
	    Employee e2=new Employee("Rupasri", "Doctor", "sree@08");
	    Employee e3=new Employee("Shannu", "Scientist", "shannu1006");
	    LinkedList<Employee> ll=new LinkedList<>();
	    ll.add(e1);
	    ll.add(e2);
	    ll.add(e3);
	    for(Object i:ll){
	    	System.out.println(i);
	    }
    }
}

    

