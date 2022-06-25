class library{
    String[] books;
    int no_of_books;

    //constructor of the class
    library(){
        this.books = new String[100]; //array to add book
        this.no_of_books = 0; //number of books
    }

    //method to add books
    void addBook(String book){
        this.books[no_of_books] = book; //adding books in thw array at indexes
        no_of_books++;
        System.out.println(book + " has been added");
    }

    //method to show books
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books) { //showing the available present books
            if(book == null){
                continue;
            }
            System.out.println("\n#" + book);
            
        }
    }

    void issueBook(String book){
        for(int i = 0; i<this.books.length; i++) {
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
    }

    void returnBook(String book){
        addBook(book);
    }
    
}
public class Lib {
    public static void main(String[] args) {
        library centralLibrary = new library();
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.addBook("Data Structure and algorithms");
        centralLibrary.addBook("Software Engineering");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Think and grow rich");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Think and grow rich");
        centralLibrary.showAvailableBooks();

    }
}
