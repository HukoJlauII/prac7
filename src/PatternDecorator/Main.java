package PatternDecorator;

public class Main {
    public static void main(String[] args) {
        RestaurantItem restaurantItem=new RestaurantItem();
        System.out.println("Стоимость: "+ restaurantItem.getCost());
        System.out.println("Кол-во: "+ restaurantItem.getCount());
        Item dish=new Dish(restaurantItem);
        System.out.println("Стоимость блюд: "+ dish.getCost());
        System.out.println("Кол-во блюд: "+ dish.getCount());
        Item drink=new Drink(restaurantItem);
        System.out.println("Стоимость напитков: "+ drink.getCost());
        System.out.println("Кол-во напитков: "+ drink.getCount());
    }
}
