package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor allergen1, Flavor allergen2) {
        return Integer.compare(allergen2.getAllergens().size(), allergen1.getAllergens().size());
    }



}
