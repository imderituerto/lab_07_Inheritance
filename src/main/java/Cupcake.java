import interfaces.iIcing;

import java.util.ArrayList;

public class Cupcake extends BakedGoods implements iIcing {

    public Cupcake(String name, String baseFlavour, int ovenTemp, boolean icing){
        super(name, baseFlavour, ovenTemp, icing);
    }

    public String addIcing(boolean icing){
        return "Icing has been added!";
    }

    //TODO getters & setters for "toppings" property

    public String getName(){
        return this.name;
    }
//    public void addToppings(ArrayList<String> addedToppings){
//        this.toppings.add("Sprinkles");
//    }
//    public ArrayList<String> getToppings(){
//        return this.toppings = toppings;
//    }
//    public void setToppings(ArrayList<String> toppings){
//        this.toppings = toppings;
//    }

}
