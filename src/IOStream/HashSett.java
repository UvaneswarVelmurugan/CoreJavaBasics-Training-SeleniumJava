package IOStream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		System.out.println("HashSet: "+ evenNumber);
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll(evenNumber);
		numbers.add(5);
		numbers.add(8);
		System.out.println("New HashSet no is : " + numbers);
		Iterator<Integer> iterate = numbers.iterator();
		System.out.print("HashSet using Iterator is a : ");
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		boolean value1 = numbers.remove(5);
		System.out.println("\n 5 removed? " + value1);
		
		boolean value2 = numbers.removeAll(numbers);
		System.out.println("all elements removed " + value2);
		
		HashSet<String>empList1 = new HashSet<>();
		empList1.add("Clad");
		empList1.add("ad");
		empList1.add("bat");
		empList1.add("dan");
		System.out.println("List of Employees11: "+empList1);
		TreeSet<String>empList = new TreeSet<>();
		empList.add("Clad");
		empList.add("ad");
		empList.add("bat");
		empList.add("dan");
		System.out.println("List of Employees: "+empList);
		

	}

}
