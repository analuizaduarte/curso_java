package curso_programacao;

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		int num = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println();
				if (mat[i][j] == num) {
					System.out.printf("Position: %d,%d%n", i, j);
					if (j > 0) {
						System.out.printf("Left: %d%n", mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.printf("Right: %d%n", mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.printf("Up: %d%n", mat[i - 1][j]);

					}
					if (i < m) {
						System.out.printf("Down: %d%n", mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
