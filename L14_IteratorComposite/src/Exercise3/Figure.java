package Exercise3;

public abstract class Figure {
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public void setName(String name) {
        throw new UnsupportedOperationException();
    }

    public abstract double getArea();

    public abstract void draw();

    public void addFigure(Figure f) {
        throw new UnsupportedOperationException();
    }

    public void removeFigure(Figure f) {
        throw new UnsupportedOperationException();
    }

    public Figure getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
