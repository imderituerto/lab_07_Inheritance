public abstract class BakedGoods {

    private String name;
    private String baseFlavour;

    public BakedGoods(String name, String baseFlavour){
        this.baseFlavour = baseFlavour;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }

    public String getBaseFlavour(){
        return this.baseFlavour;
    }
    public void setBaseFlavour(){
        this.baseFlavour = baseFlavour;
    }
}
