package technology.tests;

import org.junit.Before;
import org.junit.Test;
import technology.main.SmartPhone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartPhoneTest {
    SmartPhone myPhone;
    @Before
    public void beforeTest(){
        myPhone = new SmartPhone(3000,5000,"2023","iPhone");

    }
    @Test
    public void ValueTest(){

        assertEquals(3000, myPhone.getScreenHeight());
        assertEquals(5000, myPhone.getScreenWidth());
        assertEquals("2023",myPhone.getManufactureYear());
        assertTrue(true,myPhone.makePhoneCall("123-456-7890"));
    }
    @Test
    public void makeCallTest() {
        assertEquals("My phoneNumber is 123-456-7890", myPhone.makePhoneCall("123-456-7890"));
    }
}
