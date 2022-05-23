package com.second_solution;

public class Ticket {
	private  int ticketid;
	private int price;
	private static int availableTickets;
	
	public int setNoofBooking(int NoofBooking) {
		
		return NoofBooking;
	}
	 
	public int getTicketId() {
    	return ticketid;
	}
	
	public void setTicketId(int ticketid) {
    	this.ticketid = ticketid;
    }
	
	public int getPrice() {
    	return price;
	}
	
	public void setPrice(int price) {
    	this.price = price;
    }
	
	public int getAvailableTickets() {
    	return availableTickets;
	}
	
	public void setAvailableTickets(int availableTickets) {
		if(availableTickets<=0) {
			System.out.println(0);
		}
		else {
			this.availableTickets = availableTickets;
		}
    }
	
	public int calculateTicketCost(int nooftickets) {
		if(getAvailableTickets()>=nooftickets) {
			this.availableTickets = getAvailableTickets()-nooftickets;
			int TotalAmount = nooftickets*price;
			return TotalAmount;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
