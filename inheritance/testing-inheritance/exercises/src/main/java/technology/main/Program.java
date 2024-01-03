package technology.main;

public class Program {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone(1500,500,"2023","iPhone");
        myPhone.makePhoneCall("123-456-7890");
        System.out.println(myPhone.getId());
        myPhone.restart();
        Laptop myLaptop = new Laptop(2500,1000,"2023","HP");
        System.out.println(myLaptop.getModelName());
        System.out.println(myLaptop.getId());
        Computer myComputer = new Computer(2000,2000,"2023");
        myComputer.getOperatingSystem();
        System.out.println(myComputer.getId());

    }
}
