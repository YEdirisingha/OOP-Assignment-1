import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class burger{
    private String name;
    private double price;

    public burger(String name,double price){
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
class billGenerate{
    
}
public class burgerShop {
    public static void main(String args[]){
        System.out.println(getName());
    }
}
