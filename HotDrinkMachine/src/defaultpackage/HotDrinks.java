package defaultpackage;

public class HotDrinks {

	public abstract class HotDrink 
	{
		protected int price = 0;
		protected String name = "";
		public abstract String getName();
		public abstract int getPrice();
	}
	
	public class Coffee extends HotDrink
	{
		protected int price = 60;
		protected String name = "Coffee";
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
	}
	
	public class Tea extends HotDrink
	{
		protected int price = 50;
		protected String name = "Tea";
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
	}
	
	public abstract class Decorator extends HotDrink
	{
		private HotDrink myDrink;
		
		public Decorator(HotDrink d)
		{
			myDrink = d;
		}
		
		@Override
		public String getName()
		{
			return myDrink.getName();
		}
		@Override
		public int getPrice()
		{
			return myDrink.getPrice();
		}
	}
	
	public class CreamDecorator extends Decorator
	{
		protected int price = 10;
		protected String name = "Cream";
		public CreamDecorator(HotDrink d) {
			super(d);
		}
		
		@Override
		public String getName( ) {
			return super.getName() + " + " + name;
		}
		@Override
		public int getPrice( ) {
			return price + super.getPrice();
		}
	}
	
	public class SugarDecorator extends Decorator
	{
		protected int price = 5;
		protected String name = "Sugar";
		public SugarDecorator(HotDrink d) {
			super(d);
		}
		
		@Override
		public String getName( ) {
			return super.getName() + " + " + name;
		}
		@Override
		public int getPrice( ) {
			return price + super.getPrice();
		}
	}
}