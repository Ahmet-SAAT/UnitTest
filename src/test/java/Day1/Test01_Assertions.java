package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){
        //main methodu yokken nasil calisti?
        //Junit icinde gomulu olarak gelen main methodu cagrilir
        //Junit5(jupiter)den sonra metodlarin erisim belirleyicisini public yapmak zorunda degiliz
    }

    @Test
    public void testLengtg(){
        String cumle ="Merhaba Dunyam";//14 karakter
        int anlikDeger=cumle.length();
        int beklenenDeger=14;
       assertEquals(beklenenDeger,anlikDeger); //beklenendeger ve anlikdeger esitse test gecer
    }

   @Test
    public void testUppercase(){
        String anlikDeger="Merhaba".toUpperCase();//MERHABA
        String beklenenDeger="MERHABA";
        assertEquals(beklenenDeger,anlikDeger,"Upparcase metodu duzgun calismadi");
        //eger test gecmezse message verebiliriz.
   }

   @Test
    public void  testToplama(){
        int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi2,sayi1);
        int beklenenDeger=15;
        assertEquals(anlikDeger,beklenenDeger);
   }

    @Test
    public void  testContins(){
       assertEquals(false,"Mirac".contains("z"));
    }









}
