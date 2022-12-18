package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}
	
	private void go_up() {
		State.Current_State = State.Moving_up;
		System.out.println("Current state: " + State.Current_State);
		current_Floor += 1;
		System.out.println("Current floor is: "+ current_Floor);
		
		if(current_Floor < dest_Floor) {
			go_up();
		}else if(current_Floor == dest_Floor) {
			arrive_atFloor();
		}
	}
	
	private void go_down() {
		State.Current_State = State.Moving_down;
		System.out.println("Current state: " + State.Current_State);
		current_Floor -= 1;
		System.out.println("Current floor is: "+ current_Floor);
		
		if(current_Floor > dest_Floor) {
			go_down();
		}else if(current_Floor == dest_Floor) {
			arrive_atFloor();
		}
	}
	
	private void exit() {
		System.out.println("You arrived at your destination floor");
	}

	private void arrive_atFloor() {
		State.Current_State = State.Idle;
		System.out.println("Current state: " + State.Current_State);
		
		if(current_Floor < dest_Floor) {
			go_up();
		}else if(current_Floor > dest_Floor) {
			go_down();
		}else {
			exit();
		}
	}

	
}
