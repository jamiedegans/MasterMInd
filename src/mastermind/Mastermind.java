package mastermind;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Mastermind
{

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	Helper helper = new Helper();

	for (String uitleg : helper.laatDeUitlegZien())
	{
	    System.out.println(uitleg);
	}
	// de kleuren van het spell, Rood, Blauw, Groen, Paars, Geel, Wit, Zwart
	// code maker
	String[] codenMakers =
	{ "Wit ", "Zwart", "Niets" };
	// code van de game'
	boolean hebIkGewonnen = false;
	// de controle van het spell
	boolean[] controles = new boolean[4];
	// codingpoging

	String[] codeVakjes = helper.kleurenCodeMaken();
	boolean debug = false;
	try
	{
	    debug = sc.nextBoolean();
	} catch (InputMismatchException ex)
	{
	    System.out.println("verkeerde input debug staat uit");
	}
	
	if (debug)
	{
	    System.out.println("de code is ");
	    for (String codeVakje : codeVakjes)
	    {
		System.out.println(codeVakje);
	    }
	}

	for (int i = 0; i < 10; i = i + 1)
	{
	    System.out.println("poging " + (i + 1));
	    System.out.println("Raad de code met de kleuren rood, blauw, groen, paars en geel.");

	    helper.deInput();

	    for (String codenControle : helper.deControle())
	    {
		System.out.println(codenControle);
	    }
	    // dit na alles de laste controle het besluit

	    if (helper.isCodeGuessed())
            {
                hebIkGewonnen = true;
               break; // Stop de loop direct
            }
        }
	
	if (hebIkGewonnen == true)
	{
	    System.out.println("je hebt de code gehackt hacker. Jij bent de winnar");
	} else
	{
	    System.out.println("jammer je hebt de code niet dus je bent geen hacker de code was");
	    for (String codeVakje : helper.codeVakjes)
	    {
		System.out.println(codeVakje);
	    }
	}
	sc.close();
    }
}