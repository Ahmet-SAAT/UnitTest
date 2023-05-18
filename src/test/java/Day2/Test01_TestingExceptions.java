package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {
    //Test ettigimiz method bekledigimiz exceptionu firlatti mi?

    @Test
    void testException(){
        String str="Merhaba Dunya";//13
        String str2=null;//13
        assertThrows(NullPointerException.class,//nullpointexception atarsa gecsin
                ()->{
                    System.out.println("testException() calisti");
                    //str2.length(); //ezception atmayacagi icin test gecmezdi
                    str2.length();
                });
    }


    //bolme islemi icin AritmeticException kontrolu
    @Test
    void testException2(){
        int sayi1=1;
        int sayi2=0;
//exceptionlarin parentini yazsak da calisir yani runtime exception
        assertThrows(ArithmeticException.class,()->{//aritmatic ezception atarsa gecsin
            System.out.println(sayi1/sayi2);
        });

    }

//yukaridaki senaryoyu method kullanarak yapalim
    @Test
    void testException3(){
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->{
            divide(sayi1,sayi2);
                }
        );

    }

    private int divide(int a,int b){
        return a/b;
    }

}
