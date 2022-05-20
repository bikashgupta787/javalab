import java.util.Iterator; 
import java.util.TreeSet;
import java.util.ArrayList;
   
public class Main { 
    public static void main(String[] args) { 
        //create a TreeSet of numbers
        TreeSet<Integer> numSet = new TreeSet<Integer>(); 
        //add () method
        numSet.add(30); 
        numSet.add(10); 
        //declare and initialize an ArrayList
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(15);
        myList.add(25);
        myList.add(35);
        //addAll () method : add ArrayList elements to TreeSet
        numSet.addAll(myList);
        //define an iterator on TreeSet
        Iterator<Integer> iterator = numSet.iterator(); 
        System.out.print("Tree set contents: "); 
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
        System.out.println(); 
        //ceiling () 
        System.out.println("ceiling(25):" + numSet.ceiling(25));
        //floor ()
        System.out.println("floor(25):" + numSet.floor(25));
        //contains ()
        System.out.println("TreeSet contains(15):" + numSet.contains(15));
   
        // isEmpty () 
        if (numSet.isEmpty()) 
            System.out.print("Tree Set is empty."); 
        else
            System.out.println("Tree Set size: " + numSet.size()); 
   
         
       // first ()  
        System.out.println("TreeSet First element: " + numSet.first()); 
   
        // last ()
        System.out.println("TreeSet Last element: " + numSet.last()); 
   
        // remove () 
        if (numSet.remove(30)) 
            System.out.println("Element 30 removed from TreeSet"); 
        else
            System.out.println("Element 30 doesn't exist!"); 
   
        System.out.print("TreeSet after remove (): "); 
        iterator = numSet.iterator(); 
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
        System.out.println(); 
        //size ()
        System.out.println("TreeSet size after remove (): " + numSet.size()); 
        //Headset ()
        System.out.println("Headset : " + numSet.headSet(35));
        // clear () 
        numSet.clear(); 
        System.out.println("Tree Set size after clear (): " + numSet.size());
    } 
}