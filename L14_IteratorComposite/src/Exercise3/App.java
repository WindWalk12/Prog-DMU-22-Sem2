package Exercise3;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Rectangle", 50, 10);
        Rectangle r2 = new Rectangle("Rectangle", 20, 20);

        Triangle t1 = new Triangle("Triangle", 10, 20);
        Triangle t2 = new Triangle("Triangle", 20, 30);

        Ellipse e1 = new Ellipse("Ellipse", 20, 30);
        Ellipse e2 = new Ellipse("Ellipse", 30, 50);

        FigureComposite fc1 = new FigureComposite();
        fc1.addFigure(r1);
        fc1.addFigure(t1);
        fc1.addFigure(e1);

        r1.draw();
        System.out.println(r1.getArea());
        System.out.println();

        t1.draw();
        System.out.println(t1.getArea());
        System.out.println();

        e1.draw();
        System.out.println(e1.getArea());
        System.out.println();

        fc1.draw();
        System.out.println(fc1.getArea());
        System.out.println();

        FigureComposite fc2 = new FigureComposite();
        fc2.addFigure(r2);
        fc2.addFigure(t2);
        fc2.addFigure(e2);

        fc1.addFigure(fc2);
        fc1.draw();
        System.out.println(fc1.getArea());
    }
}
