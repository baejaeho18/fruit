package lab2_1_2;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.List;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
		
		Fruit f = new Fruit();
		
		Scanner s = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.printf((i+1)+"th fruit information(name, number) : ");
			int no = i+1;
			String name = s.next();
			int num = s.nextInt();
			fruits.add(new Fruit(i+1, name, num));
		}
		
		Collections.sort(fruits, new FruitComparator());
		System.out.println("List of Fruits are : ");
		for (int j=0;j<fruits.size();j++) {
			System.out.println(fruits.get(j).toString());
		}

	}

}
