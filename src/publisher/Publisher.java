package publisher;

import java.util.Scanner;

public class Publisher {

    public static void main(String[] args) {
        
        
        // Scanner to read from the user
        Scanner input = new Scanner(System.in);
        
        //ask the user to enter the library name
        System.out.print("Enter Library Name:");
        String Libraryname = input.next();
        
        //creat new object from class Library
        Library library = new Library(Libraryname);
        System.out.print("How Many Books you want to Add? ");
        
        //counter for how many books the user wants to add
        int count = input.nextInt();
        
        //while loop to enter all the books wanted        
            for (int i = 1; i <= count; i++) {
            
        
            //enter book catagory
            System.out.print("Enter Book Catagory: ");
            String catagory = input.next();
            
            //enter book name
            System.out.print("Enter Book name: ");
            String name = input.next();
            
            //enter item daily reservation price
            System.out.print("Enter item Rate: ");
            double Rate = input.nextDouble();
            
            // enter how many days the book has been reserved
            System.out.print("Enter Book yearly reserved Days: ");
            int reservedDays = input.nextInt();
            
                System.out.println("Book Number "+i+" is Added"+"\n");
            
            
          
            
            //creating new object for the target book
            BookWorth book = new BookWorth(reservedDays, catagory, name, Rate);
            
            // adding the book to the library list
            library.AddBook(book);
        
            }
        // method to print all the books in the library
        library.Libraryinfo();
        System.out.println("\n");
        // method to print books of the year total earnings more than or equals 3000
        
        library.BooksOfTheYear();
    }
    
}