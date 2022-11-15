public class Main {
    // this is our BridgePatternTest class
    public static void main(String[] args) {
        Shape crc = new Circle(new Red());
        crc.applyColor();
        Shape tri = new Triangle(new Blue());
        tri.applyColor();
    }
}
