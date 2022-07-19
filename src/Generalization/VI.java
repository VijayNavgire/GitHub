package Generalization;

public class VI implements SimCard
{
	public void sms()
	{
		System.out.println("Free SMS : 50/Day");
	}

	@Override
	public void audioCalling() 
	{
		System.out.println("Audio Calling : 500 calls/Day");
	}

	@Override
	public void internet() 
	{
		System.out.println("Internet : 2.5 GB/Day");
	}
	
	public void newFeature()
	{
		System.out.println("VI New Feature : 5G Network");
	}

}
