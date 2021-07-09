import java.util.*;

public class list1 {
	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(32);
		a.add(42);
		a.add(22);
		a.add(11);
		System.out.println("Index 2:\n"+a.get(2));
		Iterator itr=a.iterator();
		/*for(Integer i: a){
			System.out.println(i);
		}*/
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
