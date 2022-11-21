public abstract class Icing extends BakedGoods {

    private boolean icing;

    public Icing(String name, String baseFlavour, int ovenTemp, boolean icing) {
        super(name, baseFlavour, ovenTemp);
        this.icing = icing;
    }

    public String addIcing() {
        if (this.icing == true) {
            return String.format("Added icing to %s", this.name);
        } return null;
    }
}

