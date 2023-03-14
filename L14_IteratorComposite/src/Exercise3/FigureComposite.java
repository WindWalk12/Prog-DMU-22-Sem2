package Exercise3;

import java.util.ArrayList;

public class FigureComposite extends Figure {
    ArrayList<Figure> figures = new ArrayList<>();

    public FigureComposite() {
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (Figure f :figures) {
            totalArea += f.getArea();
        }
        return totalArea;
    }

    @Override
    public void draw() {
        for (Figure f :figures) {
            f.draw();
        }

    }

    public void addFigure(Figure f) {
        figures.add(f);
    }

    public void removeFigure(Figure f) {
        figures.remove(f);
    }

    public Figure getChild(int i) {
        return figures.get(i);
    }
}
