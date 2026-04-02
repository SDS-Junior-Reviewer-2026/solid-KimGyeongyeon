package greeter;

import greeter.Greeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        greeter.setFormality(null);
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        assertEquals("Good evening, sir.", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter();
        greeter.setFormality("casual");
        assertEquals("Sup bro?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter();
        greeter.setFormality("intimate");
        assertEquals("Hello Darling!", greeter.greet());
    }

    @Test
    public void testSaysGoHome() {
        Greeter greeter = new Greeter();
        greeter.setFormality("gohome");
        assertEquals("Go Home!", greeter.greet());
    }

    @Test
    public void testSaysHelloAllVersion() {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        assertEquals("Good evening, sir.", greeter.greet());
        greeter.setFormality("casual");
        assertEquals("Sup bro?", greeter.greet());
        greeter.setFormality("intimate");
        assertEquals("Hello Darling!", greeter.greet());
    }
}
