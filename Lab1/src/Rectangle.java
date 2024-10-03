public class Rectangle extends Shape {

    private int width;        // gets size of one side of rectangle
    private int height;       // gets size of second side of rectangle

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getArea() {
        return (width * height);
    }

    Rectangle(int sides) {
        super(sides);
    }

}

































/**
 * Constructor.
 *
 * @param sides the number of sides within the shape.
 */
        Rectangle(int sides) {
            super(sides);
        }
    }

}
