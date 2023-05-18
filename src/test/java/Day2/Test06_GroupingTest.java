package Day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test06_GroupingTest {

    //amacimiz birbiriyle iliskili testleri gruplamak


    //carpma ve toplama islemler icin yazilan test metodlarini gruplayacagiz
   @Nested
    class MultiplyTest {

       @ParameterizedTest
        @CsvSource(value = {"-12,-4,3","-12,4,-3","12,-4,-3"})
        void testMultiplyWithNonZero(int rs,int x,int y){
           assertEquals(rs,Math.multiplyExact(x,y));
       }

        @ParameterizedTest
        @CsvSource(value = {"0,3,0","0,0,4","0,12,0"})
        void testMultiplyWithZero(int rs,int x,int y){
            assertEquals(rs,Math.multiplyExact(x,y));
        }




    }


}
