import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public abstract class BakedGoods {

    protected String name;
    protected String baseFlavour;
    protected int ovenTemp;
    protected boolean icing;
    private ArrayList<String> bakedGoods;

    public BakedGoods(String name, String baseFlavour, int ovenTemp, boolean icing){
        this.baseFlavour = baseFlavour;
        this.name = name;
        this.ovenTemp = ovenTemp;
        this.icing = icing;
        this.bakedGoods = new ArrayList<>();
    }

    public abstract String getName();

    public void setName(String newName){
        this.name = newName;
    }

    public String getBaseFlavour(){
        return this.baseFlavour;
    }
    public void setBaseFlavour(String newBaseFlavour){
        this.baseFlavour = newBaseFlavour;
    }

    public String getOvenTemp(){
        return String.format("Bake me at %s!", this.ovenTemp);
    }
    @Override
    public String getOvenTemp(String message){
        return String.format("I'm a no-bake cake!");
    }

    public void setOvenTemp(int newOvenTemp){
        this.ovenTemp = newOvenTemp;
    }

    public boolean getIcing(){
        return this.icing;
    }
    public void setIcing(boolean icing){
        this.icing = icing;
    }

    public ArrayList<String> getBakedGoodsAvailable(){
        return this.bakedGoods;
    }
    public void setBakedGoodsAvailable(ArrayList<String> newBakedGoods){
        this.bakedGoods = newBakedGoods;
    }

    /*
     Eoan explaining ArrayLists:

    public ArrayList<String> getIcingFlavour() {
        return this.icingFlavour;
    }

    public void setIcingFlavour(ArrayList<String> newIcingFlavour) {
        this.icingFlavour = newIcingFlavour;
    }
     */


}
