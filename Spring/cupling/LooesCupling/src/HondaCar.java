
public class HondaCar 
{
    private FourWheelerEnjine enjine;
    public HondaCar(FourWheelerEnjine enjine) 
    {
    	this.enjine=enjine;//looes cupling
    }
    public void enjineOn() 
    {
    	enjine.startEnjine();
    }
    public void enjineOff() 
    {
    	enjine.stopEnjine();
    }
}
