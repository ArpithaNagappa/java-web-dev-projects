package technology.main;

public class Computer extends AbstractEntity{
    private int screenHeight ;
    private  int screenWidth;
    private  String manufactureYear;

    public Computer(int screenHeight,int screenWidth,String manufactureYear){
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.manufactureYear = manufactureYear;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getOperatingSystem(){
        //System.out.println("OS Name: " + System.getProperty("os.name"));
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        return osName;

    }
    public void restart(){
        System.out.println("Restarting the computer");
    }
}
