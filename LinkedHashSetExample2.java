import java.util.*;
class Student{
	private String name;
	private String rollNo;
	private String email;
	Student(String rollNo,String name,String email){
		super();
		this.name=name;
        this.rollNo=rollNo;
        this.email=email;
    }
	public String getname(){
        return name;
    }
	public String rollNo(){
        return rollNo;
    }
    public String email(){
        return email;
    }
    public String toString(){
   return "Student[name="+name+",rollNo="+rollNo+",email="+email+"]";
    }
}
public class LinkedHashSetExample2 {

	public static void main(String[] args) {
		Student s=new Student("Akhila","01","akhila13@gmail.com");
		Student s1=new Student("Bhavya","02","bhavya@gmail.com");
		LinkedHashSet<Student> lhs=new LinkedHashSet<>();
		lhs.add(s);
		lhs.add(s1);
		for(Object i:lhs) {
			System.out.println(i);
		}

	}

}
