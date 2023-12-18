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
        Scanner sc=new Scanner(System.in);

        //Startes
        Burger hotCake=new Burger("Hot Cake",150);
        Burger hashbr=new Burger("Hash Browns", 200);
        //entrees
        Burger hamburg=new Burger("Hamburg",300);
        Burger cheeseburg=new Burger("Cheese Burger",350);
        Burger hotdog=new Burger("Hot Dog",250);
        //Desert
        Burger pie=new Burger("Pie",100);
        Burger shakes=new Burger("Shakes",200);
        Burger mcfurry=new Burger("McFurry",300);
        //Drinks
        Burger cola=new Burger("Coca-cola",100);
        Burger hotchoc=new Burger("Hot Chocolate",100);
        Burger tea=new Burger("Brew Tea",100);

        System.out.println("Menu: ");
        System.out.println("STARTES");
        System.out.println("1. "+hotCake);
        System.out.println("2. "+hashbr);
        System.out.println();
        System.out.println("ENTREES");
        System.out.println("3. "+hamburg);
        System.out.println("4. "+cheeseburg);
        System.out.println("5. "+hotdog);
        System.out.println();
        System.out.println("DESSERT");
        System.out.println("6. "+pie);
        System.out.println("7. "+shakes);
        System.out.println("8. "+mcfurry);
        System.out.println();
        System.out.println("DRINKS");
        System.out.println("9. "+cola);
        System.out.println("10. "+hotchoc);
        System.out.println("11. "+tea);

    }
}
