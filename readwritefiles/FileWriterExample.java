package read.write.files.org;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;


public class FileWriterExample{
  

  FileWriter writer;
  File file;
  public void getFileAttributes(){
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
  public boolean createDummyFile(String filename, long size)
  {
   try
  {
      // Create file 
      FileWriter fw = new FileWriter(filename);
          BufferedWriter out = new BufferedWriter(fw);
      for(long i=0; i<size; i++)
      out.write(0);
      //Close the output stream
      out.close();
      }
  catch (Exception e)
  {
        System.err.println("Error: " + e.getMessage());
  return false;
      }
  return true;
  }
  public void schreiben(){
    // File anlegen
     file = new File("Textfile_new2.txt");
     try {
    
       // new FileWriter(file ,true) - falls die Datei bereits existiert
       // werden die Bytes an das Ende der Datei geschrieben
       
       // new FileWriter(file) - falls die Datei bereits existiert
       // wird diese überschrieben
       writer = new FileWriter(file ,true);
       
       // Text wird in den Stream geschrieben
       writer.write("Hallo");
       
       // Platformunabhängiger Zeilenumbruch wird in den Stream geschrieben
       writer.write(System.getProperty("line.separator"));

       // Text wird in den Stream geschrieben       
       writer.write("Grüß Gott!");
       
       
       // Schreibt den Stream in die Datei
       // Sollte immer am Ende ausgeführt werden, sodass der Stream 
       // leer ist und alles in der Datei steht.
       writer.flush();
       
       // Schließt den Stream
       writer.close();
       System.out.println("Die Datei "+ file + " wurde erstellt.");
       System.out.println("Dateipfad: " + file.getAbsolutePath());
       System.out.println("Name     = " + file.getName());
       System.out.println("FreeSpace    = " + file.getFreeSpace());
       

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public void lesen() {
	  try {
		  BufferedReader br = new BufferedReader(new FileReader("Textfile_new2.txt"));
		  String zeile;
		  try {
			  System.out.println("Inhalt der Datei "+ file + " lautet:");
			  while ((zeile = br.readLine()) != null) {
				  System.out.println(zeile);
			  }
		  } catch (IOException e) {
			  e.printStackTrace();
		  }
	  	} catch (FileNotFoundException e1) {
	  		e1.printStackTrace();
	  	}
  }
  public static void main(String[] args) {
	  
    FileWriterExample fileWriterExample = new FileWriterExample();
    fileWriterExample.schreiben();
    fileWriterExample.lesen();
    fileWriterExample.createDummyFile("test_dummy.txt", 1048576);
    fileWriterExample.getFileAttributes();
    //MainClass.main(args);
    //MainClass.getHelloWorld();
  }
}