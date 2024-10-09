import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class Task3 {
    @Test
    public void simpleTest(){
        int[] array = Main.generateTestArray();
            assertArrayEquals(array, Main.generateTestArray());
    }

    @RepeatedTest(10)
    public void simpleTestR(){
        int[] array = Main.generateTestArray();
        for(int i = 0; i < 5; i ++ ){
            assertArrayEquals(array, Main.generateTestArray());
        }
    }

    @Test
    public void manualPerfTest() {
        long startTime = System.nanoTime();
        Main.bogoSort( Main.generateTestArray());
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println(result);
    }

    @Tag("performance")
     public void autoPerfTest(){
        int[] array = Main.generateTestArray();
        assertArrayEquals(array, Main.generateTestArray());
     }

    @Timeout(1000)
    @Test
    public void finalTest(){
        manualPerfTest();
        simpleTest();
        simpleTestR();
        autoPerfTest();
     }

}
