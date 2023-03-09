package Exercise4;

public class ElectricProduct extends Product {
    public ElectricProduct(int price, String name) {
        super(price, name);
    }

    @Override
    public double calcVat() {
        if (super.getPrice() * 1.3 - super.getPrice() < 3) {
            return super.getPrice() + 3;
        } else {
            return super.getPrice() * 1.3;
        }
    }
}
