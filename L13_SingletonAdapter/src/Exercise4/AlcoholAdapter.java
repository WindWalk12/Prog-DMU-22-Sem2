package Exercise4;

public class AlcoholAdapter extends Product {
    private Liquor liquor;
    public AlcoholAdapter(Liquor liquor) {
        super(liquor.getThePrice(), liquor.getTheDescription());
        this.liquor = liquor;
    }

    @Override
    public int getPrice() {
        return liquor.getThePrice();
    }

    @Override
    public void setPrice(int price) {
        liquor.setThePrice(price);
    }

    @Override
    public String getName() {
        return liquor.getTheDescription();
    }

    @Override
    public void setName(String name) {
        liquor.setTheDescription(name);
    }

    @Override
    public double calcVat() {
        return liquor.getVat();
    }
}
