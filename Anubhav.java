public class Anubhav
{
	public static void main(String[] args)
	{
	System.out.println("My first program:"+ args[0]);
	Car c=new Car(6);
	c.move();
	//c.setTyres(5);
	
	System.out.println("Car tyres=" +c.getTyres());
	Car c1=new Car(); 
        Bus b=new Bus(7);
	b.setTyres(7);
	b.move(); 
	}
}
