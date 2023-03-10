package IOStream;

import java.io.FileWriter;

public class WriteFromTheFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "This is the data in the output file";
		try {
			FileWriter output = new FileWriter("E:\\Aptitude\\Downloads\\input12.txt");
			output.write(data);;
			output.flush();
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
