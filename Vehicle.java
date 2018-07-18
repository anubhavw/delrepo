public abstract class Vehicle{
	private int tyres;
	public Vehicle(){}
	public Vehicle(int tyres)
	{
	this.tyres=tyres;
	
	}
	public void move()
	{
	System.out.println("Vehicle moves");
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