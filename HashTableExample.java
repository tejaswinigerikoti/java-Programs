import java.util.Hashtable;
public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String,Object> ht=new Hashtable<String,Object>();
        ht.put("Name","Akhii");
        ht.put("Age",20);
        ht.put("Email","akhi13@gmail.com");

        System.out.println(ht);
    }
}