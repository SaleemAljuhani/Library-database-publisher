package publisher;

public abstract class Book{
    private String Catagory;
    private String name;
    private double rate;

    
    public Book(String Catagory, String name, double rate) {
        this.Catagory = Catagory;
        this.name = name;
        this.rate = rate;
    }

    
    // setter and getter 
    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String Catagory) {
        this.Catagory = Catagory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Book{" + "Catagory=" + Catagory + ", name=" + name + ", rate=" + rate + '}';
    }


    
    
    
    

    // abstract method to make sure all the sub classes use the method
    public abstract double TotalEarnings();

 
}
