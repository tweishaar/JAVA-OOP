package Test5;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	public static void SpeedTest()
	{
		Random rnd = new Random(System.currentTimeMillis());
		ArrayList<Integer> source = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		Vector<Integer> v = new Vector<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		long oldTime;
		
		for (int i = 0; i < 10000; i++)
			source.add(rnd.nextInt());
		
		// arraylist
		oldTime = System.nanoTime();
		for (Integer i : source)
			al.add(i);
		System.out.println("Inserting 10k elements in an ArrayList took " + (System.nanoTime() - oldTime) + " nanos.");
		
		// vector
		oldTime = System.nanoTime();
		for (Integer i : source)
			v.add(i);
		System.out.println("Inserting 10k elements in a Vector took " + (System.nanoTime() - oldTime) + " nanos.");
		
		// linkedlist
		oldTime = System.nanoTime();
		for (Integer i : source)
			ll.add(i);
		System.out.println("Inserting 10k elements in a LinkedList took " + (System.nanoTime() - oldTime) + " nanos.");
	}
	
	public static void SortTest()
	{
		Random rnd = new Random(System.currentTimeMillis());
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int i = 0; i < 25; i++)
			ts.add(rnd.nextInt());
		
		System.out.print("Sorted entries: ");
		
		for (Integer i : ts)
			System.out.print(i.intValue() + " ");
		
		System.out.println();
	}
	
	public static void Lotto()
	{
		Random rnd = new Random(System.currentTimeMillis());
		BitSet bs = new BitSet(49);
		int currentIndex;
		
		for (int i = 0; i < 6; i++)
		{
			currentIndex = Math.abs(rnd.nextInt()) % 49;
			
			if (bs.get(currentIndex) == true)
				i--;
			else
				bs.set(currentIndex);
		}
		
		System.out.print("Lotto numbers: ");
		
		for (int i = 0; i < bs.size(); i++)
			if (bs.get(i) == true)
				System.out.print(i + " ");
	}
	
	public static void MapTest()
	{
		HashMap<String, Double> prices = new HashMap<String, Double>();
		
		prices.put("PI-Motor", 3.14);
		prices.put("E-Teil", 2.72);
		prices.put("Reifen", 20.85);
		prices.put("Leet-Stück", 1337.0);
		prices.put("Standard-Ding", 08.15);
		
		System.out.println("Reifenpreis: " + prices.get("Reifen"));
	}
	
	public static void main(String[] args)
	{
		Random rnd = new Random(System.currentTimeMillis());
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> substractedList = new ArrayList<Integer>();
		ArrayList<Integer> multipliedList = new ArrayList<Integer>();
		ArrayList<Double> dividedList = new ArrayList<Double>();
		
		int summe = 0;
		
		for (int i = 0; i < 5; i++)
			list.add(rnd.nextInt());
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("List index " + i + " is " + list.get(i));
			summe += list.get(i);
			substractedList.add(list.get(i).intValue() - 2);
			multipliedList.add(list.get(i).intValue() * 2);
			dividedList.add(list.get(i).doubleValue() / 2.0);
		}
		
		System.out.println("Summe: " + summe);
		
		
		SortTest();
		SpeedTest();
		MapTest();
		Lotto();
	}

}
