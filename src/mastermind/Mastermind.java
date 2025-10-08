package mastermind;

import java.util.Scanner;

public class Mastermind
{

    public static void main(String[] args)
    {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Raad de code met de kleuren rood, blauw, groen, paars en geel.");
	System.out.println("Als je WIT krijgt zit de pion in de kleurencode, alleen op de verkeerde plek.");
	System.out.println("Krijg je ZWART te zien dan staat de pion met de juiste kleur op de juiste plek.");
	System.out.println("Indien je NIETS krijgt staat de gekozen pion niet in de kleurencode. Succes hacker!!!");

	// de kleuren van het spell, Rood, Blauw, Groen, Paars, Geel, Wit, Zwart
	String rood = "Rood";
	String blauw = "Blauw";
	String groen = "Groen";
	String paars = "Paars";
	String oranje = "Oranje";
	String geel = "Geel";

	// code maker
	String wit = "Wit";
	String zwart = "Zwart";
	String niets = "niets";
	
	// code van de game
	String codeVakje1 = blauw;
	String codeVakje2 = blauw;
	String codeVakje3 = blauw;
	String codeVakje4 = blauw;

	boolean hebIkGewonnen = false;

	// codingpoging

	for (int i = 0; i < 10; i = i + 1)
	{
	    System.out.println("poging " + (i + 1));
	    System.out.println("Raad de code met de kleuren rood, blauw, groen, paars en geel.");
	    String input1_1 = sc.next();
	    String input1_2 = sc.next();
	    String input1_3 = sc.next();
	    String input1_4 = sc.next();

	    // controle

	    boolean controle1 = input1_1.equalsIgnoreCase(codeVakje1);
	    if (controle1)
	    {
		System.out.println(zwart);
	    } else if (input1_1.equalsIgnoreCase(codeVakje2) || input1_1.equalsIgnoreCase(codeVakje3)
		    || input1_1.equalsIgnoreCase(codeVakje4))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println("...");
	    }

	    boolean controle2 = input1_2.equalsIgnoreCase(codeVakje2);
	    if (controle2)
	    {
		System.out.println(zwart);
	    } else if (input1_2.equalsIgnoreCase(codeVakje1) || input1_2.equalsIgnoreCase(codeVakje3)
		    || input1_2.equalsIgnoreCase(codeVakje4))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println("...");
	    }

	    boolean controle3 = input1_3.equalsIgnoreCase(codeVakje3);
	    if (controle3)
	    {
		System.out.println(zwart);
	    } else if (input1_3.equalsIgnoreCase(codeVakje1) || input1_3.equalsIgnoreCase(codeVakje2)
		    || input1_3.equalsIgnoreCase(codeVakje4))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println("...");
	    }

	    boolean controle4 = input1_4.equalsIgnoreCase(codeVakje4);
	    if (controle4)
	    {
		System.out.println(zwart);
	    } else if (input1_4.equalsIgnoreCase(codeVakje1) || input1_4.equalsIgnoreCase(codeVakje2)
		    || input1_4.equalsIgnoreCase(codeVakje3))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println("...");
	    }
	    
	    // dit na alles de laste controle het besluit
	    
	    if (controle1 && controle2 && controle3 && controle4)
	    {
		i = 10;
		hebIkGewonnen = true;
	    }

	}
	if (hebIkGewonnen == true)
	{
	    System.out.println("je hebt de code gehackt hacker. Jij bent de winnar");
	} else
	{
	    System.out.println("jammer je hebt de code niet dus geen hacker LOSER");
	}
	sc.close();
    }
}