public abstract class Icing extends BakedGoods{

    private boolean icing;

    public Icing(String name, String baseFlavour, boolean icing){
        super(name, baseFlavour);
        this.icing = icing;
    }

}
