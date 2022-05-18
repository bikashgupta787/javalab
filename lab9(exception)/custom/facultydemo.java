import java.io.*;
class facultydemo {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter id:");
        int id = Integer.parseInt(br.readLine());
        System.out.println("\nEnter name:");
        String name = br.readLine();
        System.out.println("\nEnter age:");
        int age = Integer.parseInt(br.readLine());
        System.out.println("\nEnter dept:");
        String dept = br.readLine();
        faculty f = new faculty(id,name,age,dept);
        f.display();
    }
}
