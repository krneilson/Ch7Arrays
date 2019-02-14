package Ch8Classes;

public class KimballNeilsonGroceryListClient {
    public static void main(String args[]) {

        KimballNeilsonGroceryList list = new KimballNeilsonGroceryList();
        list.addItem(new KimballNeilsonGroceryItemOrder("Ham", 1, 25.05));
        list.addItem(new KimballNeilsonGroceryItemOrder("Ribs", 2, 30.25));
        list.addItem(new KimballNeilsonGroceryItemOrder("Pork Cops", 6, 10.25));
        list.addItem(new KimballNeilsonGroceryItemOrder("Turcky", 1, 38.23));
        list.addItem(new KimballNeilsonGroceryItemOrder("Bacon", 4, 7.25));
        list.addItem(new KimballNeilsonGroceryItemOrder("Brisket", 2, 36.75));
        list.addItem(new KimballNeilsonGroceryItemOrder("Jello", 3, 1.99));
        list.addItem(new KimballNeilsonGroceryItemOrder("New York Strip", 3, 18.99));
        list.addItem(new KimballNeilsonGroceryItemOrder("Ribeye", 5, 21.99));
        list.addItem(new KimballNeilsonGroceryItemOrder("kale", 2, 2.25));
        System.out.println(list);
    }

}
