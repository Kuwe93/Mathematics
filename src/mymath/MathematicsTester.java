package mymath;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
 * MathematicsTester.java
 *
 * @version 1.00 - 08 Dec 2021 initial version
 */

/**
 * Diese Klasse dient zum Testen der Methoden aus der Klasse Mathematics.
 * <br><code><b>[MathematicsTester]</b></code>
 *
 * @version 1.00 - 08 Dec 2021
 * @author   Kai Uwe Mruck (kai.mruck@stud.hs-emden-leer.de)
 *
 */
public class MathematicsTester {
    

    /**
     * Parameterloser Konstruktor.
     */
    public MathematicsTester() {
    }
            
    
    /** 
    * GCD-Test-Methode. 
    */ 
    @Test
    @DisplayName("Testing GCD")
    public void testGCD() {
        assertEquals(2, Mathematics.gcd(42, 2));
        
        assertEquals(6,Mathematics.gcd(42, 12));
        assertEquals(0,Mathematics.gcd(0, 0));
   
        
        assertEquals(7,Mathematics.gcd(7, 0));
        assertEquals(1,Mathematics.gcd(7, 1));
    }

    /** 
    * LCM-Test-Methode. 
    */ 
    @Test 
    @DisplayName("Testing LCM")
    public void testLCM() {
        assertEquals(42,Mathematics.lcm(42, 2));
        assertEquals(1684,Mathematics.lcm(4, 421));
        assertEquals(0,Mathematics.lcm(0, 0));
        assertEquals(4,Mathematics.lcm(4, 2));
    }
}
