import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class traversing {
    
    public static void main(String[] args) {
        System.out.println("Starting Traversing");

         ArrayList<String> book= new ArrayList<String>();
         book.add("spring");
         book.add("springBoot");
         book.add("Hibernate");
         book.add("JDBC");
         System.out.println(book);

         //for-each loop:

         for(String str:book){
            System.out.println(str);
         }

         System.out.println("-----------------------------------------");

         //Iterator 
         Iterator<String> iterator = book.iterator();
         while(iterator.hasNext()){
           String next = iterator.next();

           System.out.println(next);
         }

         System.out.println("-----------------------------------------");

         // ListIterator
        ListIterator<String> itr= book.listIterator(book.size());
        while (itr.hasPrevious()) {
            String previous = itr.previous();
            System.out.println(previous);

        }

        System.out.println("==============================");


        //For each method

        book.forEach(e->{
            System.out.println(e);
        });
    }
}
