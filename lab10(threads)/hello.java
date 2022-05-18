//Create a thread extending thread class
class hello extends Thread 
      { 
            String s[]={"Welcome","to","Faculty","Details","Modules"}; 
            public static void main(String args[]) 
               { 
             hello t = new hello("Extending Thread Class"); 
               }  
                 public hello (String n) 
                  { 
                     super(n); 
                     start(); 
                 } 
                 public void run() 
                   { 
                       String name=getName(); 
                       for(int i=0;i<s.length;i++) 
                           { 
                          try 
                           { 
                             sleep(500); 
                           } 
                             catch(Exception e) 
                                { 
                                } 
                                 System.out.println(name+":"+s[i]); 
                           } 
                       } 
       }