import java.io.*;
class Filecreate {
	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("filename.txt");
			FileOutputStream fout=new FileOutputStream("filename1.txt");
			int i;
			while((i=fin.read())!=-1) {
				fout.write(i);
			}
			System.out.println("Successfully wrote to the specific file");
				fin.close();
				fout.close();
			}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}


