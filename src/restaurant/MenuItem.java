package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuItem {
    private double price = 0;
    private String description = "";
    private String[] categoryOptions = new String[]{"appetizer","main course", "dessert"};
    private String currentCategory;
    private boolean isNew = false;

    private boolean isValidPrice(double givenPrice){
        return givenPrice > -1;
    }

    public MenuItem(double aPrice, String aDescription,String aCurrentCategory,boolean aIsNew){
        if (isValidPrice(aPrice)){this.price = aPrice;}
        else{System.out.println("Invalid price; cannot be negative!");}

        this.description = aDescription;

        List<String> options = Arrays.asList(categoryOptions);
        if (options.contains(aCurrentCategory)){this.currentCategory = aCurrentCategory;}
        else{System.out.println("invalid category");}

        this.isNew = aIsNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (isValidPrice(price)){this.price = price;}
        else{System.out.println("Invalid price");}
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", categoryOptions=" + Arrays.toString(categoryOptions) +
                ", currentCategory='" + currentCategory + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
