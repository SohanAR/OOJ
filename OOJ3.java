import java.util.Scanner;

class Books {
    String name, author;
    int price, numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book name s: " + this.name + "\n";
        author = "Author name : " + this.author + "\n";
        price = "Price : " + this.price + "\n";
        numPages = "Number of pages : " + this.numPages + "\n";
        return name + author + price + numPages;
    }
}

class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String name, author;
        int price, numPages;
        System.out.println("Enter the number of books:");
        n = sc.nextInt();
        Books b[] = new Books[n];
    
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name,author,price and number of pages:");
            name = sc.next();
            author = sc.next();
            price = sc.nextInt();
            numPages = sc.nextInt();
            b[i] = new Books(name, author, price, numPages);
        }
        System.out.println("Book details:");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }
    }
}