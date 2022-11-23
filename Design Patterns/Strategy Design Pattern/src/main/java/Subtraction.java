public class Subtraction implements Strategy {
    @Override
    public int calculation(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }
}
