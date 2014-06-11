package read.write.files.org;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class MainClass {

	public static void getHelloWorld(){
		System.out.println("Hello Tino");
	}
	public static void main(String argv[]) {
		// File path
		Path path = Paths.get(System.getProperty("user.home"), "dev","workspace","readwritefiles",
				"Textfile_new2.txt");
		
		// Getting bulk attributes
		BasicFileAttributes attributes = null;
		try {
			attributes = Files.readAttributes(path, BasicFileAttributes.class);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		// Retrieving information
		StringBuilder outBuff = new StringBuilder();
		
		outBuff.append("File: " + path);
		outBuff.append("\n");
		outBuff.append("\t").append("tsize: " + attributes.size());
		outBuff.append("\n");
		outBuff.append("\t").append("creationTime: " + attributes.creationTime());
		outBuff.append("\n");
		outBuff.append("\t").append("lastAccessTime: " + attributes.lastAccessTime());
		outBuff.append("\n");
		outBuff.append("\t").append("lastModifiedTime: " + attributes.lastModifiedTime());
		outBuff.append("\n");
		outBuff.append("\t").append("isRegularFile: " + attributes.isRegularFile());
		outBuff.append("\n");
		outBuff.append("\t").append("isDirectory: " + attributes.isDirectory());
		outBuff.append("\n");
		outBuff.append("\t").append("isSymbolicLink: " + attributes.isSymbolicLink());
		outBuff.append("\n");
		outBuff.append("\t").append("isOther: " + attributes.isOther());
		outBuff.append("\n");
		
		System.out.println(outBuff.toString());
	}
}