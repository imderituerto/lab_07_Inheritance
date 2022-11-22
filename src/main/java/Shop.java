import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<String> bakedGoodsAvailable;

    public Shop(String name, ArrayList<String> bakedGoods){
        this.name = name;
        this.bakedGoodsAvailable = bakedGoods;
    }

    public ArrayList<String> getBakedGoodsAvailable (){
        return this.bakedGoodsAvailable;
    }
    public void setBakedGoodsAvailable (ArrayList<String> bakedGoods){
        this.bakedGoodsAvailable = bakedGoods;
    }
}
