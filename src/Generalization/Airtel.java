package Generalization;

public class Airtel implements SimCard
{

	@Override
	public void sms() 
	{
		System.out.println("SMS : 100/Day");
	}

	@Override
	public void audioCalling() 
	{
		System.out.println("Audio Calling : 1000/Day");
	}

	@Override
	public void internet() 
	{
		System.out.println("Internet : 2.5 GB/Day");
	}

	public void newFeature()
	{
		System.out.println("Airtel New Feature : Wynk Free");
	}
	

}
