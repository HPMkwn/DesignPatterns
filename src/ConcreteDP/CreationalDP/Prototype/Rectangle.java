package ConcreteDP.CreationalDP.Prototype;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        if(rectangle!=null){
            this.height = rectangle.height;
            this.width = rectangle.width;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle shape2) || !super.equals(object2)) return false;
        return shape2.width == width && shape2.height == height;
    }
}
