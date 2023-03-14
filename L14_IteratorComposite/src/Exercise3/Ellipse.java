package Exercise3;

public class Ellipse extends Figure{
    private String name;
    private int Radius1;
    private int Radius2;

    public Ellipse(String name, int Radius1, int Radius2) {
        this.name = name;
        this.Radius1 = Radius1;
        this.Radius2 = Radius2;
    }

    @Override
    public double getArea() {
        return Math.PI * Radius1 * Radius2;
    }

    @Override
    public void draw() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
