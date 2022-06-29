import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean value = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (value) {
                System.out.println("---Welcome to Anug's Library System---");
                System.out.println("Would you like to ADD a Book(1)?");
                System.out.println("Look up an Existing Book(2)?");
                System.out.println("Search for if a given Genre exists in the Library(3)?");

                String userInput = scanner.nextLine();
                if (userInput.equals("1")) {
                    getBookInput(scanner);

                } else if (userInput.equals("2")) {
                    lookUpBook(scanner);

                } else if (userInput.equals("3")) {
                    checkGenre(scanner);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getBookInput(Scanner scanner) {

        String title = "";
        String genre = "";
        Integer numberOfPages = 0;
        System.out.println("Add a Book");

        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter the Genre: ");
        genre = scanner.nextLine();

        System.out.print("Please enter the number of pages: ");
        numberOfPages = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(title, genre, numberOfPages);
        Library.addBook(genre, title, book);

    }

    public static void lookUpBook(Scanner scanner) {

        String title = "";
        System.out.print("Enter the title of the book you are looking for: ");
        title = scanner.nextLine();

        Book book = Library.showLibraryCollection().get(title);

        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Sorry that book is not in our library");
        }

        // if (scanner.hasNextLine()) {
        //     scanner.nextLine();
        // }
    }

    public static void checkGenre(Scanner scanner) {

        System.out.print("Enter the Genre you are looking for: ");
        String genre = scanner.nextLine();

        System.out.println(Library.setOfGenres.contains(genre) ? "That genre exists in the Library"
                : "Sorry that genre does not exist in the Library");
    }

}
