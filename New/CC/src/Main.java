import java.util.*;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		Ticket ob=new Ticket();
		System.out.println("Enter no of bookings:");
		int n=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int noT=sc.nextInt();
		while(n>=1) {
			System.out.println("Enter the ticketid:");
			int id=sc.nextInt();
			System.out.println("Enter the price:");
			int price=sc.nextInt();
			System.out.println("Enter the no of tickets:");
			int nooft=sc.nextInt();
			System.out.println("Available tickets:"+Ticket.getAvailableTickets());
			System.out.println("Total amount:"+ob.calculateTicketCost(nooft));
			System.out.println("Available ticket after booking"+Ticket.getAvailableTickets());
		}
		
		
	}
}
