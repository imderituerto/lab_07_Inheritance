public class Cookie extends BakedGoods{

    private boolean healthier;
    private boolean nuts;

    public Cookie(String name, String baseFlavour, boolean healthier, boolean nuts){
        super(name, baseFlavour);
        this.healthier = healthier;
        this.nuts = nuts;
    }


}
