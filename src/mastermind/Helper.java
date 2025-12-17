package mastermind;

import java.util.Random;
import java.util.Scanner;

public class Helper
{

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    // de kleuren van het spel, Rood, Blauw, Groen, Paars, Geel, Wit, Zwart
    String[] kleuren =
    { "Rood", "Blauw", "Groen", "Paars", "Oranje", "Geel" };

    String[] codenMakers =
    { "Wit ", "Zwart", "Niets" };

    String[] codenControles =
    { codenMakers[2], codenMakers[2], codenMakers[2], codenMakers[2] };

    String[] codeVakjes = new String[4];

    boolean[] controles = new boolean[4];

    String[] inputs = new String[4];

    // -----------------------------------------------------------------------------------------------------

    public String[] laatDeUitlegZien()
    {
	String[] uitleg =
	{ "Raad de code met de kleuren rood, blauw, groen, paars en geel.",
		"Als je WIT krijgt zit de pion in de kleurencode, alleen op de verkeerde plek.",
		"Krijg je ZWART te zien dan staat de pion met de juiste kleur op de juiste plek.",
		"Indien je NIETS krijgt staat de gekozen pion niet in de kleurencode. Succes hacker!!!" };
	return uitleg;
    }

    public String[] kleurenCodeMaken()
    {

	for (int i = 0; i < codeVakjes.length; i++)
	{
	    codeVakjes[i] = kleuren[rand.nextInt(kleuren.length)];
	}
	return codeVakjes;

    }

    public void deInput()
    {

	for (int inputPoging = 0; inputPoging < inputs.length; inputPoging++)
	{

	    inputs[inputPoging] = sc.next();
	}

    }

    public String[] deControle()
    {

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
	return codenControles;

    }
}
