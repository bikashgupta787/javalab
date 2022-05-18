public class hello2 {
    public static void main(String[] args) {
        
    try {
        int data = 100/0;
    } catch (Exception e) {
        System.out.println("Arithmetic exception");
    }

    try {
        int arr[] = {1,2,3,4};
        System.out.println(arr[10]);
    } catch (Exception f) 
    {
        System.out.println("array exception");
        //TODO: handle exception
    }
    System.out.println("rest");
    }
}


