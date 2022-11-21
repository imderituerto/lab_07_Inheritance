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
    public void setOvenTemp(int newOvenTemp){
        this.ovenTemp = newOvenTemp;
    }
}
