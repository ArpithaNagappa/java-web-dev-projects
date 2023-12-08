package org.lauchcode1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu2 {
    private LocalDate lastUpdated;
    private ArrayList<MItems> MItems ;

    public Menu2(LocalDate lastUpdated, ArrayList<MItems> MItems) {
        this.lastUpdated = lastUpdated;
        this.MItems = MItems;
    }
}
