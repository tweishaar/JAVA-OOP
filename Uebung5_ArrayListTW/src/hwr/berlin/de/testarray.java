package hwr.berlin.de;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Vector;


public class testarray
{
	static List<Integer> zahlen = new ArrayList<>();
	static List<Integer> liste = new ArrayList<>();
	static Random rand = new Random();
	
	static 
	{
		zahlen.add(1);
		zahlen.add(2);
		zahlen.add(3);
		zahlen.add(4);
		zahlen.add(5);
		
		for(int i = 0; i<=24; i++)
		{
			liste.add(rand.nextInt(100));
		}
		Collections.sort(liste);//sortiert die Array-Liste
	}
	
	public static void getSpeedTest()
	{
		List<Integer> speedlist =  new ArrayList<>();
		long before_al = System.currentTimeMillis();
		for(int i = 0; i< 9999; i++)
		{
			speedlist.add(rand.nextInt(10000));
		}
		System.out.println("ArrayListe: " + Long.toString(System.currentTimeMillis() - before_al)+"ms");
		
		speedlist = new Vector<>();
		long before_v = System.currentTimeMillis();
		for(int i = 0; i< 9999; i++)
		{
			speedlist.add(rand.nextInt(10000));
		}
		System.out.println("Vektor: " + Long.toString(System.currentTimeMillis() - before_v)+"ms");
		
		speedlist = new LinkedList<>();

		long before_link = System.currentTimeMillis();
		for(int i = 0; i< 9999; i++)
		{
			speedlist.add(rand.nextInt(10000));
		}
		System.out.println("Linkedlist: " + Long.toString(System.currentTimeMillis() - before_link)+"ms");	
	}
	
	public static void setLottoZahlen()
	{
		BitSet bs = new BitSet(49);
		
		for(int i=0;i<6;i++)
		{
			int random = (rand.nextInt(49)+1);
			
			if(!bs.get(random))
			{
				bs.set(random);
			}
			else
			{
				i--;
			}
		}
		System.out.println("Die Lottozahlen lauten: "+bs);
	}
	
	public static void getMap()
	{
		HashMap<String, Double> price = new HashMap<String, Double>();
		price.put("Motor", 3500.0);
		price.put("Bremse", 400.0);
		price.put("Kupplung", 150.0);
		price.put("Reifen", 100.0);
		
		System.out.println(price);
		System.out.println("Der Preis einer Kupplung: "+price.get("Kupplung")+"€");
		System.out.println("Der Preis eines Motors: "+price.get("Motor")+"€");
	}
	
	public static void main(String[] args)
	{
		double resultSub = 0;
		double resultAdd = 0;
		double resultMult = 1;
		double resultDiv = 1;
		for(int i = 0; i<=4; i++)
		{
			resultSub = resultSub - zahlen.get(i);
			resultAdd = zahlen.get(i) + resultAdd;
			resultMult = zahlen.get(i) * resultMult;
			resultDiv = zahlen.get(i) / resultDiv;
		}
		System.out.println("Inhalt von der Liste -zahlen-: "+zahlen);
		System.out.println("Inhalt von der Liste -liste- mit 25 Werten sortiert: "+liste);
		System.out.println("Die Summe der Eintraege der Liste -zahlen- (Subtraktion): "+resultSub);
		System.out.println("Die Summe der Eintraege der Liste -zahlen- (Addition): "+resultAdd);
		System.out.println("Die Summe der Eintraege der Liste -zahlen- (Multiplikation): "+resultMult);
		System.out.println("Die Summe der Eintraege der Liste -zahlen- (Division): "+resultDiv);
		getSpeedTest();
		setLottoZahlen();
		getMap();
	}
	
}
