
public class Main {
    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield", 12);
       garfield.eat();
        System.out.println(garfield.isTired());   // prints true
        /*HouseCat spike = new HouseCat("Spike",13);
        System.out.println(spike.getWeight()); // prints 13*/
    }
}
