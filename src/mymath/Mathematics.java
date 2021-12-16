package mymath;
/*
 * Mathematics.java
 *
 * @version 1.00 - 08 Dec 2021 initial version
 */

/**
 * Diese Klasse berechnet den GGT zweier positiver Ganzzahlen 
 * mithilfe des extended Euklids.
 * <br><code><b>GCD und LCM</b></code>
 *
 * @version  1.00 - 08 Dec 2021
 * @author   Kai Uwe Mruck (kai.mruck@stud.hs-emden-leer.de)
 *
 */
public class Mathematics {
    
    /**
     * Parameterloser Konstruktor der Klasse Mathematics. 
     */
    public Mathematics() {
    }

    /**
    * Main Method of the Programm.
    * @param args - Unused in this test.
    */
    public static void main(String[] args) {
        System.out.println("Mathematics runs.");
    }

    /**
     * Statische Methode, die den groessten gemeinsamen Teiler 
     * (greatest common divisor) zweier positiver ganzer Zahlen ermittelt.
     * @param a      Zähler
     * @param b      Nenner
     * @return gcd   größten gemeinsamer Teiler
     */
    public static int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        
        if (a == 0 && b == 0) {
            return 0;
        
        } else if (b == 0 || a == b) {
            return a;
        
        } else if (b == 1) {
            return b;
        
        } else {
        
            while (a != b) {

                if (a < b) {
                    b -= a;
                } else {
                    a -= b;
                }
            }
    
        }
    
        return a;
    }
    
    // besser, aber nicht gem. Aufgabenstellung 
    /*
    public static int gcd(int a, int b) {
    if (b == 0) {
        return Math.abs(a);
    }
    return gcd(b, a%b );
    }
    */
    
    
    /**
     * Statische Methode, die das kleinste gemeinsame Vielfache 
     * (least common multiple) zweier positiver ganzer Zahlen ermittelt.
     * @param a  Zähler
     * @param b  Nenner
     * @return   das kleinste gemeinsame Vielfache 
     */
    public static int lcm(int a, int b) {
        
        if (gcd(a, b) != 0) {
            //Aufgrund der Formel ggT(m,n)*kgV(m,n)=|m*n|
            a = Math.abs(a * b) / gcd(a, b);

        } else {
            return 0;
        }
        return a;    
    }
}
