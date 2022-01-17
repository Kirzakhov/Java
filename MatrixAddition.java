package myarray;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m = sc.nextInt();
		System.out.println("Enter number of cols");
		int n = sc.nextInt();
		int[][] arr1 = new int[m][n];
		int[][] arr2 = new int[m][n];
		int[][] arr = new int[m][n];
		System.out.println("Enter elements of first array");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of second array");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Elements after addition");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
