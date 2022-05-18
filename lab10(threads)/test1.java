//Create a thread using Runnable interface
class test implements Runnable {
    Thread t;
    int i;
    String s[] = { "Welcome","to","Faculty","Details","Modules"};

    test() {
        t = new Thread(this, "Runnable Interface Thread");
        System.out.println("Thread is:" + t);
        t.start();
    }

    public void run() {
        String name = t.getName();
        for (int i = 0; i < s.length; ++i) {
            try {
                t.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(name + ":" + s[i]);
        }
    }
}

class test1 {
    public static void main(String args[]) {
        new test();
    }
}