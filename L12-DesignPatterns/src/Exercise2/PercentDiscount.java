package Exercise2;

public class PercentDiscount implements Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double discount(double price) {
        return price - (((double) discountPercentage / 100) * price);
    }
}
