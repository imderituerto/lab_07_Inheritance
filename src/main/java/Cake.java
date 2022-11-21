public class Cake extends Icing{

    private int layer;

    public Cake(String name, String baseFlavour, boolean icing, int layer){
        super(name, baseFlavour, icing);
        this.layer = layer;
    }

}
