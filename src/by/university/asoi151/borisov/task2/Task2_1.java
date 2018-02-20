/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feuerstarter
 */

public class Task2_1 {
    public static void main(String args[]) {
        int algorithmId = Integer.parseInt(args[0]);
        int loopType = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
////////////////////////////////////////////////////////////////////////////////
        if (algorithmId == 1) {
            if (loopType == 1) {
                int a = 1;
                int b = 1;
                int sum_fib;
                int i = 0;
                while (i < n) {
                    sum_fib = a + b;
                    a = b;
                    b = sum_fib;
                    System.out.print(sum_fib + " ");
                    i++;
                }
            }
            if (loopType == 2) {
                int a = 1;
                int b = 1;
                int sum_fib;
                int i = 0;
                do {
                    sum_fib = a + b;
                    a = b;
                    b = sum_fib;
                    System.out.print(sum_fib + " ");
                    i++;
                } while (i < n);
            }
            if (loopType == 3) {
                int a = 1;
                int b = 1;
                int sum_fib;
                for (int i = 0; i < n; i++) {
                    sum_fib = a + b;
                    a = b;
                    b = sum_fib;
					System.out.print(sum_fib + " ");
                }
            }
        }
////////////////////////////////////////////////////////////////////////////////
        if (algorithmId == 2) {
            if (loopType == 1) {
                int result = 1;
                int i = 1;
				while (i <= n){
                    result = result * i;
                    i++;
				}
                System.out.println(result);
            }
            if (loopType == 2) {
                int result = 1;
                int i = 1;
                do {
                    result = result * i;
                    i++;
                } while (i <= n);
                System.out.println(result);
            }
            if (loopType == 3) {
                int result = 1;
				for (int i = 1; i <= n; i++){
                    result = result*i;
				}
                System.out.println(result);
            }
        }
////////////////////////////////////////////////////////////////////////////////
    } 
}
