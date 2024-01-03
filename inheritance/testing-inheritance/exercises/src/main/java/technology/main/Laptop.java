package technology.main;

public class Laptop extends Computer{
    String modelName;
    public Laptop(int screenHeight,int screenWidth,String manufactureYear, String modelName){
        super(screenHeight,screenWidth,manufactureYear);
        this.modelName = modelName;
    }

    public String getModelName(){
        return "ModelName is " + this.modelName;

    }



}
