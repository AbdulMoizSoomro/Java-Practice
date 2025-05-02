package tests;

import CountLargestGroup.CountLargestGroupMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLargestGroupMapTests {
    @Test
    void TestN13(){

        int n= 13;
        int desiredOutput = 4;

        CountLargestGroupMap testObj = new CountLargestGroupMap();
        assertEquals(desiredOutput, testObj.countLargestGroupMap(n));
    }

    @Test
    void TestN29(){

        int n=29;
        int desiredOutput = 8;

        CountLargestGroupMap testObj = new CountLargestGroupMap();
        assertEquals(desiredOutput, testObj.countLargestGroupMap(n));
    }

    @Test
    void TestN264(){

        int n=264;
        int desiredOutput = 2;

        CountLargestGroupMap testObj = new CountLargestGroupMap();
        assertEquals(desiredOutput, testObj.countLargestGroupMap(n));
    }
}
