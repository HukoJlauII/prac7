package PatternDecorator;

public class Dish implements Item{
    private Item item;

    public Dish(Item item) {
        this.item = item;
    }

    @Override
    public int getCost() {
        return this.item.getCost()*10;
    }

    @Override
    public int getCount() {
        return this.item.getCount();
    }
}
