package myfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9247625151651872L;
	transient int a;
	static int i;
	String s;
	Demo(int a, int i, String s){
		this.a = a;
		this.i = i;
		this.s = s;
	}
}
public class SerDeser {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Demo d = new Demo(1, 7, "Vivek");
		File f = new File("demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		d.i = 10;
		d = null;
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		d = (Demo)ois.readObject();
		System.out.println(d.a);
		System.out.println(d.i);
		System.out.println(d.s);
		ois.close();
		oos.close();
		
	}

}
