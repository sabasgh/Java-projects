public class NonVegFood extends FoodDecorator {
//here are the new options
    public NonVegFood(Food newfood) {
        super(newfood);
    }

    @Override
    public Double foodPrice() {
        return super.foodPrice() + 56;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with roasted meat";
    }
}
