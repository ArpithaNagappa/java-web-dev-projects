package technology.main;

import technology.main.Computer;

public class SmartPhone extends Computer {
  private String brandName;
    public SmartPhone(int screenHeight,int screenWidth,String manufactureYear,String brandName) {
        super(screenHeight, screenWidth, manufactureYear);
        this.brandName = brandName;
    }
    public String makePhoneCall(String number){
        return "My phoneNumber is " + number;
    }
}
