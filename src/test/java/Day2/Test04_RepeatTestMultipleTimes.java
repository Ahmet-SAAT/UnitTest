package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {
    //testi tekrarlamak istersem

    @Test
    void testSubstring(){

        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("Test calisti");
    }
//testi tekrarlamak istersem
    @RepeatedTest(5)
    @Disabled//gorunmez olur yoruma almak gibi
    void testRepeated(){

        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("Test calisti");
    }

    @RepeatedTest(3)
    void testRepeated2(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("test2 calisti");
    }

    Random rm=new Random();

    @RepeatedTest(5)
    void testMathExact(){
        int sayi1=rm.nextInt(10);
        int sayi2=rm.nextInt(10);
        assertEquals(sayi1+sayi2 , Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : " + sayi1 + " sayi2 = " + sayi2 );
    }


}
