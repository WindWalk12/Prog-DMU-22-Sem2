package Exercise4;

public class Liquor {
    private int price;
    private String description;

    public Liquor(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getThePrice() {
        return price;
    }

    public void setThePrice(int price) {
        this.price = price;
    }

    public String getTheDescription() {
        return description;
    }

    public void setTheDescription(String description) {
        this.description = description;
    }

    public double getVat() {
        if (this.price <= 90) {
            return this.price * 1.80;
        } else {
            return this.price * 2.2;
        }
    }
}
