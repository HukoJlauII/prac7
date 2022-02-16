package PatternDecorator;

public class RestaurantItem implements Item{
    private int cost=100;
    private int count = 1;


    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public int getCount() {
        return this.count;
    }
}
