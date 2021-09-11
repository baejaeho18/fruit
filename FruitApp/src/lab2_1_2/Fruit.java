package lab2_1_2;
import java.util.Comparator;


public class Fruit {
	int no;
	String name;
	int num;

	public Fruit() {
		
	}	//왜????
	
	public Fruit(int no, String name, int num) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
	}
	// 우클릭 -> source -> generate getters and setters
	// overriding 상속 시 재정의
	// overloading 같은 기능의 함수는 입력값만 다르게하고 이름 같게
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return no+"-"+name+"("+num+")";
	}


	
}

class FruitComparator implements Comparator<Fruit>{
	
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}
