import java.util.ArrayList;

public class Cupcake extends Icing{

    private ArrayList<String> toppings;

    public Cupcake(String name, String baseFlavour, boolean icing, ArrayList<String> toppings){
        super(name, baseFlavour, icing);
        this.toppings = new ArrayList<String>();
    }
}
