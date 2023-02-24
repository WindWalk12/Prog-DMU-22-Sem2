package Exercise5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Gui extends Application {

    private final int WIDTH = 700;
    private final int HEIGHT = 700;

    private final double triangleWidth = WIDTH - 30;
    private final double triangleHeight = HEIGHT - 100;
    private final double firstLength = WIDTH - 60;
    private final int order = 2;
    @Override
    public void start(Stage stage) {
        Pane root = initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();

    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        sierpinskiTriangle(pane, triangleWidth, triangleHeight, firstLength, order);
    }

    private void sierpinskiTriangle(Pane pane, double x, double y, double l, int o) {
        if (o == 0) {
            triangle(pane, x, y, l);
        } else {
            sierpinskiTriangle(pane, x, y, l/2, o - 1);
            sierpinskiTriangle(pane, x - l/2, y, l/2, o - 1);
            sierpinskiTriangle(pane, x - l/4, y - 0.5*Math.pow(3, 0.5) * (l/2), l/2, o - 1);
        }
    }

    private void triangle(Pane pane, double x, double y, double l) {
        Polygon polygon = new Polygon(x, y, x - l, y, x - (l/2), y - 0.5*Math.pow(3, 0.5) * l);
        polygon.setFill(Color.TRANSPARENT);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);
    }

}

