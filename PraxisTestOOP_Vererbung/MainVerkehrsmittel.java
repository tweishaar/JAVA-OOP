package praxis.test.hwr.berlin.de;

import java.util.ArrayList;
import java.util.List;

public class MainVerkehrsmittel {
	
	
	static List<Verkehrsmittel> verkehrsmittel = new ArrayList<>();
	
	static {
		
		verkehrsmittel.add(new Ruderboot());
		
		for(int i = 1; i<=5; i++)
		{
			verkehrsmittel.add(new Hoverkraft());
		}
		for(int i = 1; i<=3; i++)
		{
			verkehrsmittel.add(new Faehre());
		}
		for(int i = 1; i<=4; i++)
		{
			verkehrsmittel.add(new Zug());
		}	
	}
	
	public static void getSummeTransportKapa() {
		int summeTransportKapa = 0;
		
			
			for(Verkehrsmittel object: verkehrsmittel) {
				
				  //System.out.println(object);
				  summeTransportKapa = object.transportKapa + summeTransportKapa;
				  
				  //summeTransportKapa = verkehrsmittel.get(i);	
				}	
			System.out.println("Summer der Transportkapazität = "+ (summeTransportKapa + 2)+" Personen");
		}
		
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Inhalt von der Liste -Verkehrsmittel-: "+verkehrsmittel);
		getSummeTransportKapa();

	}

}
