package Composite;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape implements Shape{

    List<Shape> shapes = new ArrayList<Shape>();


    @Override
    public void renderShapeToscreen() {
        System.out.println("Rendering Complex Shape");
        for(Shape s: shapes){
            s.renderShapeToscreen();
        }
        System.out.println();
    }



    @Override
    public Shape[] explodeShare() {
        return (Shape[]) shapes.toArray();
    }

    public void addToShape(Shape rectangelShape) {
    }
}
