package Exercise3;

public class Rectangle extends Figure {
    private String name;
    private int height;
    private int width;

    public Rectangle(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
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
