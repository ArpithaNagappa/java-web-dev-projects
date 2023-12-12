package main.java.org.launchcode;

public class MenuItem {
    private  String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem( String n, double p, String d, String c, boolean iN) {

        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public String getName() {
        return name;
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

    public boolean isNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        String returnStr = "";
        returnStr +="item Name:" +this.name + "\n";
        returnStr +="item price:" +this.price + "\n";
        returnStr +="item Description:" +this.description + "\n";
        returnStr +="item category:" +this.category + "\n";
        returnStr +="item Is new:" +this.isNew + "\n";
        return returnStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
           return true;
        }

        if (obj == null) {
            return false;
        }

       if (obj.getClass() != getClass()) {
           return false;
        }

        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price == (this.price)
                && menuItem.category.equals(this.category))
        { return  true;}
                else { return false;}

   }
    }




