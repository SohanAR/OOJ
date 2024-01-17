public class StringDemo {
    public static void main(String[] args) {
        // String length demonstration
        String str1 = "Hello, World!";
        int length = str1.length();
        System.out.println("String: " + str1);
        System.out.println("Length of the string: " + length);

        // String literal demonstration
        String str2 = "Java";
        String str3 = "Java"; // This uses the same string literal as str2

        // Checking if str2 and str3 reference the same string in the pool
        boolean areEqual = (str2 == str3);
        System.out.println("Are str2 and str3 equal? " + areEqual);

        // String concatenation demonstration
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);
    }
}

