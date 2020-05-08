import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {
    @Test
    public void CaesarTest1() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("a bcdefghijkl mnopqrstuvwxyz!"), "z yxwvutsrqpo nmlkjihgfedcba!");
    }

    @Test
    public void CaesarTest2() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("A, BCDEFGHIJ. KLMNO! PQRST? UVWXY Z"), "Z, YXWVUTSRQ. PONML! KJIHG? FEDCB A");
    }

    @Test
    public void CaesarTest3() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("This is a boring message!"), "Gsrh rh z ylirmt nvhhztv!");
    }

    @Test
    public void CaesarTest4() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),
                "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void CaesarTest5() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),
                "");
    }

    @Test
    public void CaesarTest6() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("abcD ^%1 #@"), "");
    }

    @Test
    public void CaesarTest7() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("~!@#$%^&*()_+{}|:><?"), "");
    }

    @Test
    public void CaesarTest8() {
        CaesarCipher caesarCipher = new CaesarCipher();
        assertEquals(caesarCipher.caesarCipherConversion("0123456789"), "");
    }

    @Test
    public void ElbonianTest1() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("This is 1 message!"), "20080919S0919SaS13051919010705!");
    }

    @Test
    public void ElbonianTest2() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("abcdefghijklmnopqrstuvwxyz"), "0102030405060708091011121314151617181920212223242526");
    }

    @Test
    public void ElbonianTest3() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "0102030405060708091011121314151617181920212223242526");
    }

    @Test
    public void ElbonianTest4() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("!!  !!"), "!!SS!!");
    }

    @Test
    public void ElbonianTest5() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("0123456789"), "_abcdefghi");
    }

    @Test
    public void ElbonianTest6() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"),
                "0101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101");
    }

    @Test
    public void ElbonianTest7() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabedmekwlwql"),
                "0101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101");
    }

    @Test
    public void ElbonianTest8() {
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        assertEquals(elbonianCipher.elbonianCipherConversion("asdl$%!#oh2n@13ln!fs^mwmm"), "");
    }

}
