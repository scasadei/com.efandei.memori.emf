package casadei.memori.graph;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UniformDataVector<String> strings = new UniformDataVector<String>(casadei.memori.datatype.JavaString.INSTANCE);
		
		String s = File.separator;
		// String rootdirpath = "G:"+s+"core"+s+"sclab"+s+"proj"+s+"emoria"+s+"lib"+s+"@memori";
		// String command = "sfk150 list -sort -time -size -justdirs " + rootdirpath;
		// String command = ("sfk150 list " + rootdirpath);
		String command = "sfk150 list G:\\myaudio";
		// String command = "javac";
		
		 
		try { 
			Process proc = Runtime.getRuntime().exec(command);
			System.out.println("executing: " + command);
			BufferedReader stderr_br = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
			BufferedReader stdout_br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String aLine = null;
			if (stderr_br.ready()) { 
				System.out.println("<ERROR>");
				while ((aLine = stderr_br.readLine()) != null) {
					System.out.println(aLine); 
					aLine = stderr_br.readLine();
				}
				System.out.println("<ERROR>");
			}
			

			 System.out.println("<OUTPUT>");
			 while ( (aLine = stdout_br.readLine()) != null) 
	             System.out.println(aLine);
			 System.out.println("<OUTPUT>");

            int exitVal = proc.waitFor();
            System.out.println("Process exitValue: " + exitVal);
			BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			int lineNumber = 0;
			System.out.println(lineNumber);
			while (br.ready()) {
				lineNumber++;
				System.out.println(lineNumber + br.readLine()); 
			}
			br.close(); 
			} 
		//catch (IOException e) {
		//	System.out.println("IOException thrown");
		//} 	
		catch (Throwable t)
        {
          t.printStackTrace();
        }

		if (true)
			return;
	
		String topdirname = "G:"+s+"core"+s+"__any";
		File topdir = new File(topdirname);
		if (topdir.isDirectory()) {
			File[] filelist = topdir.listFiles();
			for (int i=0; i<filelist.length; i++) {
				System.out.println(filelist[i].getName());
				strings.addDataNode(filelist[i].getName());
			}
		}
		else
			System.out.println(topdirname + " is not a dir");
		
		for (int i=0; i<strings.size(); i++)
			System.out.println(i+": "+strings.inode.toString(i));
			
	}
	

}
