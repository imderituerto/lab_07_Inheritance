public class Cookie extends BakedGoods{

    private boolean healthier;
    private boolean nuts;

    public Cookie(String name, String baseFlavour, int ovenTemp, boolean healthier, boolean nuts){
        super(name, baseFlavour, ovenTemp);
        this.healthier = healthier;
        this.nuts = nuts;
    }

}
