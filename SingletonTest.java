import junit.framework.Assert;
import junit.framework.TestCase;
public class SingletonTest extends TestCase {
   private Singleton singleton1 = null, singleton2 = null;

   public void setUp() {
      singleton1 = ClassicSingleton.getInstance();
      singleton2 = ClassicSingleton.getInstance();
   }
   public void testUnique() {
	// Testing singleton objects for equality
     Assert.assertEquals(true, singleton1 == singleton2);
   }
}