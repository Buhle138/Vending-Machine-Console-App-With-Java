public class Items {

    private String name;
    private double price;
    private int quantity;


    public Items(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Items(Items source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){

        return  this.name + ": " + this.price + " (" + this.quantity + ") ";

    }
    
}
