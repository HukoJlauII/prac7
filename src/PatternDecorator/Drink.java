package PatternDecorator;

public class Drink implements Item{
    private Item item;

    public Drink(Item item) {
        this.item = item;
    }

    @Override
    public int getCost() {
        return item.getCost();
    }

    @Override
    public int getCount() {
        return item.getCount()*2;
    }
}
