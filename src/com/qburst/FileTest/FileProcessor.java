package com.qburst.FileTest;

	import java.io.IOException;
import java.util.Scanner;
import com.qburst.FileTest.FileUtil;
	public class FileProcessor {

	    /**
	     * @param args
	     * @throws IOException
	     */
	//test
	    public static void main(String[] args) throws IOException {
	        String inputFile = null, outputFile = null;
	        Scanner as = new Scanner(System.in);
	        System.out.println("Enter the file to read: ");
	        inputFile = as.nextLine();
	        
	        System.out.println("Enter the output file path to write: ");
	        outputFile = as.nextLine();
	        as.close();
	        FileUtil fu = new FileUtil(inputFile, outputFile);
	        fu.readFile();
	        fu.writeFile();
	       }

}
