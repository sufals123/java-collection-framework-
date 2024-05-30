import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class collection {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        System.out.println("Collection Framework");

        // Type safe := same type of elements as java.util.

         ArrayList<String> book= new ArrayList<String>();
         book.add("spring");
         book.add("springBoot");
         book.add("Hibernate");
         book.add("JDBC");
         System.out.println(book);

         book.remove("JDBC");
         System.out.println(book);

         book.remove(0);
         System.out.println(book);
         System.out.println(book.size());
         System.out.println(book.contains("springBoot"));
       
         book.set(1,"JavaX");
         System.out.println(book);
        
         book.add(1,"Herbername");
         System.out.println(book);

        // Un Type safe diffrent elements add java.util.

        LinkedList list = new LinkedList();
        list.add("javax");
        list.add(123);
        list.add(123.76);
        list.add(true);
        System.out.println(list);

        // Vector of java.util.

        Vector v = new Vector<>();
        v.addAll(book);
        System.out.println(v);

        //HashSet of java.util.

        HashSet<Double> hSet = new HashSet<Double>();
        hSet.add(12.12);
        hSet.add(12.13);
        hSet.add(34.87);
        hSet.add(4.44);
        hSet.add(4.44);
        hSet.add(4.44);
        
        System.out.println(hSet);
        
        // TreeSet of java.util.

        TreeSet<Double> tSet = new TreeSet<Double>();
        tSet.addAll(hSet);
        System.out.println(tSet);


    }
}
