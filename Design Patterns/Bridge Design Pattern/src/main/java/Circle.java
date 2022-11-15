public class Circle extends Shape{

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColor() {
        color.applyColour();
        System.out.println("circle is filled with color ");
    }
}
