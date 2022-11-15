public class IranianFood extends FoodDecorator{


    public IranianFood(Food food) {
        super(food);
    }

    @Override
    public Double foodPrice() {
        return super.foodPrice()+400;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+" with rice";
    }
}
