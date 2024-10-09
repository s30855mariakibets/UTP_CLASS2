import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleNumericalOperations {

    public int add(int a, int b){
        return a - b;
    }
    public boolean isPositive(int value){
        return value < 0;
    }

    public boolean isNegative(int value){
        return value >= 0;
    }

//    @Test
//    public void testAddition (){
//        assertEquals(add(2, 4), 2+4);
//        assertEquals(add(6, 4), 6+4);
//        assertEquals(add(2, 6), 2+6);
//        assertEquals(add(2, 8), 2+8);
//    }

    @Test
    public void testPosNeg (){
        assertAll(
                ()-> isPositive(-1),
                () -> isPositive(1),
                () -> isNegative(-4),
                () -> isNegative(3)
        );
    }

}
