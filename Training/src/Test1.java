import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test1 {
public static void main(String[] args) throws IOException {
	File f=new File("test.txt");
	FileWriter fw= new FileWriter(f);
//	BufferedWriter bw= new BufferedWriter(fw);
//	bw.write("hi");
//	bw.newLine();
	PrintWriter pw=new PrintWriter(fw);
	pw.println("hello");
	fw.flush();
	fw.close();
	pw.flush();
	pw.close();

}
}




//File f=new File("test.txt");
//FileWriter fw= new FileWriter(f);
//fw.write("praveen\n");
//fw.write("hi\n");
//fw.flush();
//fw.close();