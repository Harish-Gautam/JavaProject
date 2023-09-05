
public class App 
{
   public static void main(String[] args) 
   {
	 HondaCar car1=new HondaCar(new DisalEnjine());
	 HondaCar car2=new HondaCar(new CNG());
	 HondaCar car3=new HondaCar(new PetrolEnjine());
	 car1.enjineOn();
	 car2.enjineOn();
	 car3.enjineOn();
   }
}
