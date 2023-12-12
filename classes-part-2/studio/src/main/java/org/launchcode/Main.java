package main.java.org.launchcode;

import org.lauchcode1.MItems;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("ApplePie", 4.99 , "Yummy dessert" ,"Dessert", true);
        MenuItem item2 = new MenuItem("Biryani", 10.99 ,"Yummy biryani","mainCourse", true);
        MenuItem item3 = new MenuItem("PepperChicken", 9.99 , "Yummy chicken","appetizer", true);

        /*Menu myMenu = new Menu();
        myMenu.addItem(item1);
        myMenu.addItem(item2);
        myMenu.addItem(item3);
        //to remove item
        myMenu.removeItem(item2);
        //print entire updated menu
        System.out.println(myMenu.toString());*/
        //print individual menu item
        System.out.println(item2.toString());
        //System.out.println(item1.toString());
        System.out.println(item2.equals(item1));
    }
}
