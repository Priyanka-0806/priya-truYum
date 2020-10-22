
public class Ticket {
	public int ticketid;
	public int price;
	public static int availableTickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets>1)
		Ticket.availableTickets = availableTickets;
	}
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets<=availableTickets) {
			Ticket.setAvailableTickets(this.availableTickets-nooftickets);
		return nooftickets*price;}
		else 
			return -1;
		}
}
	
	

