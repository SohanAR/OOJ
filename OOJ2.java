import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    double grade;  
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject[] subjects;

    Student() {
        int i;
        subjects = new Subject[9];
        for (i = 0; i < 9; i++)
            subjects[i] = new Subject();
        s = new Scanner(System.in);
    }

    void getStudentDetails() {
        System.out.println("Enter Student Name:");
        name = s.nextLine();
        System.out.println("Enter USN:");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter marks for Subject " + (i + 1) + ":");
            subjects[i].subjectMarks = s.nextInt();
            System.out.println("Enter credits for Subject " + (i + 1) + ":");
            subjects[i].credits = s.nextInt();

           
            subjects[i].grade = subjects[i].subjectMarks / 10.0 + 1.0;
        }
    }

    void computeSGPA() {
        double totalCredits = 0;
        double weightedSum = 0;

        for (int i = 0; i < 8; i++) {
            totalCredits += subjects[i].credits;
            weightedSum += subjects[i].credits * subjects[i].grade;
        }

        SGPA = weightedSum / totalCredits;
    }

    void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }
}

public class main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayResult();
    }
}
