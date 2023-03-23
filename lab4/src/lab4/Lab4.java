/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class Lab4 {
    public int[][] setGraph(File file) throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        int columns = sc.nextInt();
        int rows = sc.nextInt();
        int[][] g = new int[rows][columns];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j ++) {
                g[i][j] = sc.nextInt();
            }
        }
        return g;
    }
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\Battl\\Desktop\\School\\Third Year\\gitCPS688\\CPS688\\lab4\\src\\lab4\\MBM.txt");
        Lab4 lab4 = new Lab4();
        int[][] graph = lab4.setGraph(file);
        for (int i = 0; i < 6; i ++) {
            for (int j = 0; j < 6; j ++) {
                System.out.print(graph[i][j] + " "); 
            }
            System.out.println();
        }
    }
    
}
