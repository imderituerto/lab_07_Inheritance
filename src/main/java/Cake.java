public class Cake extends Icing{

    private int layer;

    public Cake(String name, String baseFlavour, int ovenTemp, boolean icing, int layer){
        super(name, baseFlavour, ovenTemp, icing);
        this.layer = layer;
    }

    // Overriding option for cakes that don't need to be oven-baked
    public String ovenTemp(){
        return String.format("I'm a no bake cake :)");
    }

    //TODO getters & setters for "layers" property
}
