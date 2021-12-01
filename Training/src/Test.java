import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;

public class Test{
	static int count=0;
	public static void main(String[] args) throws IOException {
		FileReader  f=new FileReader("test.txt");
		BufferedReader br=new BufferedReader(f);
		if(br.readLine()!=null)
		{
				count++;
			
		}
		System.out.println(count);
			
	
}
}