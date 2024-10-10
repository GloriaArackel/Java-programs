import java.util.*;
import java.io.*;
public class Filereaderandwriter {
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			File obj1=new File("Register.txt");
			obj1.createNewFile();
			System.out.println("Register.txt created \n");
			FileWriter fout=new FileWriter("Register.txt");
			System.out.println("Enter KEAM rank");
			int n=sc.nextInt();
			fout.write(n+"\n");
			fout.close();
			System.out.println("Data is added");
			FileReader fin=new FileReader("Register.txt");
			BufferedReader br=new BufferedReader(fin);
			String line;
			System.out.println("Content of Register1.txt is:");
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			}
		catch(IOException e) {
			System.out.println("Exception occured"+e.getMessage());
		}
	}

}
