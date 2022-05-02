package oops;

class FindLargest{
	int i, j, k;
	FindLargest(){
		i = 10;
		j = 20;
	}
	FindLargest(int i, int j){
		this.i = i;
		this.j = j;
	}
	FindLargest(int i, int j, int k){
		this.i = i;
		this.i = j;
		this.k = k;
	}
	FindLargest(FindLargest obj){
		this.i = obj.i;
		this.j = obj.j;
		this.k = obj.k;
	}
	void larAmongTwo() {
		System.out.println(i>j?i:j);
	}
	void larAmongThree() {
		System.out.println(i>j?(i>k?i:k):(j>k?j:k));
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLargest fl = new FindLargest();
		FindLargest fl1 = new FindLargest(10, 70);
		FindLargest fl2 = new FindLargest(10, 20, 30);
		FindLargest fl3 = new FindLargest(fl2);
		fl.larAmongTwo();
		fl1.larAmongTwo();
		fl2.larAmongThree();
		fl3.larAmongThree();
		

	}

}
