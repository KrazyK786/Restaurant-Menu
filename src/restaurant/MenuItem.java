package restaurant;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuItem {
    private double price = 0;
    private String description = "";
    private String[] categoryOptions = new String[]{"appetizer","main course", "dessert"};
    private String currentCategory;
    private boolean isNew;

    private boolean isValidPrice(double givenPrice){
        return givenPrice > -1;
    }

    public void printMenuItem(){
        System.out.println(this.toString());
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
        return this.price;
    }

    public void setPrice(double price) {
        if (isValidPrice(price)){this.price = price;}
        else{System.out.println("Invalid price");}
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setNew(boolean aNew) {
        this.isNew = aNew;
    }


    @Override
    public String toString() {
        String newMessage = "";
        if (isNew){
            newMessage = "**New Item**";
        }
        DecimalFormat df = new DecimalFormat("#.00");
        String formattedPrice = df.format(price);

        return this.description + "\n" +
                "*****" + "\n" +
                "price = $" + df.format(price) + "\n" +
    //                ", description='" + description + '\'' +
                currentCategory + "\n" +
                newMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (Double.compare(menuItem.price, price) != 0) return false;
        if (isNew != menuItem.isNew) return false;
        if (description != null ? !description.equals(menuItem.description) : menuItem.description != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(categoryOptions, menuItem.categoryOptions)) return false;
        return currentCategory != null ? currentCategory.equals(menuItem.currentCategory) : menuItem.currentCategory == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(categoryOptions);
        result = 31 * result + (currentCategory != null ? currentCategory.hashCode() : 0);
        result = 31 * result + (isNew ? 1 : 0);
        return result;
    }
}
