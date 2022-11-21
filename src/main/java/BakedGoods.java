public abstract class BakedGoods {

   protected String name;
    private String baseFlavour;
    protected int ovenTemp;

    public BakedGoods(String name, String baseFlavour, int ovenTemp){
        this.baseFlavour = baseFlavour;
        this.name = name;
        this.ovenTemp = ovenTemp;
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
    public String ovenTemp(){
        return String.format("Bake me at %s!", this.ovenTemp);
    }
}
