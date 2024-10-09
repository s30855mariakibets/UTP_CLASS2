import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class Task2 {
    private static Cplx cplx = new Cplx(2, 3);

   /* having a static field could lead to future issues,
    particularly if tests are run in different orders or more tests are added. It’s advisable to be cautious
    with static fields in tests, as they can introduce shared state that may lead to unintended consequences.*/

    @BeforeEach
    public void setUp() {
        cplx = new Cplx(2, 3);
    }

    @Test
    public void compareCplxArr(){
        assertArrayEquals(cplx.getCplxArr(), new double[]{2, 3});
    }

    @Test
    public void testToString(){
        assertEquals(cplx.toString(), "2.0 + 3.0i");
    }

    @Test
    public  void testAddAss(){
        Cplx result = cplx.addAss(new Cplx(2, 3));
        assertEquals(result, new Cplx(4, 6) );
    }

    @Test
    public void testSubAss(){
        Cplx result = cplx.subAss(new Cplx(2, 3));
        assertEquals(result, new Cplx(4, 6));
    }

}
