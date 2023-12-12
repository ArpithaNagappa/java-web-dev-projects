package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.menuItems = i;
    }

    public Menu() {

    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.menuItems = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public void addItem(MenuItem item) {
        this.menuItems.add(item);
        lastUpdated = new Date();
      /*  if (!menuItems.contains(item)) {
            menuItems.add(item);
            lastUpdated = new Date();
        }*/
    }

    public void removeItem(MenuItem item) {
        this.menuItems.remove(item);
        lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String str = "";
        for (MenuItem item : menuItems) {
            str += item.toString() + "\n\n";
        }
        return str;

    }
}




