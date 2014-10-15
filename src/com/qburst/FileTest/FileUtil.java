package com.qburst.FileTest;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class FileUtil {
	    public String inputFilePath, outputFilePath;
	    public String originalFileContent;
	    /**
	     * @param args
	     */
	    public FileUtil(String inputFilePath, String outputFilePath) {
	        this.inputFilePath = inputFilePath;
	        this.outputFilePath = outputFilePath;
	    }
	    
	    public void readFile() throws IOException {
	        FileInputStream in = null;
	        try {
	            in = new FileInputStream(inputFilePath);
	            
	            BufferedReader br = new BufferedReader(new InputStreamReader(in));
	            String str = null;
	            StringBuffer orgText = new StringBuffer();
	            
	                str = (br.readLine());
	               
	                while(str != null){
	               this.originalFileContent=br.readLine();
	                    //orgText.append(str);
	                    str = (br.readLine());
	                }
	                //this.originalFileContent = orgText.toString();
	                if (br != null) {
	                    br.close();
	                }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (in != null) {
	                in.close();
	            }
	        }
	    }
	    
	    public void writeFile() throws IOException {
	        File file = new File(outputFilePath);
	        
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	        
	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bf = new BufferedWriter(fw);
	        
	        try {
	           String newStr = originalFileContent.replaceAll("[^0-9]", "");
	            bf.write(newStr);
	        	bf.write(originalFileContent);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (bf != null) {
	                bf.close();
	            }
	        }
	    }
	}

