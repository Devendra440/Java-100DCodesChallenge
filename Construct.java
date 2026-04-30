class Student {
    String name;
    int accno;
    double balance;

    // Constructor
    public Student(String name, int accno, double balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    // Copy Constructor
    public Student(Student s) {
        this.name = s.name;
        this.accno = s.accno;
        this.balance = s.balance;
    }

    // Display method
    public void display() {
        System.out.println(name + "," + accno + "," + balance);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bunty", 567567, 40000);
        s1.display();

        Student s2 = new Student(s1); // Copy constructor
        s2.display();

        // Modify s2
        s2.balance = 5000;
        s2.name = "Minti";
        s2.display();

        // s1 remains unchanged
        s1.display();
    }
}
