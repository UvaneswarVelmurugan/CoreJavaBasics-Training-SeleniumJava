package IOStream;

import java.io.FileReader;

public class ReadFromTheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[100];
		try {
			FileReader input = new FileReader("E:\\Aptitude\\Downloads\\input12.txt");
			input.read(arr);
			System.out.println("Data in the file: ");
			System.out.println(arr);
			input.close();
		}
		catch (Exception e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}

	}

}
