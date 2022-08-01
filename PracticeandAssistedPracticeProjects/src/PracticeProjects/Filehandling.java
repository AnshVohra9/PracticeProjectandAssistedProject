package PracticeProjects;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;


public class Filehandling {

	public static void main(String[] args) {
		File MyFile= new File("C:\\Users\\ansh vohra\\Desktop\\FileHandling\\filehandling.txt");
		String data="My name is Ansh";
		String app="appender";
		char[] reader= new char[100];
		try {
			if(MyFile.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("file not created");
				System.out.println("file writing error");
			}
				
		}
		catch(IOException ex){
			System.out.println("File creation error");
			
		}
		try {
			FileWriter output=new FileWriter("C:\\\\Users\\\\ansh vohra\\\\Desktop\\\\FileHandling\\\\filehandling.txt");
			output.write(data);
			System.out.println("data is written");
			output.close();
		}
		catch(IOException g) {
			System.out.println("file write error");
			
		}
		try {
			FileReader input=new FileReader("C:\\\\\\\\Users\\\\\\\\ansh vohra\\\\\\\\Desktop\\\\\\\\FileHandling\\\\\\\\filehandling.txt");
			input.read(reader);
			System.out.println("data read");
			System.out.println(reader);
			input.close();
		}
		catch(IOException b) {
			System.out.println("file read error");
		}
		try {
			FileWriter op=new FileWriter("C:\\\\Users\\\\ansh vohra\\\\Desktop\\\\FileHandling\\\\filehandling.txt",true);
			op.write(app);
			System.out.println("data appended");
			op.close();
			
		}
		catch (IOException f) {
			System.out.println("append error");
		}
		
	}

}
