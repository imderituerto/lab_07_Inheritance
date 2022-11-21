import java.util.ArrayList;

public class Cupcake extends Icing{

    private ArrayList<String> toppings;

    public Cupcake(String name, String baseFlavour, int ovenTemp, boolean icing, ArrayList<String> toppings){
        super(name, baseFlavour, ovenTemp, icing);
        this.toppings = new ArrayList<String>();
    }

    //TODO getters & setters for "toppings" property

}
