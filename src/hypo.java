
public class hypo
{
	public double hypoPrior;
	public double hypoCherry;
	public double hypoLime;
	
	public static double round(double val, int place)
	{
	    if (place < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, place);
	    val = val * factor;
	    return (double) val / factor;
	}
	
	public hypo(double prior,double cherry,double lime)
	{
		round(prior,5);
		hypoPrior=prior;
		round(cherry,5);
		hypoCherry=cherry;
		round(lime,5);
		hypoLime=lime;
	}
	
}