public class Student {
    String surename;
    String firstname;
    String middleInitial;
    String dateOfbirth;
    int studentnumber;
    String studentEmailAdress;
    Boolean iAmAwsome;

    // Character method
    public void sayMyStudentNumber() {
        System.out.println("Student number: " + studentnumber + "\n");
        System.out.println("Student Email Adress: " + studentEmailAdress + "\n");
        System.out.println("Am i Awsome? " + iAmAwsome + "\n");
    }

    // Constructor
    public Student(String srname, String frstname, String mddleintl, String dteofbrth, int stdntno, String stdntemadd, boolean asome) {
        surename = srname;
        firstname = frstname;
        middleInitial = mddleintl;
        dateOfbirth = dteofbrth;
        studentnumber = stdntno;
        studentEmailAdress = stdntemadd;
        iAmAwsome = asome;
    }
}
