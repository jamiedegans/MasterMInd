package mastermind;

import java.util.Scanner;
import java.util.Random;

public class Mastermind
{

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	Helper helper = new Helper();
	
	
	for (String uitleg: helper.laatDeUitlegZien()) {System.out.println(uitleg);
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
	boolean debug = sc.nextBoolean();
	String[] codeVakjes = helper.kleurenCodeMaken();
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

	    String[] inputs = new String[4];

	    String[] codenControles =
	    { codenMakers[2], codenMakers[2], codenMakers[2], codenMakers[2] };

	    for (int inputPoging = 0; inputPoging < inputs.length; inputPoging++)
	    {
		inputs[inputPoging] = sc.next();
	    }
	    // controle
	    for (int indexLoop = 0; indexLoop < controles.length; indexLoop++)
	    {

		controles[indexLoop] = inputs[indexLoop].equalsIgnoreCase(codeVakjes[indexLoop]);
		if (controles[indexLoop])
		{
		    codenControles[indexLoop] = codenMakers[1];

		} else
		{
		    for (int loop = 0; loop < controles.length; loop++)
		    {

			if (inputs[indexLoop].equalsIgnoreCase(codeVakjes[loop]))
			{
			    codenControles[indexLoop] = codenMakers[0];
			    break;
			}
		    }

		}
	    }

	    for (String codenControle : codenControles)
	    {
		System.out.println(codenControle);
	    }
	    // dit na alles de laste controle het besluit

	    if (controles[0] && controles[1] && controles[2] && controles[3])
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
	    System.out.println("jammer je hebt de code niet dus je bent geen hacker de code was");
	    for (String codeVakje : codeVakjes)
	    {
		System.out.println(codeVakje);
	    }
	}
	sc.close();
    }
}