package Exercise4;

public class Food extends Product {
    public Food(int price, String name) {
        super(price, name);
    }

    @Override
    public double calcVat() {
        return super.getPrice() * 1.05;
    }


}
