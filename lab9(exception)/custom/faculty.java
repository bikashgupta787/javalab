class faculty {
    int id, age;
    String name, dept;

    faculty() {
        id = 0;
        name = null;
        age = 0;
        dept = null;
    }

    faculty(int r, String n, int a, String s) {
        id = r;
        dept = s;
        int l, temp = 0;
        l = n.length();
        for (int i = 0; i < l; i++) {
            char ch;
            ch = n.charAt(i);
            if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z')
                temp = 1;
        }
        /* ———-Checking Name——————– */
        try {
            if (temp == 1)
                throw new NameNotValidException();
            else
                name = n;
        } catch (NameNotValidException e2) {
            System.out.println(e2);
        }
        /* ———-Checking Age——————– */
        try {
            if (a >= 30 && a <= 50)
                age = a;
            else
                throw new AgeNotInRangeException();
        } catch (AgeNotInRangeException e1) {
            System.out.println(e1);
        }
    }

    void display()
    {
        System.out.println("id name age dept");
        System.out.println("---------------------");
          System.out.println(id+" "+name+" "+age+" "+dept);
    }
}