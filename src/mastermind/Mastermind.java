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
	String rood = " Rood";
	String blauw = " Blauw ";
	String groen = " Groen ";
	String paars = " Paars ";
	String oranje = " Oranje ";
	String geel = " Geel ";

	// code maker
	String wit = "Wit";
	String zwart = "Zwart";
	String niets = "Niets";
	
	// code van de game
	String codeVakje1 = blauw;
	String codeVakje2 = blauw;
	String codeVakje3 = blauw;
	String codeVakje4 = blauw;

	boolean hebIkGewonnen = false;
	
	// de controle van het spell
	  boolean controle1;
	  boolean controle2;
	  boolean controle3;
	  boolean controle4;

	// codingpoging

	for (int i = 0; i < 10; i = i + 1)
	{
	    System.out.println("poging " + (i + 1));
	    System.out.println("Raad de code met de kleuren rood, blauw, groen, paars en geel.");
	    String input1 = sc.next();
	    String input2 = sc.next();
	    String input3 = sc.next();
	    String input4 = sc.next();

	    // controle

	    controle1 = input1.equalsIgnoreCase(codeVakje1);
	    if (controle1)
	    {
		System.out.println(zwart);
	    } else if (input1.equalsIgnoreCase(codeVakje2) || input1.equalsIgnoreCase(codeVakje3)
		    || input1.equalsIgnoreCase(codeVakje4))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println(niets);
	    }

	    controle2 = input2.equalsIgnoreCase(codeVakje2);
	    if (controle2)
	    {
		System.out.println(zwart);
	    } else if (input2.equalsIgnoreCase(codeVakje1) || input2.equalsIgnoreCase(codeVakje3)
		    || input2.equalsIgnoreCase(codeVakje4))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println(niets);
	    }

	    controle3 = input3.equalsIgnoreCase(codeVakje3);
	    if (controle3)
	    {
		System.out.println(zwart);
	    } else if (input3.equalsIgnoreCase(codeVakje1) || input3.equalsIgnoreCase(codeVakje2)
		    || input3.equalsIgnoreCase(codeVakje4))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println(niets);
	    }

	    controle4 = input4.equalsIgnoreCase(codeVakje4);
	    if (controle4)
	    {
		System.out.println(zwart);
	    } else if (input4.equalsIgnoreCase(codeVakje1) || input4.equalsIgnoreCase(codeVakje2)
		    || input4.equalsIgnoreCase(codeVakje3))
	    {
		System.out.println(wit);
	    } else
	    {
		System.out.println(niets);
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
	    System.out.println("jammer je hebt de code niet dus je bent geen hacker de code was" + codeVakje1 + codeVakje2 + codeVakje3 + codeVakje4);
	}
	sc.close();
    }
}