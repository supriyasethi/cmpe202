

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		GumballMachine gumballMachine1 = new GumballMachine(5);
		GumballMachine gumballMachine2 = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		gumballMachine1.insertQuarter(25);
		gumballMachine1.turnCrank();
	}
}
