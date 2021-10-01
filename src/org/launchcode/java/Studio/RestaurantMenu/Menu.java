package org.launchcode.java.Studio.RestaurantMenu;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private String[] courses = {"Appetizer", "Main Course", "Dessert"};
    //MenuItem items = new MenuItem(3.99, "Slice of Pizza", "Appetizer");
    private Date mostRecentDate;
    private ArrayList<MenuItem> items;

    public Menu(String[] courses, ArrayList<MenuItem> items) {
        this.courses = courses;
        this.items = items;
        this.mostRecentDate = new Date();
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Date getMostRecentDate() {
        return mostRecentDate;
    }

    public void setMostRecentDate(Date mostRecentDate) {
        this.mostRecentDate = mostRecentDate;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
}
