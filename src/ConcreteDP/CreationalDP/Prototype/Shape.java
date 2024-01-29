package ConcreteDP.CreationalDP.Prototype;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(){}
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape shape){
        if(shape!=null){
            this.x -= shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }

}
