/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class Lab5 {
    static int chars = 256;
    static int N;
    static int M;
    static Scanner sc = new Scanner (System.in);
    static String text;
    static String pat;

    public static String search (String txt, String pat) {
        int N = txt.length();
        int M = pat.length();
        int skip = 0;
        int[] right = new int[256];
        String s = "";
        for (int c = 0;c < 256; c ++) {
            right[c] = -1;
        }
        for (int j = 0; j < M; j ++) {
            right[pat.charAt(j)] = j;
        }
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j --) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) {
                s = s + " " + i;
                i += M;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Text: ");
            text = sc.nextLine();
            System.out.print("Enter Pattern: ");
            pat = sc.nextLine();
            N = text.length();
            M = pat.length();
            System.out.println("\nBoyer-Moore");
            System.out.println("Pattern " + pat + " found at index: " + search(text, pat));
            //System.out.println("\nRabin-Karp");
            System.out.print("\n");
        }
    }
}
