/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #3
 * Using only the conditional operator, write a program that reads 
 * three integers and prints the largest. Repeat with Math.max.
 */
package java_ex3_maxvalue;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex3_MaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int int1, int2, int3;
        System.out.println("Enter 3 integers");
        System.out.print("Integer #1: ");
        int1 = scan.nextInt();
        System.out.print("Integer #2: ");
        int2 = scan.nextInt();
        System.out.print("Integer #3: ");
        int3 = scan.nextInt();
        
        // Print largest number using the conditional operator
        /*
        int maxTemp = int1 > int2 ? int1 : int2;
        int max = maxTemp > int3 ? maxTemp : int3;
        System.out.println("Max: " + max);
        */
        // Print largest number using Math.max
        int maxTemp = Math.max(int1, int2);
        int max = Math.max(maxTemp, int3);
        System.out.println("Max: " + max);
    }
    
}
