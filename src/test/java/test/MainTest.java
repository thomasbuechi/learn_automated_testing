package test;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.assertEquals;


public class MainTest {


    @Test
    public void testMultiply(){
        assertEquals(20, Main.testMultiply(4,5));
        assertEquals(30, Main.testMultiply(6,5));
    }

}
