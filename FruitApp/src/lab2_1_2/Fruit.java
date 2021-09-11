package lab2_1_2;
import java.util.Comparator;


public class Fruit {
	int no;
	String name;
	int num;

	public Fruit() {
		
	}	//��????
	
	public Fruit(int no, String name, int num) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
	}
	// ��Ŭ�� -> source -> generate getters and setters
	// overriding ��� �� ������
	// overloading ���� ����� �Լ��� �Է°��� �ٸ����ϰ� �̸� ����
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
