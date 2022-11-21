public class Cake extends Icing{

    private int layer;

    public Cake(String name, String baseFlavour, int ovenTemp, boolean icing, int layer){
        super(name, baseFlavour, ovenTemp, icing);
        this.layer = layer;
    }

    // Overriding option for cakes that don't need to be oven-baked
    public String getOvenTemp(){
        if(ovenTemp == 0) {
            return "I'm a no-bake cake :)";
        } return String.format("Bake me at %s!", this.ovenTemp);
    }
    public void setOvenTemp(int ovenTemp){
        this.ovenTemp = ovenTemp;
    }

    public int getLayers(){
        return this.layer = layer;
    }
    public void setLayers(int layers){
        this.layer = layers;
    }
}
