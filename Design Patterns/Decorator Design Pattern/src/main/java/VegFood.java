public class VegFood implements Food{
    @Override
    public Double foodPrice() {
        return 30.9;
    }

    @Override
    public String prepareFood() {
        return "veg food";
    }
}
