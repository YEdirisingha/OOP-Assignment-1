import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Burger{
    private String name;
    private double price;

    public Burger(String name,double price){
        this.name=name;
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name+" Rs. "+price;
    }
}
class BillGenerate{
    private List<Burger> order;

    public BillGenerate(){
        order =new ArrayList<>();
    } 
    public void addBurger(Burger burger){
        order.add(burger);
    }
    public double calculateTotal()
    {
        double total=0;
        for(Burger burger:order){
            total +=burger.getPrice();
        }
        return total;
    }
    public void displayOrder()
    {
        System.out.println("Your order: ");
        for(Burger burger:order){
            System.out.println(burger);
        }
        System.out.println("Total is : Rs. "+calculateTotal());
    }
}
public class burgerShop {
    public static void main(String args[]){

    }
}
