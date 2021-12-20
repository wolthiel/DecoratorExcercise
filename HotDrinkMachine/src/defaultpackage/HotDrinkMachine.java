package defaultpackage;
import java.io.IOException;
import defaultpackage.HotDrinks.HotDrink;

public class HotDrinkMachine {
	public static void main(String[] args) throws IOException 
	{
		HotDrinks myHotDrinks = new HotDrinks();
		HotDrink myTea = myHotDrinks.new Tea();
		printInfo(myTea.getName(), myTea.getPrice());
		
		HotDrink myCoffee = myHotDrinks.new Coffee();
		printInfo(myCoffee.getName(), myCoffee.getPrice());
		
		HotDrink myCoffeeWithSugar = myHotDrinks.new SugarDecorator(myCoffee);
		printInfo(myCoffeeWithSugar.getName(),myCoffeeWithSugar.getPrice());
		
		HotDrink myCoffeeWithCream = myHotDrinks.new CreamDecorator(myCoffee);
		printInfo(myCoffeeWithCream.getName(),myCoffeeWithCream.getPrice());
		
		HotDrink myCoffeeWithTwoCreamsAndSugar = myHotDrinks.new CreamDecorator(myHotDrinks.new CreamDecorator(myHotDrinks.new SugarDecorator(myCoffee)));
		printInfo(myCoffeeWithTwoCreamsAndSugar.getName(),myCoffeeWithTwoCreamsAndSugar.getPrice());
	}
	private static void printInfo(String name, int total) {
		System.out.println("You have ordered: " + name + ". The total sum is: " + total + " cents.");		
	}
}