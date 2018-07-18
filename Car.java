public class Car{
	private int tyres;
	public Car(){}
	public Car(int tyres)
	{
	System.out.println("Car constr");
	
	}
	public void move()
	{
	System.out.println("Car moves");
	}
	public void setTyres(int tyres)
	{
	this.tyres= tyres;
	}
	public int getTyres()
	{
	return tyres;
	}
}