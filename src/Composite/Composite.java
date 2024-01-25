package Composite;


import java.util.List;

public class Composite implements Shape{

    private List<Shape> components;



    @Override
    public void renderShapeToscreen() {

    }

    @Override
    public Shape[] explodeShare() {
        return new Shape[0];
    }
}
