abstract class Shape {
    protected Colour color;

    public Shape(Colour colour) {
        this.color = colour;
    }
    abstract public void applyColor();
}
