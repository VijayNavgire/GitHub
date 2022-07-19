package Generalization;

public class GeneralizationTest 
{
	public static void main(String[] args) 
	{
		System.out.println("\n-----Feature's of Jio Sim Card-----\n");
		Jio j = new Jio();
		j.sms();
		j.audioCalling();
		j.internet();
		j.newFeatureA();
		
		System.out.println("\n-----Feature's of VI Sim Card-----"+ "\n");
		VI i = new VI();
		i.sms();
		i.audioCalling();
		i.internet();
		i.newFeature();
		
		System.out.println("\n-----Feature's of Airtel Sim Card-----\n");
		Airtel a = new Airtel();
		a.sms();
		a.audioCalling();
		a.internet();
		a.newFeature();
				
		
	}

}
