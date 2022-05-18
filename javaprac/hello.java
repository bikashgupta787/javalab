class hello{
    public static void main(String[] args) {
        try{
           int data =  140/0;
        }
        catch(Exception e){
            System.out.println("cant divide");

        }
    }
}