package publisher;

import java.util.ArrayList;

public class Library implements favoriteBook{
    private String LibraryName;
    
    // array for all the books in the library
    private ArrayList<BookWorth> allBooks = new ArrayList<>();

    
    
    public Library(String LibraryName) {
        this.LibraryName = LibraryName;
    }

  
    
    // method to add books to the library
    public void AddBook(BookWorth book){
        this.allBooks.add(book);
    }
    
    
 
    
    
    // the method for printing books of the year
    public void BooksOfTheYear(){
        System.out.println("******************************************************************************\n" +
"********************** Books of the Year **********************\n" +
"******************************************************************************");
        for (int i = 0; i < allBooks.size(); i++) {
            if(isBestBook(allBooks.get(i))){
                System.out.println(allBooks.get(i).toString());
                System.out.println("total earnings from the book = "+allBooks.get(i).TotalEarnings());
                System.out.println(favoriteBook.Bookvalue);
                
            }
        }
        
    }
    
    
    //method to print all the books in the library 
    public void Libraryinfo(){
        System.out.println("Library Name: "+this.LibraryName);
        System.out.println("******************************************************************************\n" +
"**********************All Library Books**********************\n" +
"******************************************************************************");
        for (int i = 0; i < allBooks.size() ; i++) {
            System.out.println(allBooks.get(i).toString());
            System.out.println("******************************************************************************");
        }
    }

    
    // the method to till if the book earnings are morew than or equal to 3000
    @Override
    public boolean isBestBook(BookWorth book) {
       if(book.TotalEarnings()>=3000){
           return true;
       }
       else {
           return false;
       }
    }

  
    
}