package serial.test.hwr.berlin.de;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Auto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7609946943214459090L;
	private int ps;
	private String motor;
	private String farbe;

	
	public Auto(){
		
	}
	
	
	public Auto(int ps, String motor, String farbe) {
		this.motor = motor;
		this.ps = ps;
		this.farbe = farbe;
	}
	public static void writer(){
		OutputStream outputStream = null;
        try
        {
            // Byteorientierten Ausgabekanal Öffnen
            outputStream = new FileOutputStream("dataAuto.ser");
 
            // Objektausgabekanal für Serialisierung Öffnen
            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
 
            // Objekte serialisiert in Datei ausgeben
            objectOutput.writeObject("Ausgabe: ");
            objectOutput.writeObject(new Auto(300, "Benziner", "Blau"));
            Auto golf = new Auto();
            golf.setPs(400);
            golf.setMotor("Übelst Krass");
            golf.setFarbe("Schwarz");
            objectOutput.writeObject(golf);
            
            
            
            // Ausgabekanal schließen
            objectOutput.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                outputStream.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
	}
	
	public static void reader(){
		try
        {
            // Serialisiertes Objekt
            FileInputStream inputStream = new FileInputStream("dataAuto.ser");
            // Deserialisierung
            ObjectInputStream objectInput = new ObjectInputStream(inputStream);
            // String auslesen
            String text = (String) objectInput.readObject();
            Auto auto = (Auto) objectInput.readObject();
            Auto golf = (Auto) objectInput.readObject();
             
            System.out.println(text);
            System.out.println("Dieses Auto wurde erstellt: " + auto);
            System.out.println("Dieses Auto wurde erstellt: " + golf);
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		Auto.writer();
		Auto.reader();
	
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String toString(){
		return "Auto(ps: " + this.ps + "; Motor: " + this.motor + "; Farbe: " + this.farbe + ")";
	}
}
