package myarray;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for first matrix");
		int m = sc.nextInt();
		System.out.println("Enter number of cols for first matrix");
		int n = sc.nextInt();
		System.out.println("Enter number of rows for second matrix");
		int a = sc.nextInt();
		System.out.println("Enter number of cols for second matrix");
		int b = sc.nextInt();
		if(n==a) {
			int[][] arr1 = new int[m][n];
			int[][] arr2 = new int[a][b];
			int[][] arr = new int[m][b];
			System.out.println("Enter elements of first matrix");
			for(int i = 0; i < m; i++) 
				for(int j = 0; j < n; j++)
					arr1[i][j] = sc.nextInt();
			System.out.println("Enter elements of first matrix");
			for(int i = 0; i < a; i++) 
				for(int j = 0; j < b; j++)
					arr2[i][j] = sc.nextInt();
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < b; j++) {
					int sum = 0;
					for(int k = 0; k < a; k++) {
						sum += arr1[i][k]*arr2[k][j];
					}
					arr[i][j] = sum;
				}
			}
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < b; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Multiplication not possible");
		}
	}

}
