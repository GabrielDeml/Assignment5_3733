import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.Message;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for your observer pattern; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class ObserverTests {
    @Test
    public void testObserver() {
        Message cleartext = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        cleartext.register(caesarCipher);
        cleartext.register(elbonianCipher);
        cleartext.setText("zzzZZz");
        String caesarBefore = caesarCipher.getText();
        String elbonianBefore = elbonianCipher.getText();
        cleartext.setText("aaaAAa");
        Assert.assertNotEquals(caesarBefore, caesarCipher.getText());
        Assert.assertNotEquals(elbonianBefore, elbonianCipher.getText());
    }
    @Test
    public void testObserverEmpty() {
        Message cleartext = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        cleartext.register(caesarCipher);
        cleartext.register(elbonianCipher);
        cleartext.setText("");
        String caesarBefore = caesarCipher.getText();
        String elbonianBefore = elbonianCipher.getText();
        cleartext.setText("");
        Assert.assertEquals(caesarBefore, caesarCipher.getText());
        Assert.assertEquals(elbonianBefore, elbonianCipher.getText());
    }
    @Test
    public void testObserverSame() {
        Message cleartext = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        cleartext.register(caesarCipher);
        cleartext.register(elbonianCipher);
        cleartext.setText("test");
        String caesarBefore = caesarCipher.getText();
        String elbonianBefore = elbonianCipher.getText();
        cleartext.setText("test");
        Assert.assertEquals(caesarBefore, caesarCipher.getText());
        Assert.assertEquals(elbonianBefore, elbonianCipher.getText());
    }
    @Test
    public void testCaesarObserver() {
        Message cleartext = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        cleartext.register(caesarCipher);
        cleartext.setText("test");
        String caesarBefore = caesarCipher.getText();
        String elbonianBefore = elbonianCipher.getText();
        cleartext.setText("testing");
        Assert.assertNotEquals(caesarBefore, caesarCipher.getText());
        Assert.assertEquals(elbonianBefore, elbonianCipher.getText());
    }
    @Test
    public void testElbonianObserver() {
        Message cleartext = new Message();
        CaesarCipher caesarCipher = new CaesarCipher();
        ElbonianCipher elbonianCipher = new ElbonianCipher();
        cleartext.register(elbonianCipher);
        cleartext.setText("test");
        String caesarBefore = caesarCipher.getText();
        String elbonianBefore = elbonianCipher.getText();
        cleartext.setText("testing");
        Assert.assertEquals(caesarBefore, caesarCipher.getText());
        Assert.assertNotEquals(elbonianBefore, elbonianCipher.getText());
    }
}
