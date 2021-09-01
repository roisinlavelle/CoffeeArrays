import java.util.ArrayList;

public class CoffeeExercise {
	
	public static void coffeeOrders() {
	
	ArrayList<String> ordersArray = new ArrayList<>();
	ArrayList<String> doneOrdersArray = new ArrayList<>();
	
	// Add a new order to the orders array
	ordersArray.add("Small Espresso w/ Chocolate");
	ordersArray.add("Large Cold Brew w/ Double Shot");
	ordersArray.add("Medium Flat White");
	ordersArray.add("Large Choc Cookie Frappe w/ sugar free syrup");
	ordersArray.add("Small Caramel Iced Latte w/ honeycomb dust");
	ordersArray.add("Small Americano");
	ordersArray.add("Large Cafe Au Lait w/ extra milk");
	ordersArray.add("Medium Strawberry Iced Tea");
	
	
	// Return the name of the order
	System.out.println(ordersArray);
	
	// Modify the order (passing in a string)
	ordersArray.set(0, "Medium Cappucino w/ Oat Milk");
	System.out.println(ordersArray.get(0));
	System.out.println(ordersArray);
	
	// Remove the order from the orders array
	ordersArray.remove(0);
	System.out.println(ordersArray);
	
	//Add the order to the doneOrders array
	doneOrdersArray.add("Medium Cappucino w/ Oat Milk");
	System.out.println(doneOrdersArray);
	
	// Print the length of the orders and doneOrders
	System.out.println(ordersArray.size());
	System.out.println(doneOrdersArray.size());
	
	// Clear either or both of the arrays
	System.out.println("Before the clear " + doneOrdersArray);
	doneOrdersArray.clear();
	System.out.println("After the clear " + doneOrdersArray);
	
	// Stretch - Using Multi Dimensional split the orders into size, drink and extras
	String[][] coffeeArray = { {"Small", "Medium", "Large"}, 
			{"Espresso", "Cold Brew", "Flat White", "Choc Cookie Frappe", "Caramel Iced Latte", "Americano", "Cafe au Lait", "Strawberry Iced Tea"}, 
			{"w/ choco", "w/ double shot", "w/ sugar free syrup", "w/ honeycomb dust", "w/ extra milk"} };
	
	System.out.println(coffeeArray[0][1]);
	System.out.println(coffeeArray[1][2]);
	System.out.println(coffeeArray[2][3]);
	

}
}