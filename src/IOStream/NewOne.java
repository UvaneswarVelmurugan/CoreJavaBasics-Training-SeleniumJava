package IOStream;

import java.io.File;

public class NewOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("E:\\Aptitude\\Downloads");
		long files = dir.length();
		
		boolean value = true;
		try {
			boolean isDir = dir.mkdir();
			dir.getAbsoluteFile();
			System.out.println(dir.getAbsoluteFile());
			dir.getAbsolutePath();
			System.out.println(dir.getAbsolutePath());
			dir.exists();
			//dir.length()
			System.out.println(dir.canRead());
			System.out.println(dir.getName());
			
			if(value) {
				System.out.println("The new file is created : ");
			}
			else {
				System.out.println("Not create. ");
			}
		}
		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
