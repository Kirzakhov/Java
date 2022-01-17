package myarray;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int len1 = sc.nextInt();
		System.out.println("Enter the size of second array");
		int len2 = sc.nextInt();
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		System.out.println("Enter first array elements");
		for(int i = 0; i < len1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements");
		for(int i = 0; i < len2; i++) {
			arr2[i] = sc.nextInt();
		}
		int len = len1 + len2;
		int[] arr = new int[len];
		for(int i = 0; i < len1; i++) {
			arr[i] = arr1[i];
		}
		for(int i = 0; i < len2; i++) {
			arr[len1 + i] = arr2[i];
		}
		int c =0 ;
		System.out.println("After merging both arrays");
		outer:
		for(int i = 0; i < len; i++) {
			inner:
			for(int j = 0; j < i; j++) {
				if(arr[i]==arr[j])
					continue outer;
			}
			c++;
			System.out.println("arr["+i+"] = " +arr[i]);
		}
		System.out.println("Size of newly formed array: " +c);
		int[] a = new int[c];
		outer:
		for(int i = 0, b=0; i < len; i++) {
			inner:
			for(int j = 0; j < i; j++) {
				if(arr[i]==arr[j])
					continue outer;
			}
			a[b++] = arr[i];
		}
		for(int i : a) {
			System.out.println(i);
		}
		sc.close();
	}

}
