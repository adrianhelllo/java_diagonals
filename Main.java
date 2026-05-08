/* 
Hi this is my first Ever java program waow
This program takes an input matrix of size NxN and compares
the diagonals below and above the main diagonal
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Grid size: ");
    Scanner scanner = new Scanner(System.in);
    
    // ask user for N
    final int N = Integer.parseInt(scanner.nextLine());

    // define grid and sums
    int[][] grid = new int[N][N];
    int sumB = 0, sumT = 0;

    // fill grid with random values
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            grid[i][j] = (int) (Math.random() * 101);
        }
    }

    // go through diagonals
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < (N-i-1); j++) {
            sumB += grid[i+1][j];
            sumT += grid[i][j+1];
        }
    }

    System.out.println("Southwest diagonals: " + sumB);
    System.out.println("Northeast diagonals: " + sumT);
  }
}