package org.launchcode.java.Studio.RestaurantMenu;
import java.util.Date;
public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(){
        this.price = price;
        this.description = description;
        this.category =  category;
        this.dateAdded = dateAdded;
    }

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category =  category;
        this.dateAdded = new Date();
    }

    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Date getDateAdded() {
    // Add the date if statement
        return dateAdded;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

}
