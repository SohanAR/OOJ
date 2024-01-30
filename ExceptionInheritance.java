import java.util.Scanner;
public class ExceptionInheritance {

    static class Father {
        int age;

        Father(int age) throws WrongAge {
            if (age < 0) {
                throw new WrongAge("Father's age cannot be negative.");
            }
            this.age = age;
        }
    }

    static class Son {
        int age;
        Father father;

        Son(int fatherAge, int sonAge) throws WrongAge {
            father = new Father(fatherAge);
            if (sonAge >= father.age) {
                throw new WrongAge("Son's age cannot be equal or greater than father's age.");
            }
            this.age = sonAge;
        }
    }

    static class WrongAge extends Exception {
        WrongAge(String message) {
            super(message);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter father's age: ");
        int fatherAge = scanner.nextInt();
        System.out.println("Enter son's age: ");
        int sonAge = scanner.nextInt();

        try {
            Son son = new Son(fatherAge, sonAge);
            System.out.println("Son's age: " + son.age);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}

