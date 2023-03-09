/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class Lab3 {

    static int cutRod (int[] price, int n) throws FileNotFoundException {
        int[] r = new int[n];
        int q = 0;
        r[0] = 0;
        for (int i = 0; i < n; i ++) {
            q = Integer.MAX_VALUE * -1;
            for (int j = 0; j < n; j ++) {
                q = Math.max(q, price[j] + r[j - i]);
            }
            r[i] = q;
        }
        return r[n];
    } 
    
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Battl\\Desktop\\School\\Third Year\\gitCPS688\\CPS688\\lab3\\src\\lab3");
        Scanner sc = new Scanner(file1);
        int n = sc.nextInt();
        int[] p =  new int[n];
        for (int i = 0; i < n; i ++) {
            p[i] = sc.nextInt();
        }
        System.out.println(cutRod(p, n));
    }
    
}
