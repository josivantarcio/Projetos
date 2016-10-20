/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Renato
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i < 99) {
                System.out.print(fibonacci(i) + ", ");
            } else {
                System.out.print(fibonacci(i));
            }
        }
    }

    public static int fibonacci(long num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        } else {
            return (fibonacci(num - 1) + fibonacci(num - 2));
        }
    }

}
