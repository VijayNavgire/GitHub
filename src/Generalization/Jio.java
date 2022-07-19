package Generalization;

public class Jio implements SimCard
{
	public void sms()
	{
		System.out.println("FREE SMS : No SMS");
	}

	@Override
	public void audioCalling() 
	{
		System.out.println("Audio Calling : Unlimited");
	}
	@Override
	public void internet() 
	{
		System.out.println("Internet : 2 GB/ Day");		
	}
	public void newFeatureA()
	{
		System.out.println("New Feature : Dialer Tune");
	}

}
