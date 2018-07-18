public class Bus{
	private int tyres;
	public Bus(){}
	public Bus(int tyres)
	{
	System.out.println("Bus constr");
	this.tyres=tyres;
	}
	public void move()
	{
	System.out.println("Bus moves");
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