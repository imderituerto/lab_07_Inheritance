public class Cookie extends BakedGoods{

    private boolean healthier;
    private boolean nuts;

    public Cookie(String name, String baseFlavour, int ovenTemp, boolean icing, boolean healthier, boolean nuts){
        super(name, baseFlavour, ovenTemp, icing);
        this.healthier = healthier;
        this.nuts = nuts;
    }

    public String getName(){
        return this.name;
    }

    public String getHealthStatus(){
        if(this.healthier == true) {
            return "This is a healthy snack.";
        } return "There are healthier alternatives.";
    }

    public void setHealthStatus(boolean healthier){
        this.healthier = healthier;
    }

    public String getNutStatus(){
        if(this.nuts == true){
            return "Careful, this cookie contains nuts.";
        } return "No nuts.";
    }
    public void setNutStatus(boolean nuts){
        this.nuts = nuts;
    }
}
