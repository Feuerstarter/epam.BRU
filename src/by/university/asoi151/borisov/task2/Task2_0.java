/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feuerstarter
 */

public class Task2_0 {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        double m1 = Double.parseDouble(args[2]);
        double m2 = Double.parseDouble(args[3]);
        double G = 4 * Math.pow(java.lang.Math.PI, 2) * (Math.pow(a, 3) / (Math.pow(p, 2) * (m1 + m2)));
        System.out.println(G);
    }
}
