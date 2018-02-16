class VariablesandNames
{
    public static void main( String[] args )
    {

	//declares interger (whole number) variables
        int cars, drivers, passengers, cars_not_driven, cars_driven;
	//declares double (decimal number) variables
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

	//assignes vaules to each variables declared above
	//sets initial number of cars to 100
        cars = 100;
	//sets space in car
        space_in_a_car = 4.0;
	//sets number of drivers
        drivers = 30;
	//sets number of passengers
        passengers = 90;
	//mathematically declares variables by evaluating above varialbes
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

	//print statements with updated variables
        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
