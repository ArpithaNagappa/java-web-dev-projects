package org.lauchcode1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MItems dessert = new MItems("ApplePie", 4.99 , "Dessert", true);
        MItems mCourse = new MItems("Biryani", 10.99 ,"mainCourse", true);
        MItems starter = new MItems("PepperChicken", 9.99 , "appetizer", true);

        dessert.toString();

        dessert.setDescription("Made out of apples");
        starter.setDescription("Made out of chicken");
        mCourse.setDescription("Made out of chicken and rice");

        System.out.println(dessert);



    }
}
