package org.launchcode;

import org.junit.jupiter.api.Test;
import  org.launchcode.BalancedBrackets;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void singleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void doubleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void tripleBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void bracketInsideBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void withStringReturnsTrue(){ assertTrue(BalancedBrackets.hasBalancedBrackets("Appu"));
    }
    @Test
    public void emptyStringReturnsTrue(){assertTrue(BalancedBrackets.hasBalancedBrackets(" "));}
    @Test
    public void closedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void openBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void mismatchReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void randomReturnsTrue(){assertTrue(BalancedBrackets.hasBalancedBrackets("[Appu]"));}
    @Test
    public void random1ReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc][xyz]"));
    }
    @Test
    public void random2ReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }




}