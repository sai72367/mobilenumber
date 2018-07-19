import java.util.regex.*;
import java.io.*;
class mobilenumber1
{
	public static void main(String args[])throws IOException
	{
		PrintWriter pw=new PrintWriter("ramesh.txt");
		Pattern p=Pattern.compile("(0|91)?[6789]?(0-9){9}");
		BufferedReader br=new BufferedReader(new FileReader("sai.txt"));
		String line=br.readLine();
		while(line !=null)
		{
		 Matcher m=p.matcher(line);
		 while(m.find())
			{
			 pw.println(m.group());
			}
			line=br.readLine();
		}
		pw.flush();
	
	}
}
