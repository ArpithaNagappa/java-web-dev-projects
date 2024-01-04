package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Flavor> allergens = menu.getFlavors();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        //Comparator comparator = new FlavorComparator();
        //flavors.sort(comparator);
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Sorting flavors by NAME");
        for(Flavor flavor:flavors){
            System.out.println(flavor);
        }

        flavors.sort(new ArrayListComparator());
        System.out.println("Sorting flavors by Allergens");
        for(Flavor flavor:flavors){
            System.out.println(flavor);
        }
        System.out.println("Sorting cones by COST");
        for (Cone cone : cones) {
            System.out.println(cone);
        }



    }
}