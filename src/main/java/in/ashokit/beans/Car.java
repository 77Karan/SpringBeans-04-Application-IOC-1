package in.ashokit.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car 
{
	
	
	private Car()
	{
		System.out.println("creating a object of Car");
	}
	
	@Autowired              //Field Injection through reflection API
	private Engine eg;
	
	public void drive()
	{
		int start = eg.startEngine();
		if(start == 0)
		{
			System.out.println("Engine started sucessfully");
		}
		else
		{
			System.out.println("repire engine");
		}
	}

}
