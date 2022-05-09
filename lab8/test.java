import java.util.Scanner;

//Multiple Inheritance
interface University {
    void univesityname();
}

interface Details {
    void info();
}

class Department implements University, Details {
    public void univesityname() {
        System.out.println("St Stephens University");
    }

    public void info() {
        System.out.println("It displays the details of faculty");
    }

}

// Extending Interface
interface faculty {
    void desg(int x);

    // static message inside interface
    static void printMessage() {
        System.out.println("Welcome to account/salary section");
    }
}

interface newfaculty extends faculty {
    void facdetails();
}

class teacher implements newfaculty {
    public void desg(int x) {
        if (x > 50) {
            System.out.println("Proffesor designation: Senior proffessor");
        } else if (x <= 50 && x >30) {
            System.out.println("Proffesor designation: Associate proffessor");
        }
        else if (x < 30) {
                System.out.println("Proffesor designation: Junior proffessor");  
        } else {
            System.out.println("Can't get exact age,please try again!");
        }
    }

    public void facdetails() {
        System.out.println("Proceed Further\n");
    }
}

// nested interface
interface hello {
    void salary(int x);

    interface payment {
        void message();
    }
}

class transaction implements hello.payment {
    Scanner sc = new Scanner(System.in);

    public void salary(int x) {
        System.out.println("Credit a bonus of Rs \n" + x);
        System.out.println("\nPress 1 to continue\n");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Do not refresh this page......\n");
        } else {
            System.exit(0);
        }

    }

    public void message() {
        System.out.println("Your payment was successful,thank you !\n");
    }

}

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department f1 = new Department();
        f1.univesityname();
        f1.info();

        System.out.println("\n--------------------------------------\n");
        faculty.printMessage();
        System.out.println("\n--------------------------------------\n");
        teacher b1 = new teacher();

        System.out.println("Enter the age of the faculty");
        int weight = sc.nextInt();
        b1.desg(weight);
        b1.facdetails();

        System.out.println("\n--------------------------------------\n");
        transaction tn = new transaction();
        tn.salary(5000);
        tn.message();

    }
}