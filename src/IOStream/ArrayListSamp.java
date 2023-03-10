package IOStream;

import java.util.ArrayList;

public class ArrayListSamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("JAVA");
		languages.add("Py");
		languages.add("Swift");
		languages.add("TypeScript");
		System.out.println("ArrayList: "+languages);
		System.out.println("Get  element.. "+languages.get(1));
		languages.set(2,  "JavaScript");
		languages.remove(3);
		System.out.println("ArrayList1: "+languages);
		

	}

}
