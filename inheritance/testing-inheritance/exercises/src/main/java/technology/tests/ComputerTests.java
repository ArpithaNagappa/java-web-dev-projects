package technology.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import technology.main.Computer;

public class ComputerTests {
    Computer myComputer;
//    @Before
//    public void beforeTests(){
//        Computer myComputer = new Computer(3000,5000,"2023");
//    }

    @Test
    public void ValueTest(){
        Computer myComputer = new Computer(3000,5000,"2023");
        assertEquals(3000, myComputer.getScreenHeight());
        assertEquals(5000, myComputer.getScreenWidth());
        assertEquals("2023",myComputer.getManufactureYear());

    }

    @Test
    public void getOperatingSystemReturns(){
        //Computer myComputer = new Computer(3000,5000,"2023");
        String osName = System.getProperty("os.name");
        assertEquals(osName,myComputer.getOperatingSystem());
    }


}
