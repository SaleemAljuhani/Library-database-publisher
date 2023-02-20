package publisher;
public interface favoriteBook {
    
    //constant String because int interface you can only put constants or empty methods(methods without body)
    public String Bookvalue= "Book of the year";
    
    public boolean isBestBook(BookWorth book);
}