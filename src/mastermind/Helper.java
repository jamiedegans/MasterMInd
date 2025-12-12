package mastermind;

import java.util.Random;

public class Helper
{

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
	// de kleuren van het spel, Rood, Blauw, Groen, Paars, Geel, Wit, Zwart
	String [] kleuren =
	{ "Rood", "Blauw", "Groen", "Paars", "Oranje", "Geel" };
	
	
	String[] codeVakjes = new String[4];
	
	Random rand = new Random();
	for (int i = 0; i < codeVakjes.length; i++)
	{
	    codeVakjes[i] = kleuren[rand.nextInt(kleuren.length)];
	}
	return codeVakjes;
	
    }

}
