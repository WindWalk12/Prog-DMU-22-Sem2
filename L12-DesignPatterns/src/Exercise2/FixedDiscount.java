package Exercise2;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double discount(double price) {
        if (price > discountLimit) {
            return price - fixedDiscount;
        }
        return price;
    }
}
