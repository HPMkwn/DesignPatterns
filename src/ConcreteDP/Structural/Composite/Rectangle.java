package ConcreteDP.Structural.Composite;

public class Rectangle implements Shape{

    Shape[] rectangleEdges = {new Line(-1,-1,1,-1),new Line(-1,1,1,1),new Line(-1,-1,-1,1),new Line(1,-1,1,1)};


    @Override
    public void renderShapeToscreen() {
        System.out.println("Rendering Rectangle");
        for (int i=0;i<rectangleEdges.length;i++){
            rectangleEdges[i].renderShapeToscreen();
        }
        System.out.println();
    }

    @Override
    public Shape[] explodeShare() {
        return rectangleEdges;
    }
}
