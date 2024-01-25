package Composite;

import java.awt.*;

public class Line implements Shape {

    private int pointX1;
    private int pointX2;
    private int pointY1;
    private int pointY2;

    public Line(int pointX1, int pointX2, int pointY1, int pointY2) {
        pointX1 = pointX1;
        pointX2 = pointX2;
        pointY1 = pointY1;
        pointY2 = pointY2;
    }

    @Override
    public void renderShapeToscreen() {
        System.out.println("REndering Line (" + pointX1 + ", " + pointY1 + "), (" + pointX2 + ", "+ pointY2+")\n");
    }

    @Override
    public Shape[] explodeShare() {
        Shape[] parts = {this};

        return  parts;
    }
}
