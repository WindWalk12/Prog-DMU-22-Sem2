package Exercise4;

public class App {
    public static void main(String[] args) {
        ElectricProduct ep1 = new ElectricProduct(45, "Light bulb");
        ElectricProduct ep2 = new ElectricProduct(2, "One battery");

        Food f1 = new Food(40, "Minced meat");
        Food f2 = new Food(70, "Pizza");

        Liquor l1 = new Liquor(88, "Slave vodka");
        Liquor l2 = new Liquor(350, "Gin");

        AlcoholAdapter aa1 = new AlcoholAdapter(l1);
        AlcoholAdapter aa2 = new AlcoholAdapter(l2);

        System.out.println(aa1.getPrice() + " " + aa1.getName() + " " + aa1.calcVat());
        System.out.println();

        System.out.println(aa2.getPrice() + " " + aa2.getName() + " " + aa2.calcVat());
        System.out.println();

        System.out.println(ep2.calcVat());
    }
}
