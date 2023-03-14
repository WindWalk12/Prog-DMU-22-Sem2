package Exercise3;

public class Triangle extends Figure {
    private String name;
    private int height;
    private int hypotenuse;

    public Triangle(String name, int height, int hypotenuse) {
        this.name = name;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (double)(height*hypotenuse)/2;
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
