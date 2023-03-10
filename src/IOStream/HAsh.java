package IOStream;

import java.util.HashMap;

public class HAsh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> Student = new HashMap<>();
		Student.put(121, "Man1");
		Student.put(122, "Man2");
		Student.put(123, "Man3");
		System.out.println("HAshMap : "+Student);
		String value = Student.get(122);
		System.out.println("Value at index 1 : "+ value);
		System.out.println("Keys : "+Student.keySet());
		System.out.println("Entries : "+Student.entrySet());
		
		String value1 = Student.remove(122);
		System.out.println("HAshMap : "+Student);
		
		System.out.println("Removed Value: "+ value1);
		

	}

}
