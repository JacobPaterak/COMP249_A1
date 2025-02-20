import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		Vehicles v1 = new Vehicles();
		Cars c1 = new Cars();
		int choice=0;
		int Choice2 = 0;
		Gasoline_Car gc1 = new Gasoline_Car();
		Gasoline_Car gc2 = new Gasoline_Car();
		Gasoline_Car[] gc = new Gasoline_Car[5];
		Electric_Car[] ec = new Electric_Car[5];
		Clients[] All_Clients = new Clients[5];
		String name;
		String Changes_Name;
		int counter = 0;
		int delete_index = 0;
		
		
		
		do {
			
		System.out.println("Please choose");
		System.out.println("\t (1) Vehicle Management");
		System.out.println("\t (2) Client Management");
		System.out.println("\t (3) Leasing Operations");
		System.out.println("\t (4) Additional Operations");
		System.out.println("\t (5) Quit");
		choice = kb.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("(1) Add a vehicle");
			System.out.println("(2) Delete a vehicle");
			System.out.println("(3) Update a vehicle information");
			System.out.println("(4) List all vehicles by category");
			System.out.println("(5) Exit");
			Choice2 = kb.nextInt();
			switch(Choice2)
			{
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					break;
			}
			Choice2 = 0;
			case 2:
				System.out.println("(1) Add a client");
				System.out.println("(2) Edit a client");
				System.out.println("(3) Delete a client");
				System.out.println("(4) Exit");
				Choice2 = kb.nextInt();
				switch(Choice2)
				{
					case 1:
						System.out.println("Please enter the client's name");
						name = kb.next();
						All_Clients[counter] = new Clients(name);
						counter++;
						System.out.println("Client added");
						break;
					case 2:
						System.out.println("Please enter the client's name you wish to edit");
						name = kb.next();
						System.out.println("Please enter the client's new name");
						Changes_Name = kb.next();
						for(int i = 0; i < All_Clients.length; i++)
							if(All_Clients[i] != null) {
								if(All_Clients[i].getName().equals(Changes_Name))
								All_Clients[i].setName(name);
							}
						break;
					case 3:
						System.out.println("Please enter the client's name you wish to delete");
						name = kb.next();
						for(int i = 0; i < All_Clients.length; i++)
						{
							if(All_Clients[i] != null) {
								if (All_Clients[i].getName().equals(name)) {
									delete_index = i;
									All_Clients[i] = null;
									System.out.println("Client deleted");
								}
							}
						}
						for(int i = delete_index; i < All_Clients.length-1; i++)
							All_Clients[i] = All_Clients[i+1];


						break;
					case 4:
						break;
				}
				break;
			case 3:
				System.out.println("(1) Lease a vehicle to a client");
				System.out.println("(2) Return a vehicle from a client");
				System.out.println("(3) Show all vehicles leased by a client");
				System.out.println("(4) Show all leased vehicles");
				System.out.println("(5) Exit");
				switch(Choice2)
				{
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						break;
				}
			case 4:
				System.out.println("(1) Display the truck with the largest capacity");
				System.out.println("(2) Create a copy of the electric trucks array");
				System.out.println("(3) Exit");
				switch(Choice2)
				{
					case 1:
					case 2:
					case 3:
						break;
				}
		}
		}
		while(choice!=5);
		if(choice == 5)
			System.out.println("Thank you for using RoyalRentals");
		
		
		
		
	}
	public static void getLargestTruck()
	{
		
	}
	public static void copyVehicles()
	{
		
	}

}
