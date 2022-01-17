package myarray;
import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrNew = new int[n+1];
		System.out.println("Enter elements of array");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before insertion");
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("Enter element to add");
		int element = sc.nextInt();
		System.out.println("Enter position of insertion");
		int pos = sc.nextInt();
		if(pos > n + 1)
			System.out.println("Array Index out of Bounds");
		else {
			for(int i = 0, j = 0; i < n+1; i++) {
				if(pos-1 == i) {
					arrNew[i] = element;
					continue;
				}
				arrNew[i] = arr[j];
				j++;
			}
		}
		System.out.println("Array after insertion");
		for(int i : arrNew)
			System.out.print(i + " ");
		sc.close();
	}

}
