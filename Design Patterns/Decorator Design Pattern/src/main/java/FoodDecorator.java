public abstract class FoodDecorator implements Food {
    // FoodDecorator abstract class that will implement the Food interface and override it's all methods and it has the ability to decorate some more foods
        private Food newfood;

    public FoodDecorator(Food food) {
        this.newfood = food;
    }

    @Override
    public Double foodPrice() {
        return newfood.foodPrice();
    }

    @Override
    public String prepareFood() {
        return newfood.prepareFood();
    }
}
