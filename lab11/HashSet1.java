import java.util.HashSet;
import java.util.*;
 
public class HashSet1 {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> eduCourses = new HashSet<>();
 
        // Adding new elements to the HashSet
        eduCourses.add("Big Data");
        eduCourses.add("Node.js");
        eduCourses.add("Java");
        eduCourses.add("Python");
        eduCourses.add("Blockchain");
        eduCourses.add("JavaScript");
        eduCourses.add("Selenium");
        eduCourses.add("AWS");
        eduCourses.add("Machine Learning");
        eduCourses.add("RPA");
         
 
        // Adding duplicate elements will be ignored
        eduCourses.add("Java");
        eduCourses.add("RPA");
 
        System.out.println(eduCourses);
         
        // Check if the HashSet contains an specific element
        String myCourse = "Node.js";
        if(eduCourses.contains(myCourse)) {
            System.out.println(myCourse + " is in the courses list.");
        } else {
            System.out.println(myCourse + " is not in the courses list.");
        }
         
        // Sorting eduCourses using List 
        List<String> list = new ArrayList<String>(eduCourses); 
        Collections.sort(list); 
   
        // Printing the sorted elements of the HashSet 
        System.out.println("Printing the Courses in sorted order using List: " + list);
         
       // Removing items from HashSet using remove() 
        eduCourses.remove("Python"); 
           
        // Iterating over HashSet items 
        System.out.println("Iterating over course list after removing Python:"); 
        Iterator<String> i = eduCourses.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
         
         
        // Creating another object of HashSet 
        HashSet<String> eduNewCourses = new HashSet<String>(); 
        eduNewCourses.add("Node.js"); 
        eduNewCourses.add("Python");
        eduNewCourses.add("Machine Learning");
                     
        //Removing all the new elements from HashSet  
        eduCourses.removeAll(eduNewCourses);  
        System.out.println("After invoking removeAll() method courses left: "+ eduCourses); 
         
        //Removing elements on the basis of specified condition  
        eduCourses.removeIf(str->str.contains("Java"));    
        System.out.println("After invoking removeIf() method: "+ eduCourses);  
         
        // Removing elements from eduCourses which are specified in eduNewCourses 
        eduCourses.retainAll(eduNewCourses);
        System.out.println("HashSet after " + "retainAll() operation : " + eduNewCourses); 
         
        //Removing all the elements available in the set   
        eduCourses.clear();  
        System.out.println("After invoking clear() method: "+ eduCourses); 
        
    }
}