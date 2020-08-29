import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Before
    public void beforeTestDo(){
        System.out.println("Antes del test");
    }

    @Test
    public void testGetHello(){
        assertEquals("Hola Mundito", new Hello().getHello());
        System.out.println("Durante el test");
    }

    @After
    public void afterTestDo(){
        System.out.println("Despues del test");
    }
}
