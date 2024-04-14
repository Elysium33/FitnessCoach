package com.example.Project;


import com.example.Project.Cezar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CezarTest {

    private static Cezar cezar;

    @BeforeAll
    public static void setUp() throws Exception{
        cezar = new Cezar("ABC");

    }

    @Test
    public void testOne(){
        assertEquals("EFG", cezar.computePassword("Medium"));
    }

    @Test
    public void testTwo(){
        assertEquals("BCD", cezar.computePassword("Easy"));
    }

    @Test
    public void testThree(){
        assertEquals("BCD", cezar.computePassword("Complex"));
    }

}
