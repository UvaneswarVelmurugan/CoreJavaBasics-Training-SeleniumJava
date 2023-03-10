package ControlFlowStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
	private static void process(String str) {
		System.out.println("Processing... "+str +"\n");
	}

	private static void doReadFromStdin() {
		try {
			BufferedReader instream = new BufferedReader(new InputStreamReader(System.in));
			String inline ="";
			while(!(inline.equalsIgnoreCase("Quit")) && !(inline.equalsIgnoreCase("exit")))
			{
				System.out.println("Prompt ");
				inline = instream.readLine();
				process(inline);
			}
			
		}
		catch (IOException e) {
			System.out.println("IOException: "+e);
		}

	}public static void main(String[] args) {
		doReadFromStdin();
	}

}
