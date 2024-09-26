package Lab1;

/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 *
 * Shows good use of Javadoc comments, annotations, visibility scope, modifiers and class hierarchies.
 *
 * class marked as 'abstract' since it is not designed to be instantiated directly.
 *
 * @author mdixon
 */
abstract class Shape {
    /**
     * The number of sides within the shape.
     *
     * Uses ‘private’ visibility modifier . Could use ‘protected’ so it can be accessed by sub-classes.
     */
    private int sides;
    /**
     * Gets the number of sides within the shape.
     *
     * @return the number of sides within the shape.
     */
    public int getSides() {
        return sides;
    }
    /**
     * Sets the number of sides within the shape.
     *
     * @param sides the number of sides within the shape.
     */
    public void setSides(int sides) {
        this.sides = sides;// use this.sides to distinguish between parameter and attribute.
    }
    /**
     * Gets the size of the shapes area.
     *
     * @return the size of the shapes area.
     */
    abstract public int getArea();
    /**
     * Constructor.
     *
     * @param sides the number of sides within the shape.
     */
    Shape(int sides) {
        this.sides = sides;
    }
}