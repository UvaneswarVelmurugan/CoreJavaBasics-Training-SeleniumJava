package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Properties connProp = new Properties();
		connProp.setProperty("Username", "Flower");
		connProp.setProperty("Password", "Poo@RV786514");
		FileOutputStream propsFile= new FileOutputStream("E:\\Aptitude\\Downloads\\input12\\new2file");
		connProp.store(propsFile," Properties File");
		propsFile.close();
		String uname = null;
		String passw = null;
		Properties tempProp = new Properties();
		FileInputStream obtained = new FileInputStream("E:\\Aptitude\\Downloads\\input12\\new2file");
		tempProp.load(obtained);
		propsFile.close();
		uname = tempProp.getProperty("Username");
		passw = tempProp.getProperty("Password");
		System.out.println(uname+" "+passw);
		

	}

}
