package oops;
class ASMD{
	byte add(byte i, byte j) {
		System.out.println("Sum of byte");
		return (byte) (i+j);
	}
	short add(short i, short j) {
		System.out.println("Sum of short");
		return (short) (i+j);
	}
	int add(int i, int j) {
		System.out.println("Sum of int");
		return (i+j);
	}
	float add(float i, float j) {
		System.out.println("Sum of float");
		return (i+j);
	}
	double add(double i, double j) {
		System.out.println("Sum of double");
		return (i+j);
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASMD a = new ASMD();
		short res = a.add((short)2, (short)3);
		byte res1 = a.add((byte)3, (byte)4);
		int res2 = a.add(4, 5);
		double res3 = a.add(0.2, 1.8);
		float res4 = a.add(2.3f, 3.2f);
		System.out.println("short \t byte \t int \t double \t float");
		System.out.println("-----------------------------------------------");
		System.out.println(res+"\t"+res1+"\t"+res2+"\t"+res3+"\t\t"+res4);
	}

}
