package publisher;

public class BookWorth extends Book {
    private int totalReservedDays;

    //consturctor to invoke the class with an object
    public BookWorth(int totalReservedDays, String Catagory, String name, double rate) {
        super(Catagory, name, rate);
        this.totalReservedDays = totalReservedDays;
    }

    
    // toString is a method to return all the data for the object
    @Override
    public String toString() {
        return super.toString()+"\n"+ "Book Worth{" + "total Reserved Days=" + totalReservedDays + '}';
    }

    //override for the abstract method in the super class
    @Override
    public double TotalEarnings() {
       return this.totalReservedDays*this.getRate();
    }
      
}
