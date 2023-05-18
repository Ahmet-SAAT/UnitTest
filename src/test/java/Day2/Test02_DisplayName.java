package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {

    @Test
    @DisplayName("Test parseInt() to check if it is throwing for non-digit value")
    void testException(){
        String str="Merhaba";//integer.parsInt(str)//string numericleri int cevirir.Numberformat ezception atar
       assertThrows(NumberFormatException.class,()->{
           Integer.parseInt(str);
       });



    }


}
