package Ch8Classes;

//this program creates a grocery list using the GroceryItemOrder Class

public class KimballNeilsonGroceryList {

    public static final int Max_Items = 10;
    //state fields
    private KimballNeilsonGroceryItemOrder[] list;
    private int numItems;

    //constructors
    public KimballNeilsonGroceryList(){
        list = new KimballNeilsonGroceryItemOrder[Max_Items];
        numItems = 0;
    }

    //behaviors
    public void addItem(KimballNeilsonGroceryItemOrder item){
        list[numItems] = item;
        numItems++;
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int i = 0; i < numItems; i++){
            totalCost += list[i].getCost();
        }
        return totalCost;
    }

    public String toString(){
        String myList = "Your Grocery List:\n\n";
        for(int i = 0; i < numItems; i++){
            myList = myList + list[i];
        }
        myList += ("\nTotalCost: $" + getTotalCost());
        return myList;
    }

}