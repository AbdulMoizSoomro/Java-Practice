package tests;

import CountLargestGroup.CountLargestGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLargestGroupTests {
    @Test
    void TestN13(){

        int n= 13;
        int desiredOutput = 4;

        CountLargestGroup testObj = new CountLargestGroup();
        assertEquals(desiredOutput, testObj.countLargestGroup(n));
    }

    @Test
    void TestN29(){

        int n=29;
        int desiredOutput = 8;

        CountLargestGroup testObj = new CountLargestGroup();
        assertEquals(desiredOutput, testObj.countLargestGroup(n));
    }

    @Test
    void TestN264(){

        int n=264;
        int desiredOutput = 2;

        CountLargestGroup testObj = new CountLargestGroup();
        assertEquals(desiredOutput, testObj.countLargestGroup(n));
    }
}
