package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Menu setMenuItems(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
        return this;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public Menu setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
