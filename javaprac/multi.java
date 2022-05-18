 //threads
 class multi extends Thread{  
    public void run(){  
    for(int i=1;i<5;i++)
    {
        try {
            Thread.sleep(500);
        } 
        catch ( Exception e) {
            System.out.println(e);}
            System.out.println(i);

    }
}


    public static void main(String[] args) {
        multi m1 = new multi();
        multi m2 = new multi();

        m1.start();
        m2.run();

    }
    }  
