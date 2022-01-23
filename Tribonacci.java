package mypack;


public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[10];
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 1;
//		for(int i = 3; i < 10; i++) {
//			arr[i] = arr[i-1] + arr[i-2] + arr[i-3]; 
//		}
//		for(int i : arr)
//			System.out.print(i + " ");
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int sum = 0;
		while(true) {
			sum = a + b + c;
			if(sum>100)
				break;
			System.out.println(sum);
			a = b;
			b = c;
			c = sum;
		}
		
	}

}
