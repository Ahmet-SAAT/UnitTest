package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    String str;

    @BeforeEach//her method test edilmeden once calisir
    void beforeEach(){

        str="JUnit5 is better than JUnit4";
        System.out.println("******* beforeEach() calisti *********");
    }

   @AfterEach//her method test edildikten sonra calisir
   void afterEach(){

       str=null;
       System.out.println("******* afterEach() calisti *********");
   }

    @Test
    void testSplit(TestInfo info){
        String [] anlikDizi=str.split(" ");
        String [] beklenenDizi={"JUnit5","is","better","than","JUnit4"};
        System.out.println(info.getDisplayName()+" calisti");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }


   @Test
    void testStringLength(TestInfo info){
        int anlikDeger=str.length();
        int beklenenDeger=28;
       assertEquals(anlikDeger,beklenenDeger);
       System.out.println(info.getDisplayName()+" calisti");
   }
//defaulta class levelden calistirirsak methodlar random calisir
//test methodlarinn calisma sirasini kendimiz belirlemek istyorsak JUnit4-->@FixMethodOrder




}
