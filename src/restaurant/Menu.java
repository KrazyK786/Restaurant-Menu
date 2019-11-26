package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem){
        this.menuItems.remove(menuItem);
    }

    public void printMenu(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String menuItemString = "Menu" + "\n" +
                "**********\n" +
                "**********\n";
        for (MenuItem item : this.menuItems){
            menuItemString += item.toString() + "\n" + "\n";
//            menuItemStrings.add(item.toString());
        }
        return menuItemString;
    }


}
