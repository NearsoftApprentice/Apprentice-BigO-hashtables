import java.util.*;
import java.io.*;

public class RandomGenerator {
	public static void main(String[] args){
		if (args.length  == 2) {
			try(FileOutputStream outputStream = new FileOutputStream(new File("insertions")); 	
				PrintWriter writter = new PrintWriter(new OutputStreamWriter(outputStream))){
		    	int bound = Integer.parseInt(args[0]);
		    	int insertions = Integer.parseInt(args[1]);
		    	Random random = new Random();				
				for (int i = 0; i < insertions; i++) {
					writter.println(random.nextInt(bound));
				}
		 	}catch (NumberFormatException nfe) {
		        System.err.println("Argumentos " + args[0] + " deben de ser un enteros");
		        System.exit(1);
		    }catch (IOException ioe) {
		        System.err.println("Error de escritura");
		        System.exit(1);
		    }
		}
	}
}
