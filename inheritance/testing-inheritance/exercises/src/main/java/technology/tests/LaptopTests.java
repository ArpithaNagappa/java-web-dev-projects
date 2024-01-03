package technology.tests;

import org.junit.Before;
import org.junit.Test;
import technology.main.Computer;
import technology.main.Laptop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LaptopTests {
    Laptop myLaptop;
    @Before
    public void beforeTest(){
         myLaptop = new Laptop(3000,5000,"2023","Hp");

    }
    @Test
    public void ValueTest(){

        assertEquals(3000, myLaptop.getScreenHeight());
        assertEquals(5000, myLaptop.getScreenWidth());
        assertEquals("2023",myLaptop.getManufactureYear());
        assertTrue(true,myLaptop.getModelName());
    }
    @Test
    public void getNameTest(){
        //Laptop myLaptop = new Laptop(3000,5000,"2023", "Hp");
        assertEquals("ModelName is Hp" , myLaptop.getModelName());
    }
}
