package Ch8Classes;

//this program creates a item for the simulates Grocery List for grocery List Project
//GroceryItemOrder will have Name, Quantity, and Price Per Unit

public class KimballNeilsonGroceryItemOrder {

    //states fields
    private final String name;
    private int quantity;
    //ppu stands for price per unit
    private final double ppu;

    //constructor
    public KimballNeilsonGroceryItemOrder(String name, int quantity, double ppu){
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    //behaviors
    public double getCost(){
        return(quantity * ppu);
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //to String method
    public String toString(){
        return(quantity + "\t" + name + "\t$" + ppu + "\n");
    }
}
