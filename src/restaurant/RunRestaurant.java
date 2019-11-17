package restaurant;

import java.util.Date;

public class RunRestaurant {
    public static void main(String[] args) {
        MenuItem tea = new MenuItem(0.50,"looseleaf tea","appetizer",true);
        MenuItem muffin = new MenuItem(1.00,"fresh baked muffin","appetizer",false);

        Menu dailyMenu = new Menu();
        dailyMenu.setMenuItems(tea);
        dailyMenu.setMenuItems(muffin);

        dailyMenu.setLastUpdated(new Date());

        System.out.println(dailyMenu);
    }
}
