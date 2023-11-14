import java.util.Scanner;

public class Book {
    
    private String title;
    private String author;
    private int ISBN;
    private int nob;

    public void setBook(String title, String author, int ISBN, int nob)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.nob = nob;
    }
    // getter
    public String getTitle(String newTitle)
    {
        return this.title;
    }
    // setter
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    // getter
    public String getAuthor(String newAuthor)
    {
        return this.author;
    }
    // setter
    public void setAuthor(String newAuthor)
    {
        this.author = newAuthor;
    }
    // getter
    public int getISBN(int ISBN)
    {
        return this.ISBN;
    }
    // setter
    public void setISBN(int newISBN)
    {
        this.ISBN = newISBN;
    }
    // getter
    public int getNob(int newNob)
    {
        return this.nob;
    }
    // setter
    public void setNob(int nob)
    {
        this.nob = nob;
    }
    public int addBook(int nob)
    {
        return this.nob += 1;
    }

    public int RemoveBook(int nob)
    {
        return this.nob -= 1;
    }
    public static void main(String[] args) {
        Book newBook = new Book();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the Author: ");
        String Author = scanner.nextLine();

        System.out.print("Enter the ISBN of the book: ");
        int ISBN = scanner.nextInt();

        System.out.print("Enter the number of book: ");
        int nob = scanner.nextInt();

        newBook.setBook(title, Author, ISBN, nob);

        System.out.println("Do you want to add or remove a book?");
        System.out.println("Press 1 to add or 0 to remove: ");
        int op = scanner.nextInt(); // Convert input to an integer

        switch (op) {
            case 1: 
                newBook.addBook(nob);
                System.out.println("Book added and the number of books are: "+newBook.addBook(nob));
                break;
            case 0:
                newBook.RemoveBook(nob);
                break;
            default:
                System.out.println("Invalid input!");
        }
        scanner.close(); // Close the scanner
    }
}
